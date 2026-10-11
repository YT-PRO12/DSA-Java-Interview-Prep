import java.util.*;
class RegressionTest {
    private static void check(boolean ok) {
        if(!ok) throw new AssertionError("Regression assertion failed");
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        check(s.combinationSum2(new int[]{10,1,2,7,6,1,5},8).size()==4); check(s.combinationSum2(new int[]{2,5,2,1,2},5).size()==2);
    }
}
