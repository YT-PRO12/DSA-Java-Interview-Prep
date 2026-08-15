class Solution {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }
    private String build(String s) {
        StringBuilder b=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c=='#'){if(b.length()>0)b.deleteCharAt(b.length()-1);}
            else b.append(c);
        }
        return b.toString();
    }
}
