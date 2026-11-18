// LeetCode 173: BSTIterator
// Standalone implementation with executable regression checks.
// Run: javac BSTIterator.java && java BSTIterator

import java.util.ArrayDeque;
import java.util.Deque;

class BSTIterator {
    static class Node {
        int val;
        Node left, right;
        Node(int val) { this.val = val; }
    }
    private final Deque<Node> stack = new ArrayDeque<>();
    BSTIterator(Node root) { pushLeft(root); }
    private void pushLeft(Node node) {
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
    }
    boolean hasNext() { return !stack.isEmpty(); }
    int next() {
        Node node = stack.pop();
        pushLeft(node.right);
        return node.val;
    }
    public static void main(String[] args) {
        Node root = new Node(7);
        root.left = new Node(3);
        root.right = new Node(15);
        root.right.left = new Node(9);
        root.right.right = new Node(20);
        BSTIterator it = new BSTIterator(root);
        for (int x : new int[]{3, 7, 9, 15, 20})
            if (!it.hasNext() || it.next() != x) throw new AssertionError("Inorder mismatch");
        if (it.hasNext()) throw new AssertionError("Iterator should be exhausted");
        System.out.println("PASS");
    }
}
