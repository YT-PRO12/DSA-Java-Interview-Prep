import java.util.*;
class RegressionTest {
    private static void check(boolean ok) {
        if(!ok) throw new AssertionError("Regression assertion failed");
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        check(s.kSmallestPairs(new int[]{1,7,11},new int[]{2,4,6},3).equals(java.util.Arrays.asList(java.util.Arrays.asList(1,2),java.util.Arrays.asList(1,4),java.util.Arrays.asList(1,6))));
    }
}
