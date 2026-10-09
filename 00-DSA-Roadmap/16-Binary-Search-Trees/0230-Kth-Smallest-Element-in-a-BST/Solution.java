import java.util.ArrayDeque;
import java.util.Deque;
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) { stack.push(root); root = root.left; }
            root = stack.pop();
            if (--k == 0) return root.val;
            root = root.right;
        }
        throw new IllegalArgumentException("k exceeds node count");
    }
}