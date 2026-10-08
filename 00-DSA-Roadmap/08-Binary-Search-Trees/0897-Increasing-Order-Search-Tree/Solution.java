class Solution {
    private TreeNode tail;
    public TreeNode increasingBST(TreeNode root) {
        TreeNode dummy = new TreeNode(0);
        tail = dummy;
        inorder(root);
        return dummy.right;
    }
    private void inorder(TreeNode node) {
        if (node == null) return;
        TreeNode left = node.left;
        TreeNode right = node.right;
        inorder(left);
        node.left = null;
        tail.right = node;
        tail = node;
        inorder(right);
    }
}