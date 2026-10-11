import java.util.*;
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        dfs(nums,0,new ArrayList<>(),result);
        return result;
    }
    private void dfs(int[] nums,int start,List<Integer> path,List<List<Integer>> result) {
        result.add(new ArrayList<>(path));
        for(int i=start;i<nums.length;i++) {
            if(i>start && nums[i]==nums[i-1]) continue;
            path.add(nums[i]); dfs(nums,i+1,path,result); path.remove(path.size()-1);
        }
    }
}