import java.util.*;

class RegressionTest {
    private static void check(boolean condition) {
        if (!condition) throw new AssertionError("Regression assertion failed");
    }
    public static void main(String[] args) {
        Solution s=new Solution();int[] input={7,2,3,6};java.util.Set<java.util.List<Integer>> got=new java.util.HashSet<>(s.combinationSum(input,7));check(got.equals(java.util.Set.of(java.util.List.of(2,2,3),java.util.List.of(7))));check(java.util.Arrays.equals(input,new int[]{7,2,3,6}));
        for(int target=1;target<=20;target++){java.util.Set<java.util.List<Integer>> e=new java.util.HashSet<>();for(int a=0;a*2<=target;a++)for(int b=0;a*2+b*3<=target;b++)for(int c=0;a*2+b*3+c*5<=target;c++)if(a*2+b*3+c*5==target){java.util.List<Integer> p=new java.util.ArrayList<>();for(int i=0;i<a;i++)p.add(2);for(int i=0;i<b;i++)p.add(3);for(int i=0;i<c;i++)p.add(5);e.add(p);}java.util.List<java.util.List<Integer>> out=s.combinationSum(new int[]{2,3,5},target);check(out.size()==e.size() && new java.util.HashSet<>(out).equals(e));}
    }
}
