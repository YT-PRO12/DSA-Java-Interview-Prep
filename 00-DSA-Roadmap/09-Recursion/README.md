# Recursion

[Roadmap](../README.md) · [Repository guide](../../README.md)

Learn to express a problem in terms of a smaller input, then connect single recursive calls to branching decision trees.

## Concepts Covered

- Base case and decreasing measure
- Array and string recursion
- Recursion trees and stack depth
- Subsequences, divide and conquer, constrained generation

## Problem Index

| # | LeetCode | Problem | Difficulty | Pattern | Solution |
|---:|---:|---|---|---|---|
| 1 | 22 | [Generate Parentheses](https://leetcode.com/problems/generate-parentheses/) | Medium | Constrained recursion / backtracking bridge | [Java](0022-Generate-Parentheses/Solution.java) |
| 2 | 50 | [Pow(x, n)](https://leetcode.com/problems/powx-n/) | Medium | Exponentiation by squaring | [Java](0050-Pow-x-n/Solution.java) |

## Fundamentals

| Exercise | Focus | Implementation |
|---|---|---|
| [Array Recursion](Fundamentals/Array-Recursion/README.md) | Array Recursion | [Java](Fundamentals/Array-Recursion/ArrayRecursion.java) |
| [Recursive Palindrome](Fundamentals/Recursive-Palindrome/README.md) | Recursive Palindrome | [Java](Fundamentals/Recursive-Palindrome/RecursivePalindrome.java) |
| [Subsequence Generation](Fundamentals/Subsequence-Generation/README.md) | Subsequence Generation | [Java](Fundamentals/Subsequence-Generation/Subsequences.java) |

## Learning Progression

1. Array base cases
2. String decomposition
3. Include/exclude decisions
4. Pruning and fast exponentiation

## Interview Essentials

- Prove a measure decreases on every call; a missing base case exhausts the stack.
- Count all calls in a recursion tree, not only its depth.
- Separate auxiliary stack space from the potentially exponential output.
- Java does not guarantee tail-call elimination; choose iteration for very deep linear recursion.

## Learning Outcomes

Describe what one call returns, trace a call tree, and account for stack depth before attempting trees.

## Related Practice

- [22. Generate Parentheses](0022-Generate-Parentheses)
- [78. Subsets](../10-Backtracking/0078-Subsets)
- [108. Convert Sorted Array to Binary Search Tree](../16-Binary-Search-Trees/0108-Convert-Sorted-Array-to-Binary-Search-Tree)
- [94. Binary Tree Inorder Traversal](../15-Binary-Trees/0094-Binary-Tree-Inorder-Traversal)

Counts reflect files in this repository, not verified LeetCode acceptances. See the [validation report](../../docs/VALIDATION.md) for the verification scope.
