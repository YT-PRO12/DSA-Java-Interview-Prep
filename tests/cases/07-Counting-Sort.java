import java.util.*;

class RegressionTest {
    private static void check(boolean condition) {
        if (!condition) throw new AssertionError("Regression assertion failed");
    }
    public static void main(String[] args) {
        java.util.Random r=new java.util.Random(444);
        for(int n=0;n<100;n++){int[] a=new int[n];for(int i=0;i<n;i++)a[i]=r.nextInt(11);int[] e=a.clone();java.util.Arrays.sort(e);CountingSort.sort(a,10);check(java.util.Arrays.equals(a,e));}
        boolean rejected=false;try{CountingSort.sort(new int[]{-1},2);}catch(IllegalArgumentException ex){rejected=true;}check(rejected);
        rejected=false;try{CountingSort.sort(new int[]{},Integer.MAX_VALUE);}catch(IllegalArgumentException ex){rejected=true;}check(rejected);
    }
}
