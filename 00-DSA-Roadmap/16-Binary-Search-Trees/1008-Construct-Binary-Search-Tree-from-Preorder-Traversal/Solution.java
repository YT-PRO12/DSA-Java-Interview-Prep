class Solution {
    private int index;
    public TreeNode bstFromPreorder(int[] preorder) {
        index = 0;
        return build(preorder, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    private TreeNode build(int[] preorder, long low, long high) {
        if (index == preorder.length) return null;
        int value = preorder[index];
        if (value <= low || value >= high) return null;
        index++;
        TreeNode root = new TreeNode(value);
        root.left = build(preorder, low, value);
        root.right = build(preorder, value, high);
        return root;
    }
}