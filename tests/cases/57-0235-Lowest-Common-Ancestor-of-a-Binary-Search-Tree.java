import java.util.*;
class RegressionTest {
 static void check(boolean value){if(!value)throw new AssertionError("Tree regression failed");}
 
 public static void main(String[] args){
  Solution s=new Solution();
  TreeNode a=new TreeNode(2),b=new TreeNode(8),r=new TreeNode(6,a,b);check(s.lowestCommonAncestor(r,a,b)==r);
 }
}
