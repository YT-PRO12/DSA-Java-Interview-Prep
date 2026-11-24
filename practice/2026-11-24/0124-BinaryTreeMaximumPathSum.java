/** Maximum nonempty path: combine two nonnegative branches at each node.
 * O(n) time, O(h) recursion stack.
 */
class BinaryTreeMaximumPathSum {
    static class Node {
        int val;
        Node left, right;
        Node(int val) { this.val = val; }
    }
    private int best;
    int maxPathSum(Node root) {
        best = Integer.MIN_VALUE;
        gain(root);
        return best;
    }
    private int gain(Node node) {
        if (node == null) return 0;
        int left = Math.max(0, gain(node.left));
        int right = Math.max(0, gain(node.right));
        best = Math.max(best, node.val + left + right);
        return node.val + Math.max(left, right);
    }
    public static void main(String[] args) {
        Node root = new Node(-10);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);
        BinaryTreeMaximumPathSum solver = new BinaryTreeMaximumPathSum();
        if (solver.maxPathSum(root) != 42 || solver.maxPathSum(new Node(-3)) != -3)
            throw new AssertionError("Path sum regression");
        System.out.println("PASS");
    }
}
