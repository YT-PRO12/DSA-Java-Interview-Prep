import java.util.*;
class Solution {
    private static final String[] KEYS={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> result=new ArrayList<>();
        if(digits.isEmpty()) return result;
        dfs(digits,0,new StringBuilder(),result);
        return result;
    }
    private void dfs(String digits,int pos,StringBuilder path,List<String> result) {
        if(pos==digits.length()) { result.add(path.toString()); return; }
        String letters=KEYS[digits.charAt(pos)-'0'];
        for(char ch:letters.toCharArray()) {
            path.append(ch); dfs(digits,pos+1,path,result); path.deleteCharAt(path.length()-1);
        }
    }
}