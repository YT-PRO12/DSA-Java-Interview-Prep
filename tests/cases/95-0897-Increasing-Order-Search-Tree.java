import java.util.*;
class RegressionTest {
 static void check(boolean x){if(!x)throw new AssertionError("Regression failure");}
 
 public static void main(String[] args){TreeNode n=new Solution().increasingBST(new TreeNode(2,new TreeNode(1),new TreeNode(3)));check(n.val==1 && n.left==null);check(n.right.val==2 && n.right.left==null);check(n.right.right.val==3 && n.right.right.right==null);}
}
