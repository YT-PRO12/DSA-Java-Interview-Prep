import java.util.*;
class RegressionTest {
 static void check(boolean value){if(!value)throw new AssertionError("Tree regression failed");}
 
 public static void main(String[] args){
  Solution s=new Solution();
  TreeNode n=new TreeNode(4,new TreeNode(2),new TreeNode(7));check(s.searchBST(n,7)==n.right);check(s.searchBST(n,99)==null);
 }
}
