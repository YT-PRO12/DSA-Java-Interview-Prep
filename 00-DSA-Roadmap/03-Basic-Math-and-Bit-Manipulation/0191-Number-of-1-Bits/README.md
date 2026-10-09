# Number of 1 Bits

[LeetCode 191: Number of 1 Bits](https://leetcode.com/problems/number-of-1-bits/)

**Status:** Newly prepared implementation, verified by the repository regression harness. No online submission acceptance was verified.

## Approach

Each `n & (n - 1)` removes the lowest set bit. This also counts the bits of negative Java integers as 32-bit patterns.

## Complexity

- Time: O(b), b = number of set bits; at most 32 iterations
- Auxiliary space: O(1)

## Implementation

[Solution.java](Solution.java)
