import java.util.*;

class RegressionTest {
    private static void check(boolean condition) {
        if (!condition) throw new AssertionError("Regression assertion failed");
    }
    public static void main(String[] args) {
        Solution s=new Solution();java.util.Random r=new java.util.Random(435);
        for(int trial=0;trial<150;trial++){int n=r.nextInt(9);int[][] a=new int[n][2];for(int i=0;i<n;i++){a[i][0]=r.nextInt(11)-5;a[i][1]=a[i][0]+1+r.nextInt(4);}int max=0;for(int mask=0;mask<(1<<n);mask++){boolean ok=true;for(int i=0;i<n;i++)for(int j=0;j<i;j++)if((mask&(1<<i))!=0 && (mask&(1<<j))!=0 && a[i][0]<a[j][1] && a[j][0]<a[i][1])ok=false;if(ok)max=Math.max(max,Integer.bitCount(mask));}check(s.eraseOverlapIntervals(a)==n-max);}
    }
}
