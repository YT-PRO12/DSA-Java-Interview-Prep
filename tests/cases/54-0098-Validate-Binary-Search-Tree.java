import java.util.*;
class RegressionTest {
 static void check(boolean value){if(!value)throw new AssertionError("Tree regression failed");}
 
 public static void main(String[] args){
  Solution s=new Solution();
  check(s.isValidBST(new TreeNode(2,new TreeNode(1),new TreeNode(3))));check(!s.isValidBST(new TreeNode(5,new TreeNode(1),new TreeNode(4,new TreeNode(3),new TreeNode(6)))));
 }
}
