#!/usr/bin/env python3
"""Compile isolated solutions, run prepared regression cases and existing demos."""
import argparse
import concurrent.futures
import json
import os
from pathlib import Path
import re
import shutil
import subprocess
import tempfile

ROOT = Path(__file__).resolve().parents[1]


def command(arguments, timeout=25):
    result = subprocess.run(arguments, capture_output=True, text=True, timeout=timeout)
    if result.returncode:
        raise RuntimeError(result.stdout + result.stderr)
    return result.stdout


def verify(source, cases, javac, java):
    relative = source.relative_to(ROOT).as_posix()
    with tempfile.TemporaryDirectory(prefix='dsa-java-') as temporary:
        work = Path(temporary)
        local_source = work / source.name
        shutil.copyfile(source, local_source)
        inputs = [str(local_source)]
        code = source.read_text(encoding='utf-8')
        for node in ('TreeNode', 'ListNode'):
            if re.search(r'\b' + node + r'\b', code) and not re.search(r'class\s+' + node + r'\b', code):
                destination = work / (node + '.java')
                shutil.copyfile(ROOT / 'tests' / 'support' / (node + '.java'), destination)
                inputs.append(str(destination))
        has_case = relative in cases
        if has_case:
            test = work / 'RegressionTest.java'
            shutil.copyfile(ROOT / cases[relative], test)
            inputs.append(str(test))
        command([javac, '-encoding', 'UTF-8', '-d', temporary, *inputs])
        if has_case:
            command([java, '-ea', '-cp', temporary, 'RegressionTest'])
        has_main = bool(re.search(r'public\s+static\s+void\s+main\s*\(', code))
        if has_main:
            command([java, '-cp', temporary, source.stem])
        return relative, has_case, has_main


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument('--new-only', action='store_true', help='run only sources with regression cases')
    parser.add_argument('--jobs', type=int, default=4)
    args = parser.parse_args()
    java_home = os.environ.get('JAVA_HOME')
    suffix = '.exe' if os.name == 'nt' else ''
    javac = str(Path(java_home) / 'bin' / ('javac' + suffix)) if java_home else shutil.which('javac')
    java = str(Path(java_home) / 'bin' / ('java' + suffix)) if java_home else shutil.which('java')
    if not javac or not java:
        parser.error('Install JDK 17 or newer and put javac/java on PATH, or set JAVA_HOME.')
    cases = {item['source']: item['test'] for item in json.loads((ROOT / 'tests/cases.json').read_text())}
    sources = sorted((ROOT / '00-DSA-Roadmap').rglob('*.java'))
    if args.new_only:
        sources = [source for source in sources if source.relative_to(ROOT).as_posix() in cases]
    outcomes, errors = [], []
    with concurrent.futures.ThreadPoolExecutor(max_workers=args.jobs) as pool:
        futures = {pool.submit(verify, source, cases, javac, java): source for source in sources}
        for future in concurrent.futures.as_completed(futures):
            try:
                outcomes.append(future.result())
            except Exception as error:
                errors.append(f'{futures[future].relative_to(ROOT)}: {error}')
    for error in errors:
        print('FAIL', error)
    print(f'Java sources compiled: {len(outcomes)}/{len(sources)}; '
          f'regression suites passed: {sum(row[1] for row in outcomes)}; '
          f'runnable demos passed: {sum(row[2] for row in outcomes)}')
    raise SystemExit(bool(errors))


if __name__ == '__main__':
    main()
