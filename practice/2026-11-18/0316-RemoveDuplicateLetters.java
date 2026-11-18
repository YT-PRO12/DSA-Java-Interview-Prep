// LeetCode 316: RemoveDuplicateLetters
// Standalone Java solution and regression checks.
// Run: javac RemoveDuplicateLetters.java && java RemoveDuplicateLetters

import java.util.*;
class RemoveDuplicateLetters {
 static String solve(String s) {
  int[] left=new int[26]; boolean[] used=new boolean[26];
  for(char c:s.toCharArray()) left[c-'a']++;
  Deque<Character> st=new ArrayDeque<>();
  for(char c:s.toCharArray()){
   int k=c-'a'; left[k]--;
   if(used[k]) continue;
   while(!st.isEmpty() && st.peek()>c && left[st.peek()-'a']>0)
    used[st.pop()-'a']=false;
   st.push(c); used[k]=true;
  }
  StringBuilder out=new StringBuilder();
  while(!st.isEmpty()) out.append(st.pop());
  return out.reverse().toString();
 }
 public static void main(String[] args){
  if(!solve("bcabc").equals("abc") || !solve("cbacdcbc").equals("acdb")
   || !solve("aaaa").equals("a")) throw new AssertionError();
  System.out.println("PASS");
 }
}
