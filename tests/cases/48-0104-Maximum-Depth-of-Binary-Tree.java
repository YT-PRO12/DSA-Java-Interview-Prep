import java.util.*;
class RegressionTest {
 static void check(boolean value){if(!value)throw new AssertionError("Tree regression failed");}
 
 public static void main(String[] args){
  Solution s=new Solution();
  check(s.maxDepth(null)==0);check(s.maxDepth(new TreeNode(1,new TreeNode(2),null))==2);
 }
}
