import java.util.*;
class RegressionTest {
 static void check(boolean x){if(!x)throw new AssertionError("Regression failure");}
 
 public static void main(String[] args){TreeNode n=new Solution().bstFromPreorder(new int[]{8,5,1,7,10,12});check(n.val==8 && n.left.val==5 && n.left.left.val==1 && n.left.right.val==7 && n.right.val==10 && n.right.right.val==12);}
}
