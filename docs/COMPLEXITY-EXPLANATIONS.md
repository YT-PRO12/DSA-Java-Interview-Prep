# Explaining algorithm complexity

Name the input measure before giving Big-O: n values, h tree height, k heap capacity, or V vertices and E edges.

| Pattern | Typical time | Auxiliary space |
| --- | --- | --- |
| Linear scan | O(n) | O(1) |
| Iterative binary search | O(log n) | O(1) |
| Binary-tree DFS | O(n) | O(h) |
| Size-k heap for n values | O(n log k) | O(k) |
| Graph BFS | O(V + E) | O(V) |

A balanced BST has h = O(log n); a skewed BST can have h = O(n). Do not infer worst-case complexity from an example trace. State whether returned output storage is included.

When using recursion, account for call-stack depth even when the algorithm creates no explicit data structure.
