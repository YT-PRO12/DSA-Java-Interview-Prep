class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder b=new StringBuilder();
        for(String w:words){
            b.append(w);
            if(b.length()>=s.length()) return b.toString().equals(s);
        }
        return false;
    }
}
