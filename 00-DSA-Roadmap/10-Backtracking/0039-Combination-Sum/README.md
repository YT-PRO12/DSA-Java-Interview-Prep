# Combination Sum

[LeetCode 39: Combination Sum](https://leetcode.com/problems/combination-sum/)

**Status:** Newly prepared implementation, verified by the repository regression harness. No online submission acceptance was verified.

## Approach

Sort a copy so large candidates can be pruned without changing the caller’s array. Recurse with the same index to permit reuse, and never move backward to avoid reordered duplicates. Candidates must be distinct and positive as specified by LeetCode.

## Complexity

- Time: Conservative O(m log m + (m + 1)^(d + 1) + S), m = candidates, d = floor(target/min candidate), S = output size
- Auxiliary space: O(m + d) working memory; O(S) output

## Implementation

[Solution.java](Solution.java)
