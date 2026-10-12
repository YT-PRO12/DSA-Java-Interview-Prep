import java.util.*;
class RegressionTest {
 static void check(boolean value){if(!value)throw new AssertionError("Tree regression failed");}
 
 public static void main(String[] args){
  Solution s=new Solution();
  TreeNode n=s.insertIntoBST(new TreeNode(2,new TreeNode(1),new TreeNode(3)),4);check(n.right.right!=null && n.right.right.val==4);
 }
}
