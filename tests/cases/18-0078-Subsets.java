import java.util.*;

class RegressionTest {
    private static void check(boolean condition) {
        if (!condition) throw new AssertionError("Regression assertion failed");
    }
    public static void main(String[] args) {
        Solution s=new Solution();for(int n=0;n<=8;n++){int[] a=new int[n];for(int i=0;i<n;i++)a[i]=i;java.util.List<java.util.List<Integer>> out=s.subsets(a);java.util.Set<java.util.List<Integer>> e=new java.util.HashSet<>();for(int mask=0;mask<(1<<n);mask++){java.util.List<Integer> subset=new java.util.ArrayList<>();for(int i=0;i<n;i++)if((mask&(1<<i))!=0)subset.add(i);e.add(subset);}check(out.size()==(1<<n) && new java.util.HashSet<>(out).equals(e));}
    }
}
