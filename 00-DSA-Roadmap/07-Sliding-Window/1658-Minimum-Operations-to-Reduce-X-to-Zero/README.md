# 1658. Minimum Operations to Reduce X to Zero

[Official problem](https://leetcode.com/problems/minimum-operations-to-reduce-x-to-zero/) · **Medium**

## Intuition

Removing a prefix and suffix leaves one contiguous middle segment. Minimize removed elements by maximizing the retained segment whose sum is total minus x.

## Approach

Sum the input, then use a positive-number sliding window for the retained target. Shrink while its sum is too large and record matching lengths. Return -1 if no segment matches. A zero target means removing the entire array.

## Dry run

For `[2,3,1,4]` and x = 6, the retained target is 4. Keeping `[3,1]` removes two endpoint values, giving two operations.

## Complexity

O(n) time and O(1) auxiliary space. The input is not modified.

## Important edge cases

x equals or exceeds the total; no matching retained segment; either endpoint alone; removing both ends. The positive-value contract is essential for this window.

## Java solution and verification

[Solution.java](Solution.java) follows the LeetCode method signature. The [regression suite](../../../tests/cases/sprint-2026-10-28-1658.java) compares deterministic random inputs with an independent exhaustive reference and covers large inputs.

Run `python scripts/verify_java.py --new-only` from the repository root with JDK 17 or newer. No online acceptance is claimed.
