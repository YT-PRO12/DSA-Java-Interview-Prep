class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        for(char x:t.toCharArray()) if(i<s.length() && s.charAt(i)==x) i++;
        return i==s.length();
    }
}
