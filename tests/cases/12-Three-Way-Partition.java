import java.util.*;

class RegressionTest {
    private static void check(boolean condition) {
        if (!condition) throw new AssertionError("Regression assertion failed");
    }
    public static void main(String[] args) {
        java.util.Random r=new java.util.Random(66);
        for(int n=0;n<100;n++){int[] a=new int[n];for(int i=0;i<n;i++)a[i]=r.nextInt(11)-5;int[] before=a.clone();int pivot=r.nextInt(15)-7;int[] b=ThreeWayPartition.partition(a,pivot);check(0<=b[0]&&b[0]<=b[1]&&b[1]<=n);for(int i=0;i<n;i++)check(i<b[0]?a[i]<pivot:i<b[1]?a[i]==pivot:a[i]>pivot);java.util.Arrays.sort(before);java.util.Arrays.sort(a);check(java.util.Arrays.equals(a,before));}
    }
}
