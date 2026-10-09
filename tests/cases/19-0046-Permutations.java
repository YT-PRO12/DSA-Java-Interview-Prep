import java.util.*;

class RegressionTest {
    private static void check(boolean condition) {
        if (!condition) throw new AssertionError("Regression assertion failed");
    }
    public static void main(String[] args) {
        Solution s=new Solution();int factorial=1;for(int n=1;n<=6;n++){factorial*=n;int[] a=new int[n];for(int i=0;i<n;i++)a[i]=i;java.util.List<java.util.List<Integer>> out=s.permute(a);check(out.size()==factorial && new java.util.HashSet<>(out).size()==factorial);for(java.util.List<Integer> p:out){check(p.size()==n);java.util.List<Integer> sorted=new java.util.ArrayList<>(p);java.util.Collections.sort(sorted);for(int i=0;i<n;i++)check(sorted.get(i)==i);}}
    }
}
