import java.util.*;
class RegressionTest {
 static void check(boolean value){if(!value)throw new AssertionError("Tree regression failed");}
 
 public static void main(String[] args){
  Solution s=new Solution();
  TreeNode n=new TreeNode(2,new TreeNode(1),new TreeNode(3));check(s.inorderTraversal(n).equals(Arrays.asList(1,2,3)));
 }
}
