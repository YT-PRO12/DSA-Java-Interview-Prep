# 1539. Kth Missing Positive Number

[Official problem](https://leetcode.com/problems/kth-missing-positive-number/) · **Easy**

## Intuition

At index i, exactly arr[i] - i - 1 positive integers are missing before the current value. This count never decreases.

## Approach

Find the first index whose missing count reaches k. There are low existing values before the answer, so adding those skipped values to k gives low + k. The same formula handles answers beyond the array.

## Dry run

For `[2,3,4,7,11]`, missing counts are `[1,1,1,3,6]`. With k=5, the boundary is index 4, giving 4+5=9.

## Complexity

Time: O(log n). Auxiliary space: O(1).

## Important edge cases

Missing values before the first element; a gap inside the array; no early gaps; answer beyond the last element. Assumes strictly increasing positive input.

## Java solution and verification

[Solution.java](Solution.java) uses the LeetCode method signature. [Regression suite](../../../tests/cases/sprint-1539.java) checks examples, boundaries, and deterministic generated inputs against an independent reference.

From the repository root, run `python scripts/verify_java.py --new-only`. No online submission or acceptance is claimed.
