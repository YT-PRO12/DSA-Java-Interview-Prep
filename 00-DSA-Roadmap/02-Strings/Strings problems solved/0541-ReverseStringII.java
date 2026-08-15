class Solution {
    public String reverseStr(String s, int k) {
        char[] a=s.toCharArray();
        for(int start=0;start<a.length;start+=2*k){
            int l=start,r=Math.min(start+k-1,a.length-1);
            while(l<r){char t=a[l];a[l++]=a[r];a[r--]=t;}
        }
        return new String(a);
    }
}
