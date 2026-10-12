import java.util.*;
class RegressionTest {
 static void check(boolean value){if(!value)throw new AssertionError("Tree regression failed");}
 
 public static void main(String[] args){
  Solution s=new Solution();
  TreeNode n=new TreeNode(5,new TreeNode(3,new TreeNode(2),new TreeNode(4)),new TreeNode(6,null,new TreeNode(7)));check(s.findTarget(n,9));check(!s.findTarget(n,28));
 }
}
