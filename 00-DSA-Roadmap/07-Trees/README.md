# Trees

A curated Java interview-preparation set covering binary tree recursion, DFS traversals, BFS level order, structural comparison, height, balance, and diameter patterns.

## Current Problem Set

| LeetCode | Problem | Difficulty | Pattern |
|---:|---|---|---|
| 94 | Binary Tree Inorder Traversal | Easy | DFS traversal |
| 100 | Same Tree | Easy | Structural recursion |
| 101 | Symmetric Tree | Easy | Mirror recursion |
| 102 | Binary Tree Level Order Traversal | Medium | BFS |
| 104 | Maximum Depth of Binary Tree | Easy | Height recursion |
| 110 | Balanced Binary Tree | Easy | Postorder + height |
| 144 | Binary Tree Preorder Traversal | Easy | DFS traversal |
| 145 | Binary Tree Postorder Traversal | Easy | DFS traversal |
| 226 | Invert Binary Tree | Easy | Recursive transformation |
| 543 | Diameter of Binary Tree | Easy | Postorder + height |

## Pattern Progression

```text
TreeNode Basics
      ↓
Recursive DFS
      ↓
Preorder / Inorder / Postorder
      ↓
Structural Comparison
      ↓
Breadth-First Search
      ↓
Height / Balance
      ↓
Diameter / Tree DP
```

## Naming Convention

Each official LeetCode problem follows:

```text
XXXX-Problem-Name/
└── Solution.java
```

## Interview Notes

- Most tree problems reduce naturally to recursion on left and right subtrees.
- Decide whether your recursive function should return a value or update shared state.
- Postorder is especially useful when a parent depends on information from both children.
- BFS is the standard choice when the problem is level-oriented.
- For height-based problems, avoid recomputing subtree heights when one traversal can return them.
