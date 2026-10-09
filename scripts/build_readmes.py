#!/usr/bin/env python3
"""Build root, roadmap and topic navigation from reviewed metadata and real files."""
import argparse
import json
import os
from pathlib import Path
import re

ROOT = Path(__file__).resolve().parents[1]
ROADMAP = ROOT / '00-DSA-Roadmap'


def link(path, start):
    return Path(os.path.relpath(path, start)).as_posix()


def build():
    topics = json.loads((ROOT / 'docs/topics.json').read_text(encoding='utf-8'))
    problems = json.loads((ROOT / 'docs/catalog.json').read_text())['problems']
    by_id = {p['id']: p for p in problems}
    output = {}
    counts = []
    for topic in topics:
        folder = ROADMAP / topic['directory']
        own = [p for p in problems if Path(p['directory']).parts[1] == topic['directory']]
        fundamentals = sorted((folder / 'Fundamentals').glob('*/*.java'))
        java_count = len(list(folder.rglob('*.java')))
        counts.append((topic, len(own), len(fundamentals), java_count))
        text = f"# {topic['title']}\n\n[Roadmap](../README.md) · [Repository guide](../../README.md)\n\n{topic['overview']}\n\n## Concepts Covered\n\n"
        text += '\n'.join('- ' + item for item in topic['concepts']) + '\n\n## Problem Index\n\n'
        if own:
            text += '| # | LeetCode | Problem | Difficulty | Pattern | Solution |\n|---:|---:|---|---|---|---|\n'
            for i,p in enumerate(own,1):
                text += f"| {i} | {p['id']} | [{p['title']}](https://leetcode.com/problems/{p['slug']}/) | {p['difficulty']} | {p['pattern']} | [Java]({link(ROOT/p['solution'],folder)}) |\n"
        else:
            text += 'This section teaches general patterns through the runnable fundamentals below; related official problems are linked at the end.\n'
        if fundamentals:
            text += '\n## Fundamentals\n\n| Exercise | Focus | Implementation |\n|---|---|---|\n'
            for source in fundamentals:
                note = source.parent/'README.md'
                content = note.read_text(encoding='utf-8') if note.exists() else ''
                match = re.search(r'## (?:Interview Pattern|Pattern)\s+([^#]+)',content)
                focus = match.group(1).strip().split('\n')[0] if match else source.parent.name.replace('-',' ')
                name = source.parent.name.replace('-',' ')
                label = f'[{name}]({link(note,folder)})' if note.exists() else name
                text += f'| {label} | {focus} | [Java]({link(source,folder)}) |\n'
        variants=[]
        for p in own:
            for source in sorted((ROOT/p['directory']).rglob('*.java')):
                if source != ROOT/p['solution']:
                    variants.append((p,source))
        if variants:
            text += '\n## Preserved Local Variants\n\nThese are original alternatives or runnable demos of an indexed problem. They count as source files, not additional problems.\n\n| LeetCode | Original implementation |\n|---:|---|\n'
            for p,source in variants:
                text += f"| {p['id']} | [{source.name}]({link(source,folder)}) |\n"
        if topic['directory'].startswith('12-'):
            text += '\n## Pattern Groups\n\n| Group | Start here |\n|---|---|\n'
            for title,ids in [('Matching and parsing',[20,71,150,394]),('Stack and queue simulation',[155,225,232]),('Circular buffers',[622,641]),('Monotonic structures',[496,739,901,84,239])]:
                labels=[f"[{i}]({link(ROOT/by_id[i]['directory'],folder)})" for i in ids]
                text+=f'| {title} | '+', '.join(labels)+' |\n'
        text += '\n## Learning Progression\n\n' + '\n'.join(f'{i}. {item}' for i,item in enumerate(topic['progression'],1))
        text += '\n\n## Interview Essentials\n\n' + '\n'.join('- '+item for item in topic['essentials'])
        text += '\n\n## Learning Outcomes\n\n'+topic['outcomes']+'\n\n## Related Practice\n\n'
        for number in topic['related']:
            p=by_id[number]
            text+=f"- [{number}. {p['title']}]({link(ROOT/p['directory'],folder)})\n"
        text+='\nCounts reflect files in this repository, not verified LeetCode acceptances. See the [validation report](../../docs/VALIDATION.md) for the verification scope.\n'
        output[folder/'README.md']=text
    total_lc=sum(x[1] for x in counts);total_fund=sum(x[2] for x in counts);total_java=sum(x[3] for x in counts)
    def table(start):
        value='| Order | Topic | LeetCode problems | Fundamentals | Java files |\n|---:|---|---:|---:|---:|\n'
        for topic,lc,fund,java in counts:
            value+=f"| {topic['directory'][:2]} | [{topic['title']}]({link(ROADMAP/topic['directory'],start)}) | {lc} | {fund} | {java} |\n"
        value+=f'| | **Total** | **{total_lc}** | **{total_fund}** | **{total_java}** |\n'
        return value
    output[ROOT/'README.md']='''# Java DSA — Structured Interview Preparation Roadmap

*A systematic approach to mastering Data Structures, Algorithms, and Problem Solving in Java.*

![Java 17+](https://img.shields.io/badge/Java-17%2B-007396?style=flat)

A Java practice collection maintained by [Yatharth Goyal](https://github.com/YT-PRO12), organized around the patterns used in technical interviews. Start with arrays and strings, build the mathematical and algorithmic foundations, then progress through recursion, linked structures, heaps, binary trees, and BSTs.

## Contents

- [Ordered roadmap](#ordered-roadmap)
- [How to study](#how-to-study)
- [Navigate the repository](#navigate-the-repository)
- [Run Java examples](#run-java-examples)
- [Progress and verification](#progress-and-verification)
- [Standards and contributions](#standards-and-contributions)

## Ordered Roadmap

'''+table(ROOT)+'''
Each LeetCode ID has one canonical folder. Java-file totals also include the retained variants; fundamentals are counted separately. Topic READMEs link both official problem statements and the actual Java implementations.

**Pattern coverage:** scans, frequency maps, prefix sums, two pointers, fixed and variable windows, binary search on answers, divide and conquer, backtracking, fast/slow pointers, monotonic stacks and deques, greedy scheduling, top K, DFS/BFS, and BST ordering.

## How to Study

1. **Foundations — 01–04:** implement scans, character handling, arithmetic, masks, and elementary sorts. Revisit recursive merge/quick sort after chapter 09.
2. **Array patterns — 05–08:** learn hashing, prefix sums, pointer invariants, sliding windows, and monotone search predicates.
3. **Recursive reasoning — 09–10:** trace base cases and call trees; practice choosing, exploring, undoing, and pruning.
4. **Structures and decisions — 11–14:** draw pointer changes, model LIFO/FIFO operations, justify greedy choices, and manage heap frontiers.
5. **Trees — 15–16:** build DFS/BFS intuition, then use BST bounds, inorder order, deletion, and construction.

For each exercise: state the contract → derive an invariant → implement → dry-run an edge case → explain time and auxiliary space → solve again without looking. Graphs, tries, and advanced dynamic programming are outside this roadmap’s current scope.

## Navigate the Repository

- Open the [roadmap guide](00-DSA-Roadmap/README.md), then a topic’s problem index.
- Official problems use `0001-Two-Sum/` style names. General exercises live under `Fundamentals/` without invented IDs.
- `Solution.java` follows the platform-style signature. Original descriptive Java files are standalone teaching versions; adapt their class, method, and node names when needed.
- Existing alternate implementations live beside the canonical solution or under its `examples/` directory. They are cross-linked rather than counted twice.
- Original problem notes and `Output.txt` examples are retained. Some historic output files use UTF-16; editors should detect their encoding.

## Run Java Examples

Install **JDK 17 or newer**. Compile one exercise at a time: many unrelated problems intentionally define a class named `Solution`.

From the repository root, run a standalone fundamental:

```bash
cd 00-DSA-Roadmap/03-Basic-Math-and-Bit-Manipulation/Fundamentals/GCD-and-LCM
javac GcdLcm.java
java GcdLcm
```

Expected output: `6`, then `72` on the next line.

Platform-style solutions generally have no `main`. LeetCode supplies node types such as `TreeNode` and `ListNode`; the repository verifier supplies isolated test-only equivalents. Use a fresh solution object for the preserved stateful tree examples.

From the repository root, with Python 3.10+ and the JDK on PATH (or JAVA_HOME set):

```bash
python scripts/validate_repository.py
python scripts/verify_java.py
```

## Progress and Verification

The tables measure repository coverage, **not accepted submissions or personal mastery**. The restructuring preserved all 151 original Java files and added 28 prepared implementations: 15 official LeetCode problems and 13 fundamentals. No new online acceptance was claimed or verified.

- [Verification evidence and limitations](docs/VALIDATION.md)
- [Preservation and reclassification audit](docs/RESTRUCTURING.md)
- [Regression test guide](tests/README.md)
- [LeetCode profile](https://leetcode.com/u/yatharth_goyal/) · [GitHub profile](https://github.com/YT-PRO12)

Track your own attempts by recording the date, independent solution, mistakes, and revisit date in personal notes. Repository presence alone is not evidence of mastery.

## Standards and Contributions

Follow [CONTRIBUTING.md](CONTRIBUTING.md) for contracts, naming, verification, and meaningful commits. Counts and indexes are generated from reviewed metadata and real files; run `python scripts/build_readmes.py` after a catalog change.

Original commits and timestamps remain in history. New changes use their actual creation dates. Build understanding one well-explained solution at a time.
'''
    output[ROADMAP/'README.md']='''# DSA Learning Roadmap

[Repository guide](../README.md) · [Contribution guide](../CONTRIBUTING.md)

Follow the chapters in order, using each topic’s linked problem index, fundamentals, interview essentials, and learning outcomes. Recursion precedes backtracking and trees; binary trees and BSTs remain separate chapters.

## Topic Index

'''+table(ROADMAP)+'''
## Working Method

1. Understand the input/output contract and constraints.
2. Identify a pattern and state its invariant.
3. Implement in Java and explain complexity, including stack space.
4. Dry-run representative and boundary cases.
5. Compare with the existing implementation, then revisit without notes.

## Format and Scope

Official problem folders have a four-digit ID and the official title. Fundamentals have descriptive names under `Fundamentals/`. One canonical home per LeetCode ID keeps counts honest; other topics link to it.

The sorting chapter introduces iterative algorithms first. Revisit recursive merge/quick sort after Recursion. Generate Parentheses bridges Recursion and Backtracking, and Sudoku provides constrained grid search without introducing a Graphs chapter.

Standalone examples may use local node definitions or descriptive method names. Their algorithms can match a problem without being paste-ready submissions. The string-copy, character-return, and singly-linked flattening exercises are explicitly fundamentals because their contracts differ from the previously assigned LeetCode IDs.

This roadmap stops at Binary Search Trees. [Validation details](../docs/VALIDATION.md) distinguish compilation, runnable demos, regression suites, and online acceptance.
'''
    return output


def main():
    parser=argparse.ArgumentParser(description=__doc__)
    parser.add_argument('--check', action='store_true')
    args=parser.parse_args()
    stale=[]
    for path,content in build().items():
        if args.check:
            if not path.exists() or path.read_text(encoding='utf-8') != content:
                stale.append(str(path.relative_to(ROOT)))
        else:
            path.parent.mkdir(parents=True,exist_ok=True)
            path.write_text(content,encoding='utf-8')
    if stale:
        print('Stale generated navigation:', ', '.join(stale))
        raise SystemExit(1)
    print('Navigation verified.' if args.check else 'Generated 18 navigation READMEs.')


if __name__=='__main__':
    main()
