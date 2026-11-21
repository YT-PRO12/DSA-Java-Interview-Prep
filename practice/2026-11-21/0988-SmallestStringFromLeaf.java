/** LeetCode 988: Smallest String Starting From Leaf.
 * Compare complete strings in leaf-to-root order (not root-to-leaf order).
 * Time O(n*h) worst case for materializing leaf paths; stack O(h).
 */
class SmallestStringFromLeaf {
    static class Node {
        int val;
        Node left, right;
        Node(int val) { this.val = val; }
    }
    private String smallest;
    String smallestFromLeaf(Node root) {
        smallest = null;
        search(root, new StringBuilder());
        return smallest == null ? "" : smallest;
    }
    private void search(Node node, StringBuilder path) {
        if (node == null) return;
        path.append((char) ('a' + node.val));
        if (node.left == null && node.right == null) {
            String candidate = new StringBuilder(path).reverse().toString();
            if (smallest == null || candidate.compareTo(smallest) < 0)
                smallest = candidate;
        } else {
            search(node.left, path);
            search(node.right, path);
        }
        path.setLength(path.length() - 1);
    }
    private static void check(boolean good) {
        if (!good) throw new AssertionError("Smallest leaf string regression");
    }
    public static void main(String[] args) {
        Node first = new Node(0);
        first.left = new Node(1);
        first.right = new Node(2);
        first.left.left = new Node(3);
        first.left.right = new Node(4);
        first.right.left = new Node(3);
        first.right.right = new Node(4);
        check(new SmallestStringFromLeaf().smallestFromLeaf(first).equals("dba"));

        Node second = new Node(0);
        second.left = new Node(1);
        second.right = new Node(1);
        second.right.left = new Node(0);
        check(new SmallestStringFromLeaf().smallestFromLeaf(second).equals("aba"));
        check(new SmallestStringFromLeaf().smallestFromLeaf(new Node(25)).equals("z"));
        System.out.println("PASS");
    }
}
