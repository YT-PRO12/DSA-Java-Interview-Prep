# 658. Find K Closest Elements

[Official problem](https://leetcode.com/problems/find-k-closest-elements/) · **Medium**

## Intuition

The answer is a consecutive window in sorted order. Compare the element a window would lose on the left with the next element it would gain on the right.

## Approach

Binary-search the window start in [0,n-k]. Move right only when the outside right element is closer. On a tie keep the left window, which favors smaller values. Copy the final k elements.

## Dry run

For `[1,2,3,4,5]`, k=4 and x=3, the two outside candidates have equal distance. Keep the left window: `[1,2,3,4]`.

## Complexity

Time: O(log(n-k+1) + k). Auxiliary space: O(1) excluding the O(k) returned list.

## Important edge cases

Tie-breaking; duplicate values; k=1 or k=n; target outside the array. Input stays unchanged.

## Java solution and verification

[Solution.java](Solution.java) uses the LeetCode method signature. [Regression suite](../../../tests/cases/sprint-0658.java) checks examples, boundaries, and deterministic generated inputs against an independent reference.

From the repository root, run `python scripts/verify_java.py --new-only`. No online submission or acceptance is claimed.
