# Sort Colors

[LeetCode 75: Sort Colors](https://leetcode.com/problems/sort-colors/)

**Status:** Newly prepared implementation, verified by the repository regression harness. No online submission acceptance was verified.

## Approach

Maintain regions for zeros, ones, unknown values, and twos. After swapping a two from the right boundary, inspect the incoming value before advancing. The official input contains only 0, 1 and 2.

## Complexity

- Time: O(n)
- Auxiliary space: O(1)

## Implementation

[Solution.java](Solution.java)
