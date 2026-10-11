import java.util.*;
class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result=new ArrayList<>();
        dfs(s,0,new ArrayList<>(),result);
        return result;
    }
    private void dfs(String s,int start,List<String> path,List<List<String>> result) {
        if(start==s.length()) { result.add(new ArrayList<>(path)); return; }
        for(int end=start;end<s.length();end++) {
            if(!palindrome(s,start,end)) continue;
            path.add(s.substring(start,end+1));
            dfs(s,end+1,path,result);
            path.remove(path.size()-1);
        }
    }
    private boolean palindrome(String s,int l,int r) {
        while(l<r) if(s.charAt(l++)!=s.charAt(r--)) return false;
        return true;
    }
}