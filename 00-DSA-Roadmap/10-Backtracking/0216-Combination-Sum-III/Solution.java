import java.util.*;
class Solution {
    public List<List<Integer>> combinationSum3(int k,int n) {
        List<List<Integer>> result=new ArrayList<>();
        dfs(1,k,n,new ArrayList<>(),result);
        return result;
    }
    private void dfs(int start,int k,int remain,List<Integer> path,List<List<Integer>> result) {
        if(path.size()==k) {
            if(remain==0) result.add(new ArrayList<>(path));
            return;
        }
        for(int i=start;i<=9 && i<=remain;i++) {
            path.add(i); dfs(i+1,k,remain-i,path,result); path.remove(path.size()-1);
        }
    }
}