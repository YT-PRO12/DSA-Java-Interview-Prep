import java.util.HashSet;
import java.util.Set;
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        return visit(root, k, new HashSet<>());
    }
    private boolean visit(TreeNode node, int target, Set<Integer> seen) {
        if (node == null) return false;
        if (seen.contains(target - node.val)) return true;
        seen.add(node.val);
        return visit(node.left, target, seen) || visit(node.right, target, seen);
    }
}