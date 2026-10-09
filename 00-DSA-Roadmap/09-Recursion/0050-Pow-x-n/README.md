# Pow(x, n)

[LeetCode 50: Pow(x, n)](https://leetcode.com/problems/powx-n/)

**Status:** Newly prepared implementation, verified by the repository regression harness. No online submission acceptance was verified.

## Approach

Compute the half power once and square it. Convert the exponent to `long` before negating, because `-Integer.MIN_VALUE` overflows an `int`. The official contract excludes an undefined zero base with a nonpositive exponent.

## Complexity

- Time: O(log(|n| + 1))
- Auxiliary space: O(log(|n| + 1)) stack

## Implementation

[Solution.java](Solution.java)
