import java.util.*;

class RegressionTest {
    private static void check(boolean condition) {
        if (!condition) throw new AssertionError("Regression assertion failed");
    }
    public static void main(String[] args) {
        Solution s=new Solution();check(s.numRescueBoats(new int[]{3,2,2,1},3)==3);check(s.numRescueBoats(new int[]{1,2},3)==1);check(s.numRescueBoats(new int[]{3,5,3,4},5)==4);
        java.util.Random r=new java.util.Random(881);for(int trial=0;trial<200;trial++){int limit=1+r.nextInt(10),n=1+r.nextInt(8);int[] a=new int[n];for(int i=0;i<n;i++)a[i]=1+r.nextInt(limit);int[] dp=new int[1<<n];java.util.Arrays.fill(dp,99);dp[0]=0;for(int mask=1;mask<dp.length;mask++){int i=Integer.numberOfTrailingZeros(mask);int rest=mask^(1<<i);dp[mask]=1+dp[rest];for(int j=i+1;j<n;j++)if((rest&(1<<j))!=0 && a[i]+a[j]<=limit)dp[mask]=Math.min(dp[mask],1+dp[rest^(1<<j)]);}check(s.numRescueBoats(a,limit)==dp[dp.length-1]);}
    }
}
