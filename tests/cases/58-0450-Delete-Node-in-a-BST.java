import java.util.*;
class RegressionTest {
 static void check(boolean value){if(!value)throw new AssertionError("Tree regression failed");}
 
 public static void main(String[] args){
  Solution s=new Solution();
  TreeNode n=s.deleteNode(new TreeNode(2,new TreeNode(1),new TreeNode(3)),2);check(n!=null && n.val!=2);check(s.deleteNode(n,99)==n);
 }
}
