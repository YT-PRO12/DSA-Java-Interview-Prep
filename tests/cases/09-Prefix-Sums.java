import java.util.*;

class RegressionTest {
    private static void check(boolean condition) {
        if (!condition) throw new AssertionError("Regression assertion failed");
    }
    public static void main(String[] args) {
        int[] a={Integer.MAX_VALUE,Integer.MAX_VALUE,-3,0};long[] p=PrefixSums.build(a);
        for(int i=0;i<=a.length;i++)for(int j=i;j<=a.length;j++){long e=0;for(int k=i;k<j;k++)e+=a[k];check(PrefixSums.rangeSum(p,i,j)==e);}
        check(PrefixSums.rangeSum(PrefixSums.build(new int[0]),0,0)==0);
        boolean rejected=false;try{PrefixSums.rangeSum(p,2,1);}catch(IllegalArgumentException ex){rejected=true;}check(rejected);
    }
}
