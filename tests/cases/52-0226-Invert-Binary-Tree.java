import java.util.*;
class RegressionTest {
 static void check(boolean value){if(!value)throw new AssertionError("Tree regression failed");}
 
 public static void main(String[] args){
  Solution s=new Solution();
  TreeNode n=s.invertTree(new TreeNode(1,new TreeNode(2),new TreeNode(3)));check(n.left.val==3 && n.right.val==2);
 }
}
