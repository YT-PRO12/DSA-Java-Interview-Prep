import java.util.*;
class RegressionTest {
    private static void check(boolean ok) {
        if(!ok) throw new AssertionError("Regression assertion failed");
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        check(s.combinationSum3(3,7).size()==1);check(s.combinationSum3(3,9).size()==3);check(s.combinationSum3(4,1).isEmpty());
    }
}
