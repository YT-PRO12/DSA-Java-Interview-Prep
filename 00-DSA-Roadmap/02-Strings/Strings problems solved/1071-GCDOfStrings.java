class Solution {
    public String gcdOfStrings(String a, String b) {
        if(!(a+b).equals(b+a)) return "";
        int x=a.length(),y=b.length();
        while(y!=0){int t=x%y;x=y;y=t;}
        return a.substring(0,x);
    }
}
