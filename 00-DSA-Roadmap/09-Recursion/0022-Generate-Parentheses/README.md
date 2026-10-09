# Generate Parentheses

[LeetCode 22: Generate Parentheses](https://leetcode.com/problems/generate-parentheses/)

**Status:** Newly prepared implementation, verified by the repository regression harness. No online submission acceptance was verified.

## Approach

A prefix is valid only when closed brackets never exceed opened brackets. Add an opening bracket while fewer than n are used; add a closing bracket only when one is unmatched. This introduces pruning before the dedicated Backtracking chapter.

## Complexity

- Time: O(n × C_n), where C_n is the nth Catalan number
- Auxiliary space: O(n) working memory; O(n × C_n) output

## Implementation

[Solution.java](Solution.java)
