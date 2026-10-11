import java.util.*;
class RegressionTest {
    private static void check(boolean ok) {
        if(!ok) throw new AssertionError("Regression assertion failed");
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        check(s.permuteUnique(new int[]{1,1,2}).size()==3); check(s.permuteUnique(new int[]{1,2,3}).size()==6);
    }
}
