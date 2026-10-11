import java.util.*;
class RegressionTest {
    private static void check(boolean ok) {
        if(!ok) throw new AssertionError("Regression assertion failed");
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        int[] out=s.topKFrequent(new int[]{1,1,1,2,2,3},2);java.util.Arrays.sort(out);check(java.util.Arrays.equals(out,new int[]{1,2}));
    }
}
