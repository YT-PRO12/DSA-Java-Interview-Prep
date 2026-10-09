# Non-overlapping Intervals

[LeetCode 435: Non-overlapping Intervals](https://leetcode.com/problems/non-overlapping-intervals/)

**Status:** Newly prepared implementation, verified by the repository regression harness. No online submission acceptance was verified.

## Approach

Sort by end time and retain each interval compatible with the last retained interval. Replacing an optimal schedule’s first interval by the earliest-finishing one cannot reduce the room left for later intervals. Touching endpoints are compatible. Sorting mutates the outer input array.

## Complexity

- Time: O(n log n)
- Auxiliary space: O(n) worst-case sorting workspace for Java object-array sorting

## Implementation

[Solution.java](Solution.java)
