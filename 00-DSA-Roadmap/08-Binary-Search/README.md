# Binary Search

[Roadmap](../README.md) · [Repository guide](../../README.md)

Search sorted domains and monotone answer spaces using explicit boundary invariants.

## Concepts Covered

- Exact search and lower bounds
- Rotated arrays and duplicate ambiguity
- Peaks and sorted matrices
- Minimum feasible and maximum feasible answers

## Problem Index

| # | LeetCode | Problem | Difficulty | Pattern | Solution |
|---:|---:|---|---|---|---|
| 1 | 33 | [Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/) | Medium | Rotated binary search | [Java](0033-Search-in-Rotated-Sorted-Array/Solution.java) |
| 2 | 34 | [Find First and Last Position of Element in Sorted Array](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/) | Medium | First and last boundaries | [Java](0034-Find-First-and-Last-Position-of-Element-in-Sorted-Array/Solution.java) |
| 3 | 35 | [Search Insert Position](https://leetcode.com/problems/search-insert-position/) | Easy | Lower bound | [Java](0035-Search-Insert-Position/Solution.java) |
| 4 | 74 | [Search a 2D Matrix](https://leetcode.com/problems/search-a-2d-matrix/) | Medium | Flattened binary search | [Java](0074-Search-a-2D-Matrix/Solution.java) |
| 5 | 81 | [Search in Rotated Sorted Array II](https://leetcode.com/problems/search-in-rotated-sorted-array-ii/) | Medium | Rotated search with duplicates | [Java](0081-Search-in-Rotated-Sorted-Array-II/Solution.java) |
| 6 | 153 | [Find Minimum in Rotated Sorted Array](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/) | Medium | Rotated minimum | [Java](0153-Find-Minimum-in-Rotated-Sorted-Array/Solution.java) |
| 7 | 162 | [Find Peak Element](https://leetcode.com/problems/find-peak-element/) | Medium | Slope binary search | [Java](0162-Find-Peak-Element/Solution.java) |
| 8 | 240 | [Search a 2D Matrix II](https://leetcode.com/problems/search-a-2d-matrix-ii/) | Medium | Sorted-matrix elimination | [Java](0240-Search-a-2D-Matrix-II/Solution.java) |
| 9 | 410 | [Split Array Largest Sum](https://leetcode.com/problems/split-array-largest-sum/) | Hard | Binary search on answer | [Java](0410-Split-Array-Largest-Sum/Solution.java) |
| 10 | 704 | [Binary Search](https://leetcode.com/problems/binary-search/) | Easy | Classic binary search | [Java](0704-Binary-Search/Solution.java) |
| 11 | 875 | [Koko Eating Bananas](https://leetcode.com/problems/koko-eating-bananas/) | Medium | Minimum feasible speed | [Java](0875-Koko-Eating-Bananas/Solution.java) |
| 12 | 1011 | [Capacity To Ship Packages Within D Days](https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/) | Medium | Minimum feasible capacity | [Java](1011-Capacity-To-Ship-Packages-Within-D-Days/Solution.java) |
| 13 | 1283 | [Find the Smallest Divisor Given a Threshold](https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/) | Medium | Minimum feasible divisor | [Java](1283-Find-the-Smallest-Divisor-Given-a-Threshold/Solution.java) |
| 14 | 1482 | [Minimum Number of Days to Make m Bouquets](https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/) | Medium | Minimum feasible day | [Java](1482-Minimum-Number-of-Days-to-Make-m-Bouquets/Solution.java) |
| 15 | 1552 | [Magnetic Force Between Two Balls](https://leetcode.com/problems/magnetic-force-between-two-balls/) | Medium | Maximum feasible distance | [Java](1552-Magnetic-Force-Between-Two-Balls/Solution.java) |

## Preserved Local Variants

These are original alternatives or runnable demos of an indexed problem. They count as source files, not additional problems.

| LeetCode | Original implementation |
|---:|---|
| 33 | [SearchInRotatedSortedArray.java](0033-Search-in-Rotated-Sorted-Array/SearchInRotatedSortedArray.java) |
| 153 | [FindMinimumInRotatedSortedArray.java](0153-Find-Minimum-in-Rotated-Sorted-Array/FindMinimumInRotatedSortedArray.java) |

## Learning Progression

1. Classic search
2. Boundary search
3. Rotated and matrix problems
4. Binary search on the answer

## Interview Essentials

- Use left + (right - left) / 2 when bounds are nonnegative.
- Decide whether candidates are indices or possible answers.
- Choose one interval convention and ensure every iteration shrinks it.
- Duplicates can degrade rotated-array search to O(n); sorted-matrix elimination is O(rows + columns).

## Learning Outcomes

Define a monotone predicate and return the correct boundary without skipping or repeating candidates.

## Related Practice

- [50. Pow(x, n)](../09-Recursion/0050-Pow-x-n)
- [700. Search in a Binary Search Tree](../16-Binary-Search-Trees/0700-Search-in-a-Binary-Search-Tree)

Counts reflect files in this repository, not verified LeetCode acceptances. See the [validation report](../../docs/VALIDATION.md) for the verification scope.
