import java.util.*;

class RegressionTest {
    private static void check(boolean condition) {
        if (!condition) throw new AssertionError("Regression assertion failed");
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        for(int n=0;n<=7;n++){int limit=(int)Math.pow(3,n);for(int mask=0;mask<limit;mask++){int[] a=new int[n];int v=mask;for(int i=0;i<n;i++){a[i]=v%3;v/=3;}int[] e=a.clone();java.util.Arrays.sort(e);s.sortColors(a);check(java.util.Arrays.equals(a,e));}}
    }
}
