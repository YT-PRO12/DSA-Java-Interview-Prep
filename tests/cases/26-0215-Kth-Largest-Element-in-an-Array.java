import java.util.*;

class RegressionTest {
    private static void check(boolean condition) {
        if (!condition) throw new AssertionError("Regression assertion failed");
    }
    public static void main(String[] args) {
        Solution s=new Solution();java.util.Random r=new java.util.Random(215);for(int n=1;n<=40;n++){int[] a=new int[n];for(int i=0;i<n;i++)a[i]=r.nextInt(21)-10;int[] sorted=a.clone();java.util.Arrays.sort(sorted);for(int k=1;k<=n;k++)check(s.findKthLargest(a,k)==sorted[n-k]);}
    }
}
