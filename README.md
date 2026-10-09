# Java DSA — Structured Interview Preparation Roadmap

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

| Order | Topic | LeetCode problems | Fundamentals | Java files |
|---:|---|---:|---:|---:|
| 01 | [Arrays](00-DSA-Roadmap/01-Arrays) | 6 | 6 | 12 |
| 02 | [Strings](00-DSA-Roadmap/02-Strings) | 9 | 7 | 16 |
| 03 | [Basic Math and Bit Manipulation](00-DSA-Roadmap/03-Basic-Math-and-Bit-Manipulation) | 3 | 3 | 6 |
| 04 | [Sorting](00-DSA-Roadmap/04-Sorting) | 2 | 3 | 5 |
| 05 | [Hashing and Prefix Sum](00-DSA-Roadmap/05-Hashing-and-Prefix-Sum) | 10 | 1 | 11 |
| 06 | [Two Pointers](00-DSA-Roadmap/06-Two-Pointers) | 6 | 2 | 8 |
| 07 | [Sliding Window](00-DSA-Roadmap/07-Sliding-Window) | 10 | 1 | 14 |
| 08 | [Binary Search](00-DSA-Roadmap/08-Binary-Search) | 15 | 0 | 17 |
| 09 | [Recursion](00-DSA-Roadmap/09-Recursion) | 2 | 3 | 5 |
| 10 | [Backtracking](00-DSA-Roadmap/10-Backtracking) | 5 | 0 | 5 |
| 11 | [Linked List](00-DSA-Roadmap/11-Linked-List) | 17 | 13 | 30 |
| 12 | [Stacks and Queues](00-DSA-Roadmap/12-Stacks-and-Queues) | 13 | 0 | 15 |
| 13 | [Greedy](00-DSA-Roadmap/13-Greedy) | 6 | 0 | 6 |
| 14 | [Heaps and Priority Queues](00-DSA-Roadmap/14-Heaps-and-Priority-Queues) | 3 | 1 | 4 |
| 15 | [Binary Trees](00-DSA-Roadmap/15-Binary-Trees) | 10 | 0 | 10 |
| 16 | [Binary Search Trees](00-DSA-Roadmap/16-Binary-Search-Trees) | 15 | 0 | 15 |
| | **Total** | **132** | **40** | **179** |

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
