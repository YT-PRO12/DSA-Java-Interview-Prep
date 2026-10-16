import java.util.*;
class RegressionTest {
 static void check(boolean x){if(!x)throw new AssertionError("Regression failure");}
 
 public static void main(String[] args){Solution s=new Solution();check(s.rangeSumBST(new TreeNode(10,new TreeNode(5,new TreeNode(3),new TreeNode(7)),new TreeNode(15,null,new TreeNode(18))),7,15)==32);}
}
