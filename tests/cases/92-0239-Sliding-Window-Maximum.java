import java.util.*;
class RegressionTest {
 static void check(boolean x){if(!x)throw new AssertionError("Regression failure");}
 
 public static void main(String[] args){Solution s=new Solution();check(Arrays.equals(s.maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7},3),new int[]{3,3,5,5,6,7}));check(Arrays.equals(s.maxSlidingWindow(new int[]{1},1),new int[]{1}));}
}
