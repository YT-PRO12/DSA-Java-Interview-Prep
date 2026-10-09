# Roadmap Restructuring Audit

**Date:** 2026-10-09
**Baseline:** `74cac98400ed27133e85d1157ed8097b05fbe3fc`
**Working branch:** `refactor/dsa-roadmap-architecture`

## Preservation

The baseline contains **349 tracked files**, including **151 Java source files**. Every original file has a current destination in [preservation-manifest.json](preservation-manifest.json). All original Java implementations and output files remain byte-identical. Problem notes remain in their new homes; navigation READMEs were rebuilt and selected note corrections are listed below.

There were 127 numbered problem folders representing 120 distinct IDs, plus 24 fundamentals. Seven duplicate ID pairs were consolidated, and three mismatched contracts were reclassified. The preserved catalog therefore contains **117 correctly classified LeetCode problems, 27 fundamentals, and seven additional implementation variants**: 144 distinct learning exercises represented by 151 Java files.

## Before and After

| Previous section | New canonical location |
|---|---|
| 01 Arrays | 01 Arrays; specialized examples moved to Math, Hashing, Two Pointers, Binary Search, or Greedy |
| 02 Strings | 02 Strings; specialized examples moved to Sorting, Hashing, Windows, Stacks, or Greedy |
| 03 Sliding Window | 07 Sliding Window |
| 04 Binary Search | 08 Binary Search |
| 05 Linked List | 11 Linked List |
| 06 Stacks Queue | 12 Stacks and Queues |
| 07 Trees | 15 Binary Trees |
| 08 Binary Search Trees | 16 Binary Search Trees |

The new sections are Basic Math and Bit Manipulation, Sorting, Hashing and Prefix Sum, Two Pointers, Recursion, Backtracking, Greedy, and Heaps and Priority Queues. See the [complete ordered roadmap](../00-DSA-Roadmap/README.md).

## Duplicate Canonical Folders Resolved

| LeetCode ID | Canonical section | Preservation approach |
|---:|---|---|
| 3 | Sliding Window | Both original classes retained; string variant in `examples/strings/` |
| 20 | Stacks and Queues | Platform solution and standalone demo retained together |
| 33 | Binary Search | Platform solution and standalone demo retained together |
| 153 | Binary Search | Platform solution and standalone demo retained together |
| 239 | Sliding Window | Platform solution and standalone demo retained together |
| 394 | Stacks and Queues | Platform solution and standalone demo retained together |
| 424 | Sliding Window | Both original classes retained; string variant in `examples/strings/` |

## Contract Corrections

No existing Java code was changed to force a new problem label.

| Previous label | Actual exercise | Why classified as a fundamental |
|---|---|---|
| LC 344 | Reverse String Copy | Returns a new String; does not mutate the supplied char array in place |
| LC 387 | First Non-Repeating Character | Returns the character or NUL; the official problem returns an index or -1 |
| LC 430 | Flatten Multilevel Singly Linked List | No prev pointers; the official problem requires a doubly linked result |

These mappings were checked against the official contracts. Other preserved descriptive classes are standalone teaching adaptations: class/method names and local node definitions may require adaptation for direct submission.

## New Implementations

**28 new examples**: 15 official problems and 13 fundamentals. Every new example has a Java regression suite, an approach note, a contract, and time/space analysis.

| Topic | New official problems | New fundamentals |
|---|---|---|
| Math and bits | 191 Number of 1 Bits | GCD/LCM; primes/divisors; bit operations |
| Sorting | 75 Sort Colors | Elementary sorts; divide-and-conquer sorts; counting sort |
| Hashing and prefix sum | 217 Contains Duplicate | Prefix sums |
| Two pointers | — | Sorted pair search; three-way partition |
| Recursion | 22 Generate Parentheses; 50 Pow(x, n) | Array recursion; recursive palindrome; subsequences |
| Backtracking | 37 Sudoku Solver; 39 Combination Sum; 46 Permutations; 51 N-Queens; 78 Subsets | — |
| Greedy | 435 Non-overlapping Intervals; 881 Boats to Save People | — |
| Heaps | 23 Merge k Sorted Lists; 215 Kth Largest Element in an Array; 621 Task Scheduler | PriorityQueue basics |

Sorting fundamentals group related methods in runnable classes: Bubble, Selection, Insertion, Merge, Quick, and Counting Sort are all implemented. Generate Parentheses bridges recursion and backtracking; Sudoku covers constrained grid search.

## Documentation Changes

- Rebuilt the root and roadmap READMEs and all 16 topic READMEs, with real source links and counts.
- Added official title, slug, and difficulty metadata from LeetCode’s public catalog, verified on 2026-10-09: [catalog.json](catalog.json).
- Expanded abbreviated BST folder names to official titles.
- Preserved original notes and outputs; repaired five Windows-1252 Markdown encodings without losing their symbols.
- Corrected the sorting-stack space note for 3Sum/4Sum and the worst-case repeated-tail-scan cost of singly linked flattening.
- Added explicit links to all retained variants, a contribution guide, and reproducible verification tooling.

The final catalog has **132 distinct official problems, 40 fundamentals, and 179 Java files**. These are coverage counts, not accepted-submission or mastery statistics.

## History

The structural commit contains relocations only. Feature, documentation, and validation changes are grouped by purpose. All commits descend from the original baseline; there is no historical amendment, backdating, rebase, reset, or force-push.

See [VALIDATION.md](VALIDATION.md) for commands, results, and limits.
