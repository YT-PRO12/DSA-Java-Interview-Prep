# Binary Search Trees

[Roadmap](../README.md) · [Repository guide](../../README.md)

Exploit the ordering invariant to search, validate, delete, prune, construct, and transform BSTs.

## Concepts Covered

- Ordered descent and ancestor bounds
- Sorted inorder traversal and rank
- Successor replacement and pruning
- Balanced construction and pointer rewiring

## Problem Index

| # | LeetCode | Problem | Difficulty | Pattern | Solution |
|---:|---:|---|---|---|---|
| 1 | 98 | [Validate Binary Search Tree](https://leetcode.com/problems/validate-binary-search-tree/) | Medium | Recursive value bounds | [Java](0098-Validate-Binary-Search-Tree/Solution.java) |
| 2 | 108 | [Convert Sorted Array to Binary Search Tree](https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/) | Easy | Balanced divide and conquer | [Java](0108-Convert-Sorted-Array-to-Binary-Search-Tree/Solution.java) |
| 3 | 109 | [Convert Sorted List to Binary Search Tree](https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/) | Medium | Slow/fast split and construction | [Java](0109-Convert-Sorted-List-to-Binary-Search-Tree/Solution.java) |
| 4 | 230 | [Kth Smallest Element in a BST](https://leetcode.com/problems/kth-smallest-element-in-a-bst/) | Medium | Iterative inorder rank | [Java](0230-Kth-Smallest-Element-in-a-BST/Solution.java) |
| 5 | 235 | [Lowest Common Ancestor of a Binary Search Tree](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/) | Medium | Ordered descent | [Java](0235-Lowest-Common-Ancestor-of-a-Binary-Search-Tree/Solution.java) |
| 6 | 450 | [Delete Node in a BST](https://leetcode.com/problems/delete-node-in-a-bst/) | Medium | Inorder successor deletion | [Java](0450-Delete-Node-in-a-BST/Solution.java) |
| 7 | 501 | [Find Mode in Binary Search Tree](https://leetcode.com/problems/find-mode-in-binary-search-tree/) | Easy | Inorder run lengths | [Java](0501-Find-Mode-in-Binary-Search-Tree/Solution.java) |
| 8 | 530 | [Minimum Absolute Difference in BST](https://leetcode.com/problems/minimum-absolute-difference-in-bst/) | Easy | Inorder adjacent difference | [Java](0530-Minimum-Absolute-Difference-in-BST/Solution.java) |
| 9 | 653 | [Two Sum IV - Input is a BST](https://leetcode.com/problems/two-sum-iv-input-is-a-bst/) | Easy | Tree DFS and set lookup | [Java](0653-Two-Sum-IV-Input-is-a-BST/Solution.java) |
| 10 | 669 | [Trim a Binary Search Tree](https://leetcode.com/problems/trim-a-binary-search-tree/) | Medium | Range pruning | [Java](0669-Trim-a-Binary-Search-Tree/Solution.java) |
| 11 | 700 | [Search in a Binary Search Tree](https://leetcode.com/problems/search-in-a-binary-search-tree/) | Easy | Ordered iterative search | [Java](0700-Search-in-a-Binary-Search-Tree/Solution.java) |
| 12 | 701 | [Insert into a Binary Search Tree](https://leetcode.com/problems/insert-into-a-binary-search-tree/) | Medium | Ordered recursive insertion | [Java](0701-Insert-into-a-Binary-Search-Tree/Solution.java) |
| 13 | 897 | [Increasing Order Search Tree](https://leetcode.com/problems/increasing-order-search-tree/) | Easy | Inorder pointer rewiring | [Java](0897-Increasing-Order-Search-Tree/Solution.java) |
| 14 | 938 | [Range Sum of BST](https://leetcode.com/problems/range-sum-of-bst/) | Easy | Range pruning and aggregation | [Java](0938-Range-Sum-of-BST/Solution.java) |
| 15 | 1008 | [Construct Binary Search Tree from Preorder Traversal](https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/) | Medium | Preorder bounded construction | [Java](1008-Construct-Binary-Search-Tree-from-Preorder-Traversal/Solution.java) |

## Learning Progression

1. Search and insert
2. Validate and traverse
3. Rank, delete and prune
4. Construct and transform

## Interview Essentials

- BST validity depends on all ancestor bounds, not just immediate children.
- Search/insert/delete cost O(h): O(log n) when balanced and O(n) when skewed.
- The preserved sorted-list construction repeatedly finds the middle: O(n log n) time.
- Use a fresh Solution instance for preserved stateful mode and minimum-difference examples.

## Learning Outcomes

Use sorted inorder order, handle deletion cases, and distinguish a BST from a balanced BST.

## Related Practice

- [94. Binary Tree Inorder Traversal](../15-Binary-Trees/0094-Binary-Tree-Inorder-Traversal)
- [109. Convert Sorted List to Binary Search Tree](0109-Convert-Sorted-List-to-Binary-Search-Tree)
- [700. Search in a Binary Search Tree](0700-Search-in-a-Binary-Search-Tree)

Counts reflect files in this repository, not verified LeetCode acceptances. See the [validation report](../../docs/VALIDATION.md) for the verification scope.
