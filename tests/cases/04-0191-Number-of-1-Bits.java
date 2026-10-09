import java.util.*;

class RegressionTest {
    private static void check(boolean condition) {
        if (!condition) throw new AssertionError("Regression assertion failed");
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        for(int n:new int[]{0,1,11,128,2147483645,-1,Integer.MIN_VALUE}) check(s.hammingWeight(n)==Integer.bitCount(n));
        java.util.Random r=new java.util.Random(191);for(int i=0;i<1000;i++){int n=r.nextInt();check(s.hammingWeight(n)==Integer.bitCount(n));}
    }
}
