# BST deletion dry run (LeetCode 450)

Delete 7 from the BST with root 7, left subtree 3 and right subtree rooted at 10 with left child 8.

The node 7 has two children, so find the smallest value in its right subtree: **8**. Copy 8 into the current node. Recursively delete the old node holding 8 from the right subtree.

The updated tree is rooted at 8, with left child 3 and right child 10. There is no duplicate 8 left.

## Recursive return contract

When deleting a node with no left child, return its right child. When deleting one with no right child, return its left child. The caller assigns the returned subtree root into `root.left` or `root.right`.

Time `O(h)`, where `h` is the tree height; recursive call stack `O(h)`.
