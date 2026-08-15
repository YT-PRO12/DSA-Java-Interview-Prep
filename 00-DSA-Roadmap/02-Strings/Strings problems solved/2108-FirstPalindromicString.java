class Solution {
    public String firstPalindrome(String[] words) {
        for(String s:words){
            int l=0,r=s.length()-1;
            while(l<r&&s.charAt(l)==s.charAt(r)){l++;r--;}
            if(l>=r) return s;
        }
        return "";
    }
}
