import java.util.*;
class RegressionTest {
 static void check(boolean value){if(!value)throw new AssertionError("Tree regression failed");}
 static int smallest(TreeNode n){while(n.left!=null)n=n.left;return n.val;} static int largest(TreeNode n){while(n.right!=null)n=n.right;return n.val;}
 public static void main(String[] args){
  Solution s=new Solution();
  TreeNode n=s.sortedArrayToBST(new int[]{1,2,3,4,5});check(n!=null);check(smallest(n)==1);check(largest(n)==5);
 }
}
