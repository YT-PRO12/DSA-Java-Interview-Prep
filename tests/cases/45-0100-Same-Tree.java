import java.util.*;
class RegressionTest {
 static void check(boolean value){if(!value)throw new AssertionError("Tree regression failed");}
 
 public static void main(String[] args){
  Solution s=new Solution();
  check(s.isSameTree(new TreeNode(1,new TreeNode(2),null),new TreeNode(1,new TreeNode(2),null)));check(!s.isSameTree(new TreeNode(1),new TreeNode(2)));
 }
}
