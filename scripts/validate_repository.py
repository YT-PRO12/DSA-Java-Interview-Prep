#!/usr/bin/env python3
"""Check roadmap inventory, canonical IDs, generated indexes and Markdown links."""
import argparse
import hashlib
import json
from pathlib import Path
import re
import subprocess
import sys
from urllib.parse import unquote, urlsplit

ROOT = Path(__file__).resolve().parents[1]


def require(condition, message):
    if not condition:
        raise AssertionError(message)


def git_blob(data):
    return hashlib.sha1(b'blob ' + str(len(data)).encode() + b'\0' + data).hexdigest()


def heading_anchors(path):
    anchors = set()
    occurrences = {}
    text = re.sub(r'```.*?```', '', path.read_text(encoding='utf-8'), flags=re.S)
    for heading in re.findall(r'^#{1,6}\s+(.+)$', text, flags=re.M):
        heading = re.sub(r'[`*_]', '', heading).strip().lower()
        base = ''.join(c for c in heading if c.isalnum() or c in ' -_').replace(' ', '-')
        count = occurrences.get(base, 0)
        occurrences[base] = count + 1
        anchors.add(base if count == 0 else f'{base}-{count}')
    return anchors


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument('--preservation', action='store_true')
    args = parser.parse_args()
    roadmap = ROOT / '00-DSA-Roadmap'
    topics = json.loads((ROOT / 'docs/topics.json').read_text(encoding='utf-8'))
    expected = [t['directory'] for t in topics]
    require(len(expected) == 16, 'Expected 16 chapters through BST.')
    require(sorted(p.name for p in roadmap.iterdir() if p.is_dir()) == expected, 'Unexpected topic folders.')
    catalog = json.loads((ROOT / 'docs/catalog.json').read_text())['problems']
    ids = [p['id'] for p in catalog]
    require(len(ids) == len(set(ids)), 'Duplicate canonical LeetCode ID.')
    seen = []
    fundamentals = []
    all_sources = list(roadmap.rglob('*.java'))
    for topic in topics:
        folder = roadmap / topic['directory']
        require((folder/'README.md').is_file(), f'Missing topic README: {folder}')
        require(any(folder.rglob('*.java')), f'Empty topic: {folder}')
        for child in folder.iterdir():
            if child.is_dir():
                if child.name == 'Fundamentals':
                    for exercise in child.iterdir():
                        require(exercise.is_dir() and any(exercise.glob('*.java')), f'Empty fundamental: {exercise}')
                        fundamentals.append(exercise)
                else:
                    require(re.match(r'^\d{4}-[A-Za-z0-9-]+$',child.name),f'Invalid problem folder: {child}')
                    seen.append(child.relative_to(ROOT).as_posix())
    require(set(seen) == {p['directory'] for p in catalog}, 'Catalog does not match actual problem folders.')
    for problem in catalog:
        folder = ROOT / problem['directory']
        expected_name = f"{problem['id']:04d}-" + re.sub(r'[^A-Za-z0-9]+','-',problem['title']).strip('-')
        require(folder.name == expected_name, f'ID/title mismatch: {folder}')
        source = ROOT / problem['solution']
        require(source.is_file() and source.parent == folder, f'Missing canonical source: {source}')
        require(problem['difficulty'] in ('Easy','Medium','Hard'), f'Invalid difficulty: {folder}')
        require(re.fullmatch('[a-z0-9-]+',problem['slug']),f'Invalid official slug: {folder}')
    case_index=json.loads((ROOT/'tests/cases.json').read_text())
    require(len({x['source'] for x in case_index})==len(case_index),'Duplicate regression registration.')
    for item in case_index:
        require((ROOT/item['source']).is_file() and (ROOT/item['test']).is_file(),f'Missing regression source: {item}')
    links=0
    for path in ROOT.rglob('*.md'):
        if '.git' in path.parts:
            continue
        text=path.read_text(encoding='utf-8')
        require('\ufffd' not in text, f'Encoding replacement character in {path}')
        text=re.sub(r'```.*?```','',text,flags=re.S)
        for target in re.findall(r'\[[^\]]*\]\(([^\s)]+)(?:\s+"[^"]*")?\)',text):
            parsed=urlsplit(target)
            if parsed.scheme or parsed.netloc:
                continue
            local=(path.parent/unquote(parsed.path)).resolve() if parsed.path else path
            require(local.is_relative_to(ROOT),f'Link escapes repository: {path}: {target}')
            require(local.exists(),f'Broken link: {path}: {target}')
            if parsed.fragment and local.suffix == '.md':
                require(unquote(parsed.fragment) in heading_anchors(local), f'Broken anchor: {path}: {target}')
            links+=1
    subprocess.run([sys.executable,str(ROOT/'scripts/build_readmes.py'),'--check'],check=True)
    # Scan roadmap artifacts, and tracked files when a Git checkout is available.
    forbidden={'.class','.jar','.zip','.pyc'}
    require(not any(p.suffix in forbidden for p in roadmap.rglob('*')), 'Build artifact under roadmap.')
    if (ROOT/'.git').exists():
        tracked=subprocess.check_output(['git','ls-files','-z'],cwd=ROOT).decode().split('\0')
        require(not any(Path(p).suffix in forbidden for p in tracked if p),'Tracked build artifact.')
    if args.preservation:
        manifest=json.loads((ROOT/'docs/preservation-manifest.json').read_text())
        exact=0
        for item in manifest['files']:
            current=ROOT/item['new_path']
            require(current.is_file(), f'Original file missing: {item["path"]}')
            if current.suffix in ('.java','.txt'):
                require(git_blob(current.read_bytes())==item['blob'],f'Original bytes changed: {current}')
                exact+=1
        print(f'Preservation: all {len(manifest["files"])} original files accounted for; {exact} Java/output files byte-identical.')
    print(f'Structure: {len(topics)} topics, {len(catalog)} canonical LeetCode problems, '
          f'{len(fundamentals)} fundamentals, {len(all_sources)} Java files; {links} relative Markdown links valid.')


if __name__=='__main__':
    try:
        main()
    except (AssertionError,subprocess.CalledProcessError) as error:
        print('FAIL:',error,file=sys.stderr)
        raise SystemExit(1)
