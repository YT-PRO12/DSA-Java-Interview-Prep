# 1209. Remove All Adjacent Duplicates in String II

[Official problem](https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii/) · **Medium**

## Intuition

The reduced prefix needs both characters and the length of its trailing run. Removing a complete run must restore the previous run length.

## Approach

Store each character with its consecutive count. At count k, move the stack pointer back by k. Counts below the pointer remain intact, so later characters can join a newly exposed run.

## Dry run

With `deeedbbcccbdaa` and k=3, removing eee and ccc allows bbb, then ddd, to disappear. Only `aa` remains.

## Complexity

Time: O(n). Auxiliary space: O(n) for characters and counts.

## Important edge cases

Cascading deletions; k larger than the input; an entire string removed; repeated calls; runs whose lengths are multiples of k.

## Java solution and verification

[Solution.java](Solution.java) uses the LeetCode method signature. [Regression suite](../../../tests/cases/sprint-1209.java) checks examples, boundaries, and deterministic generated inputs against an independent reference.

From the repository root, run `python scripts/verify_java.py --new-only`. No online submission or acceptance is claimed.
