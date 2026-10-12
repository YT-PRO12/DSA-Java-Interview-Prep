import java.util.*;
class RegressionTest {
 static void check(boolean value){if(!value)throw new AssertionError("Tree regression failed");}
 
 public static void main(String[] args){
  Solution s=new Solution();
  TreeNode n=new TreeNode(3,new TreeNode(1,null,new TreeNode(2)),new TreeNode(4));check(s.kthSmallest(n,1)==1);check(s.kthSmallest(n,3)==3);
 }
}
