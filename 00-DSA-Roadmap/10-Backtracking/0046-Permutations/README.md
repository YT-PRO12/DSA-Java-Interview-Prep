# Permutations

[LeetCode 46: Permutations](https://leetcode.com/problems/permutations/)

**Status:** Newly prepared implementation, verified by the repository regression harness. No online submission acceptance was verified.

## Approach

Choose any unused input index for the next position, then restore both the used marker and the path. Inputs are distinct under the official contract; this version does not deduplicate repeated values.

## Complexity

- Time: O(n × n!)
- Auxiliary space: O(n) working memory; O(n × n!) output

## Implementation

[Solution.java](Solution.java)
