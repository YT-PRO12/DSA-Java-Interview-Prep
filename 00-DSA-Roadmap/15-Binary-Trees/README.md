# Binary Trees

[Roadmap](../README.md) · [Repository guide](../../README.md)

Apply recursion and queues to binary-tree traversal, structural comparison, height, balance, and diameter.

## Concepts Covered

- Preorder, inorder and postorder DFS
- Breadth-first level order
- Structural and mirror recursion
- Postorder aggregation for height and diameter

## Problem Index

| # | LeetCode | Problem | Difficulty | Pattern | Solution |
|---:|---:|---|---|---|---|
| 1 | 94 | [Binary Tree Inorder Traversal](https://leetcode.com/problems/binary-tree-inorder-traversal/) | Easy | Inorder DFS | [Java](0094-Binary-Tree-Inorder-Traversal/Solution.java) |
| 2 | 100 | [Same Tree](https://leetcode.com/problems/same-tree/) | Easy | Structural recursion | [Java](0100-Same-Tree/Solution.java) |
| 3 | 101 | [Symmetric Tree](https://leetcode.com/problems/symmetric-tree/) | Easy | Mirror recursion | [Java](0101-Symmetric-Tree/Solution.java) |
| 4 | 102 | [Binary Tree Level Order Traversal](https://leetcode.com/problems/binary-tree-level-order-traversal/) | Medium | Breadth-first levels | [Java](0102-Binary-Tree-Level-Order-Traversal/Solution.java) |
| 5 | 104 | [Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/) | Easy | Recursive height | [Java](0104-Maximum-Depth-of-Binary-Tree/Solution.java) |
| 6 | 110 | [Balanced Binary Tree](https://leetcode.com/problems/balanced-binary-tree/) | Easy | Postorder height sentinel | [Java](0110-Balanced-Binary-Tree/Solution.java) |
| 7 | 144 | [Binary Tree Preorder Traversal](https://leetcode.com/problems/binary-tree-preorder-traversal/) | Easy | Preorder DFS | [Java](0144-Binary-Tree-Preorder-Traversal/Solution.java) |
| 8 | 145 | [Binary Tree Postorder Traversal](https://leetcode.com/problems/binary-tree-postorder-traversal/) | Easy | Postorder DFS | [Java](0145-Binary-Tree-Postorder-Traversal/Solution.java) |
| 9 | 226 | [Invert Binary Tree](https://leetcode.com/problems/invert-binary-tree/) | Easy | See implementation and notes | [Java](0226-Invert-Binary-Tree/Solution.java) |
| 10 | 543 | [Diameter of Binary Tree](https://leetcode.com/problems/diameter-of-binary-tree/) | Easy | Postorder diameter | [Java](0543-Diameter-of-Binary-Tree/Solution.java) |

## Learning Progression

1. TreeNode and DFS
2. Structural comparison
3. Breadth-first levels
4. Height, balance and diameter

## Interview Essentials

- Use postorder when a parent depends on child results.
- Count diameter in edges while the helper returns height in nodes.
- A traversal is O(n), but recursive stack space is O(h), which can reach O(n).
- Use a fresh Solution instance for preserved stateful examples, including Diameter.

## Learning Outcomes

Choose a traversal order, define a recursive return contract, and avoid recomputing subtree heights.

## Related Practice

- [98. Validate Binary Search Tree](../16-Binary-Search-Trees/0098-Validate-Binary-Search-Tree)
- [108. Convert Sorted Array to Binary Search Tree](../16-Binary-Search-Trees/0108-Convert-Sorted-Array-to-Binary-Search-Tree)
- [230. Kth Smallest Element in a BST](../16-Binary-Search-Trees/0230-Kth-Smallest-Element-in-a-BST)

Counts reflect files in this repository, not verified LeetCode acceptances. See the [validation report](../../docs/VALIDATION.md) for the verification scope.
