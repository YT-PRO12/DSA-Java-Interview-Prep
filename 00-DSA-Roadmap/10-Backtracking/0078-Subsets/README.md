# Subsets

[LeetCode 78: Subsets](https://leetcode.com/problems/subsets/)

**Status:** Newly prepared implementation, verified by the repository regression harness. No online submission acceptance was verified.

## Approach

Each increasing index sequence represents one subset. Copy the path when recording an answer; otherwise later undo operations mutate earlier answers. The official input has distinct elements.

## Complexity

- Time: O(n × 2^n)
- Auxiliary space: O(n) working memory; O(n × 2^n) output

## Implementation

[Solution.java](Solution.java)
