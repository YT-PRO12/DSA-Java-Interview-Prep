/** LeetCode 129: Sum Root to Leaf Numbers.
 * Carry the accumulated prefix as a number, adding only at leaves.
 * Time O(n), auxiliary recursion stack O(h).
 */
class SumRootToLeafNumbers {
    static class Node {
        final int val;
        Node left, right;
        Node(int val) { this.val = val; }
    }
    static int sumNumbers(Node root) {
        return dfs(root, 0);
    }
    private static int dfs(Node node, int prefix) {
        if (node == null) return 0;
        int value = prefix * 10 + node.val;
        if (node.left == null && node.right == null) return value;
        return dfs(node.left, value) + dfs(node.right, value);
    }
    private static void check(boolean good) {
        if (!good) throw new AssertionError("Root-to-leaf sum regression");
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        a.left = new Node(2);
        a.right = new Node(3);
        check(sumNumbers(a) == 25);
        Node b = new Node(4);
        b.left = new Node(9);
        b.right = new Node(0);
        b.left.left = new Node(5);
        b.left.right = new Node(1);
        check(sumNumbers(b) == 1026);
        check(sumNumbers(new Node(0)) == 0);
        check(sumNumbers(null) == 0);
        System.out.println("PASS");
    }
}
