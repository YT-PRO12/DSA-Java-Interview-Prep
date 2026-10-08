class Solution {
    private Integer previous;
    private int minimum = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return minimum;
    }
    private void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);
        if (previous != null) minimum = Math.min(minimum, node.val - previous);
        previous = node.val;
        inorder(node.right);
    }
}