import java.util.*;

class RegressionTest {
    private static void check(boolean condition) {
        if (!condition) throw new AssertionError("Regression assertion failed");
    }
    public static void main(String[] args) {
        java.util.Random r=new java.util.Random(44);
        for(int n=0;n<=200;n++) {
         int[] input=new int[n];for(int i=0;i<n;i++)input[i]=r.nextInt(41)-20;
         int[] expected=input.clone();java.util.Arrays.sort(expected);
         int[] a=input.clone();DivideAndConquerSorts.mergeSort(a);check(java.util.Arrays.equals(a,expected));
         a=input.clone();DivideAndConquerSorts.quickSort(a);check(java.util.Arrays.equals(a,expected));
         DivideAndConquerSorts.quickSort(a);check(java.util.Arrays.equals(a,expected));
        }
        int[] edge={Integer.MAX_VALUE,Integer.MIN_VALUE,0};DivideAndConquerSorts.quickSort(edge);check(edge[0]==Integer.MIN_VALUE && edge[2]==Integer.MAX_VALUE);
    }
}
