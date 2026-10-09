import java.util.*;

class RegressionTest {
    private static void check(boolean condition) {
        if (!condition) throw new AssertionError("Regression assertion failed");
    }
    public static void main(String[] args) {
        java.util.Random r=new java.util.Random(4);
        for(int n=0;n<65;n++) {
         int[] input=new int[n];for(int i=0;i<n;i++)input[i]=r.nextInt(21)-10;
         int[] expected=input.clone();java.util.Arrays.sort(expected);
         int[] a=input.clone();ElementarySorts.bubbleSort(a);check(java.util.Arrays.equals(a,expected));
         a=input.clone();ElementarySorts.selectionSort(a);check(java.util.Arrays.equals(a,expected));
         a=input.clone();ElementarySorts.insertionSort(a);check(java.util.Arrays.equals(a,expected));
        }
    }
}
