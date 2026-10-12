import java.util.*;
class RegressionTest {
 static void check(boolean value){if(!value)throw new AssertionError("Tree regression failed");}
 
 public static void main(String[] args){
  Solution s=new Solution();
  TreeNode n=s.trimBST(new TreeNode(3,new TreeNode(1,null,new TreeNode(2)),new TreeNode(4)),2,3);check(n.val==3 && n.left.val==2 && n.right==null);
 }
}
