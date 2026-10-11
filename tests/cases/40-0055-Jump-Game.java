import java.util.*;
class RegressionTest {
    private static void check(boolean ok) {
        if(!ok) throw new AssertionError("Regression assertion failed");
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        check(s.canJump(new int[]{2,3,1,1,4}));check(!s.canJump(new int[]{3,2,1,0,4}));
    }
}
