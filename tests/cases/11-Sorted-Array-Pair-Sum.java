import java.util.*;

class RegressionTest {
    private static void check(boolean condition) {
        if (!condition) throw new AssertionError("Regression assertion failed");
    }
    public static void main(String[] args) {
        java.util.Random r=new java.util.Random(6);
        for(int n=0;n<50;n++){int[] a=new int[n];for(int i=0;i<n;i++)a[i]=r.nextInt(21)-10;java.util.Arrays.sort(a);for(long target=-21;target<=21;target++){boolean exists=false;for(int i=0;i<n;i++)for(int j=i+1;j<n;j++)if((long)a[i]+a[j]==target)exists=true;int[] got=SortedArrayPairSum.findPair(a,target);check((got[0]>=0)==exists);if(exists)check(got[0]<got[1]&&(long)a[got[0]]+a[got[1]]==target);}}
        check(java.util.Arrays.equals(SortedArrayPairSum.findPair(new int[]{Integer.MAX_VALUE,Integer.MAX_VALUE},4294967294L),new int[]{0,1}));
    }
}
