# DSA Learning Roadmap

[Repository guide](../README.md) · [Contribution guide](../CONTRIBUTING.md)

Follow the chapters in order, using each topic’s linked problem index, fundamentals, interview essentials, and learning outcomes. Recursion precedes backtracking and trees; binary trees and BSTs remain separate chapters.

## Topic Index

| Order | Topic | LeetCode problems | Fundamentals | Java files |
|---:|---|---:|---:|---:|
| 01 | [Arrays](01-Arrays) | 6 | 6 | 12 |
| 02 | [Strings](02-Strings) | 9 | 7 | 16 |
| 03 | [Basic Math and Bit Manipulation](03-Basic-Math-and-Bit-Manipulation) | 3 | 3 | 6 |
| 04 | [Sorting](04-Sorting) | 2 | 3 | 5 |
| 05 | [Hashing and Prefix Sum](05-Hashing-and-Prefix-Sum) | 10 | 1 | 11 |
| 06 | [Two Pointers](06-Two-Pointers) | 6 | 2 | 8 |
| 07 | [Sliding Window](07-Sliding-Window) | 10 | 1 | 14 |
| 08 | [Binary Search](08-Binary-Search) | 15 | 0 | 17 |
| 09 | [Recursion](09-Recursion) | 2 | 3 | 5 |
| 10 | [Backtracking](10-Backtracking) | 5 | 0 | 5 |
| 11 | [Linked List](11-Linked-List) | 17 | 13 | 30 |
| 12 | [Stacks and Queues](12-Stacks-and-Queues) | 13 | 0 | 15 |
| 13 | [Greedy](13-Greedy) | 6 | 0 | 6 |
| 14 | [Heaps and Priority Queues](14-Heaps-and-Priority-Queues) | 3 | 1 | 4 |
| 15 | [Binary Trees](15-Binary-Trees) | 10 | 0 | 10 |
| 16 | [Binary Search Trees](16-Binary-Search-Trees) | 15 | 0 | 15 |
| | **Total** | **132** | **40** | **179** |

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
