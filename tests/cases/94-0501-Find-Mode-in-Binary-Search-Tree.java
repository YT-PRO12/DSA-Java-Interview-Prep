import java.util.*;
class RegressionTest {
 static void check(boolean x){if(!x)throw new AssertionError("Regression failure");}
 
 public static void main(String[] args){Solution s=new Solution();int[] a=s.findMode(new TreeNode(2,new TreeNode(1),new TreeNode(2)));check(Arrays.equals(a,new int[]{2}));}
}
