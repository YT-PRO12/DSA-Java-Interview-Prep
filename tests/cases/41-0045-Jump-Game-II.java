import java.util.*;
class RegressionTest {
    private static void check(boolean ok) {
        if(!ok) throw new AssertionError("Regression assertion failed");
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        check(s.jump(new int[]{2,3,1,1,4})==2);check(s.jump(new int[]{0})==0);check(s.jump(new int[]{2,3,0,1,4})==2);
    }
}
