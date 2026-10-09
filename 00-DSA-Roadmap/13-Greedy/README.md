# Greedy

[Roadmap](../README.md) · [Repository guide](../../README.md)

Make local decisions that admit an optimal completion. Sorting provides an order in which those decisions can be justified.

## Concepts Covered

- Running minimum and local state
- Intervals and earliest finishing time
- Lightest/heaviest pairing
- Exchange arguments and counterexamples

## Problem Index

| # | LeetCode | Problem | Difficulty | Pattern | Solution |
|---:|---:|---|---|---|---|
| 1 | 31 | [Next Permutation](https://leetcode.com/problems/next-permutation/) | Medium | Greedy + Two Pointers / In-Place Array Manipulation | [Java](0031-Next-Permutation/NextPermutation.java) |
| 2 | 56 | [Merge Intervals](https://leetcode.com/problems/merge-intervals/) | Medium | Sorting + Interval Merging | [Java](0056-Merge-Intervals/MergeIntervals.java) |
| 3 | 121 | [Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/) | Easy | Greedy / Array Traversal | [Java](0121-Best-Time-to-Buy-and-Sell-Stock/BestTimeToBuyAndSellStock.java) |
| 4 | 409 | [Longest Palindrome](https://leetcode.com/problems/longest-palindrome/) | Easy | Frequency Counting / Greedy | [Java](0409-Longest-Palindrome/LongestPalindrome.java) |
| 5 | 435 | [Non-overlapping Intervals](https://leetcode.com/problems/non-overlapping-intervals/) | Medium | Earliest-finish interval scheduling | [Java](0435-Non-overlapping-Intervals/Solution.java) |
| 6 | 881 | [Boats to Save People](https://leetcode.com/problems/boats-to-save-people/) | Medium | Pair lightest with heaviest | [Java](0881-Boats-to-Save-People/Solution.java) |

## Learning Progression

1. Local state scans
2. Sorted intervals
3. Greedy pairing
4. Proof and counterexample practice

## Interview Essentials

- State why the chosen decision can replace one in an optimal solution.
- A plausible local rule is not sufficient; search for a small counterexample.
- Check whether intervals that touch are compatible for this specific problem.
- Include sorting time and memory in the full algorithm cost.

## Learning Outcomes

Explain the choice and its proof, and recognize when exhaustive search is needed instead.

## Related Practice

- [11. Container With Most Water](../06-Two-Pointers/0011-Container-With-Most-Water)
- [435. Non-overlapping Intervals](0435-Non-overlapping-Intervals)
- [621. Task Scheduler](../14-Heaps-and-Priority-Queues/0621-Task-Scheduler)

Counts reflect files in this repository, not verified LeetCode acceptances. See the [validation report](../../docs/VALIDATION.md) for the verification scope.
