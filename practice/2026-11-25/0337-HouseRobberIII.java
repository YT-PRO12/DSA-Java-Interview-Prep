/** LeetCode 337: House Robber III. O(n) time and O(h) recursion space. */
class HouseRobberIII {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }
    static int rob(TreeNode root) {
        int[] states = solve(root);
        return Math.max(states[0], states[1]);
    }
    // [0] is the best when this node is skipped; [1] when it is robbed.
    private static int[] solve(TreeNode node) {
        if (node == null) return new int[]{0, 0};
        int[] left = solve(node.left), right = solve(node.right);
        int skipped = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        int taken = node.val + left[0] + right[0];
        return new int[]{skipped, taken};
    }
    private static void check(boolean ok) {
        if (!ok) throw new AssertionError("House Robber III regression");
    }
    public static void main(String[] args) {
        TreeNode first = new TreeNode(3);
        first.left = new TreeNode(2); first.right = new TreeNode(3);
        first.left.right = new TreeNode(3); first.right.right = new TreeNode(1);
        check(rob(first) == 7);
        TreeNode second = new TreeNode(3);
        second.left = new TreeNode(4); second.right = new TreeNode(5);
        second.left.left = new TreeNode(1); second.left.right = new TreeNode(3);
        second.right.right = new TreeNode(1);
        check(rob(second) == 9);
        check(rob(null) == 0);
        check(rob(new TreeNode(5)) == 5);
        System.out.println("PASS");
    }
}
