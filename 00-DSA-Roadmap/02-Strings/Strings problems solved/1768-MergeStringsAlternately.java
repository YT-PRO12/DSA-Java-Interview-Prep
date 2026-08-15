class Solution {
    public String mergeAlternately(String a, String b) {
        StringBuilder r=new StringBuilder();
        for(int i=0;i<a.length()||i<b.length();i++){
            if(i<a.length()) r.append(a.charAt(i));
            if(i<b.length()) r.append(b.charAt(i));
        }
        return r.toString();
    }
}
