import java.util.*;
class RegressionTest {
    private static void check(boolean ok) {
        if(!ok) throw new AssertionError("Regression assertion failed");
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        check(s.subsetsWithDup(new int[]{1,2,2}).size()==6);check(s.subsetsWithDup(new int[]{0}).size()==2);
    }
}
