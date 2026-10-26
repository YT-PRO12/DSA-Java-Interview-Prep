# 1438. Longest Continuous Subarray With Absolute Diff Less Than or Equal to Limit

[Official problem](https://leetcode.com/problems/longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit/) · **Medium**

## Intuition

Every pair satisfies the limit exactly when the window maximum minus its minimum does. Two monotonic deques maintain these extremes as the window moves.

## Approach

Store indices in increasing-value and decreasing-value deques. Remove dominated tail entries when extending right. While the extremes violate the limit, evict the departing left index and shrink. Update the best valid length.

## Dry run

For `[8,2,4,7]` with limit 4, adding 2 removes 8 from the window. `[2,4]` is valid; adding 7 requires dropping 2, leaving `[4,7]`. Best length: 2.

## Complexity

Time: O(n), since each index enters and leaves each deque at most once. Auxiliary space: O(n).

## Important edge cases

Zero limit; repeated extremes; many left-edge removals; increasing/decreasing inputs; an entire valid window.

## Java solution and verification

[Solution.java](Solution.java) uses the LeetCode method signature. [Regression suite](../../../tests/cases/sprint-1438.java) checks examples, boundaries, and deterministic generated inputs against an independent reference.

From the repository root, run `python scripts/verify_java.py --new-only`. No online submission or acceptance is claimed.
