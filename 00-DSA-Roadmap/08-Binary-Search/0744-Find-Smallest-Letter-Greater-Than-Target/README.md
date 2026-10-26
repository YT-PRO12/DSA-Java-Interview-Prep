# 744. Find Smallest Letter Greater Than Target

[Official problem](https://leetcode.com/problems/find-smallest-letter-greater-than-target/) · **Easy**

## Intuition

Equal letters cannot answer a strictly-greater query. The first larger letter is an upper bound in the sorted array.

## Approach

Keep a half-open search interval. If the middle letter is at most the target, discard it and everything to its left. Otherwise keep it as a candidate. A final index equal to the array length wraps to zero.

## Dry run

For `[c,f,j]` and `c`, the search keeps `f`, discards `c`, and returns index 1. A target after the last letter returns the first letter.

## Complexity

Time: O(log n). Auxiliary space: O(1).

## Important edge cases

Repeated letters; equality; targets before the first or after the last letter. The official input is sorted and nonempty.

## Java solution and verification

[Solution.java](Solution.java) uses the LeetCode method signature. [Regression suite](../../../tests/cases/sprint-0744.java) checks examples, boundaries, and deterministic generated inputs against an independent reference.

From the repository root, run `python scripts/verify_java.py --new-only`. No online submission or acceptance is claimed.
