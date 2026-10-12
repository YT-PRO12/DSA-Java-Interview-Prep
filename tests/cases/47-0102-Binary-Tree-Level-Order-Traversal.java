import java.util.*;
class RegressionTest {
 static void check(boolean value){if(!value)throw new AssertionError("Tree regression failed");}
 
 public static void main(String[] args){
  Solution s=new Solution();
  TreeNode n=new TreeNode(1,new TreeNode(2),new TreeNode(3));check(s.levelOrder(n).equals(Arrays.asList(Arrays.asList(1),Arrays.asList(2,3))));
 }
}
