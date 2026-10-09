# Kth Largest Element in an Array

[LeetCode 215: Kth Largest Element in an Array](https://leetcode.com/problems/kth-largest-element-in-an-array/)

**Status:** Newly prepared implementation, verified by the repository regression harness. No online submission acceptance was verified.

## Approach

Keep the k largest values seen so far. The smallest of those k values is the kth largest overall. Duplicates count separately and 1 <= k <= nums.length is required.

## Complexity

- Time: O(n log(k + 1))
- Auxiliary space: O(k)

## Implementation

[Solution.java](Solution.java)
