# BST invariants for Java interviews

A binary search tree requires **every** value in a node's left subtree to be less than the node's value, and **every** value in its right subtree to be greater. Checking only immediate children is insufficient.

## Validating bounds

```java
boolean valid(TreeNode node, long min, long max) {
    if (node == null) return true;
    if (node.val <= min || node.val >= max) return false;
    return valid(node.left, min, node.val)
        && valid(node.right, node.val, max);
}
```

Start with `valid(root, Long.MIN_VALUE, Long.MAX_VALUE)`. `long` limits allow `Integer.MIN_VALUE` and `Integer.MAX_VALUE` to be valid node values.

## Recursion contract

A method returning `TreeNode` generally returns the **new root of the processed subtree**. Assigning `root.left = insert(root.left, value)` reconnects that modified subtree. The same reasoning applies to deletion and balancing.

## Interview checklist

- Inorder traversal of a valid BST produces ascending values.
- Search and insertion take `O(h)` time, where `h` is tree height.
- Balanced trees have `h = O(log n)`; a chain has `h = O(n)`.
- Deletion with two children can replace the node with its inorder successor, then remove the duplicate successor from the right subtree.
- Null nodes are valid base cases for range validation.

See [BST roadmap](../00-DSA-Roadmap/16-Binary-Search-Trees/README.md).
