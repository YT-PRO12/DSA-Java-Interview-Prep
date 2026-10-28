# 1423. Maximum Points You Can Obtain from Cards

[Official problem](https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/) · **Medium**

## Intuition

Any legal selection contains a prefix and a suffix totaling k cards. There are only k + 1 such splits, regardless of the removal order.

## Approach

Start with the first k cards. Repeatedly exchange the last selected left card for the next rightmost card, tracking the maximum sum. This scans the splits using constant memory.

## Dry run

For `[8,1,2,9]` and k = 2, the split scores are 9, 17 and 11. Taking one card from each end wins.

## Complexity

O(k) time and O(1) auxiliary space. The official maximum sum is 1,000,000,000, which fits int. The input is unchanged.

## Important edge cases

k = 1; taking every card; equal scores; selecting only one side; an optimum requiring both ends.

## Java solution and verification

[Solution.java](Solution.java) follows the LeetCode method signature. The [regression suite](../../../tests/cases/sprint-2026-10-28-1423.java) compares deterministic random inputs with an independent exhaustive reference and covers large inputs.

Run `python scripts/verify_java.py --new-only` from the repository root with JDK 17 or newer. No online acceptance is claimed.
