import java.util.*;
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        dfs(candidates, target, 0, new ArrayList<>(), ans);
        return ans;
    }
    private void dfs(int[] a,int remain,int start,List<Integer> path,List<List<Integer>> ans) {
        if(remain==0) { ans.add(new ArrayList<>(path)); return; }
        for(int i=start;i<a.length && a[i]<=remain;i++) {
            if(i>start && a[i]==a[i-1]) continue;
            path.add(a[i]); dfs(a,remain-a[i],i+1,path,ans); path.remove(path.size()-1);
        }
    }
}