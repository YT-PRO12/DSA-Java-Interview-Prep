# Binary Search Trees — Java Interview Practice

A focused set of 15 LeetCode BST implementations in Java. Solutions use LeetCode's provided `TreeNode` and, where needed, `ListNode` definitions.

## Problem Index

| LC | Problem | Pattern |
|---:|---|---|
| 98 | Validate Binary Search Tree | Recursive bounds |
| 108 | Convert Sorted Array to BST | Divide and conquer |
| 109 | Convert Sorted List to BST | Slow/fast pointers |
| 230 | Kth Smallest Element in a BST | Inorder stack |
| 235 | Lowest Common Ancestor of a BST | Ordered descent |
| 450 | Delete Node in a BST | Successor replacement |
| 501 | Find Mode in Binary Search Tree | Inorder frequency |
| 530 | Minimum Absolute Difference in BST | Inorder neighbors |
| 653 | Two Sum IV — Input is a BST | Hash set |
| 669 | Trim a Binary Search Tree | Range pruning |
| 700 | Search in a Binary Search Tree | Ordered search |
| 701 | Insert into a Binary Search Tree | Recursive insertion |
| 897 | Increasing Order Search Tree | Inorder rewiring |
| 938 | Range Sum of BST | BST pruning |
| 1008 | Construct BST from Preorder Traversal | Recursive value bounds |

## Pattern Roadmap

```text
Search and Insert
      ↓
Validate and Traverse
      ↓
Order Statistics
      ↓
Delete and Prune
      ↓
Construct and Transform
```

## Complexity Notes

A balanced BST typically supports search, insert, and delete in `O(log n)` time, but a skewed BST can require `O(n)`. Inorder traversal visits values in sorted order. Tree-wide traversals take `O(n)` time.

## Format

Each folder uses the official four-digit LeetCode ID followed by the problem slug and contains `Solution.java`. These are prepared implementations, not a claim that any submission was accepted on LeetCode.
