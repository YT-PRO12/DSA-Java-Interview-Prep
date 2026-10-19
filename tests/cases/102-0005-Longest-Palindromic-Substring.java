class RegressionTest {
 static void check(boolean x){if(!x)throw new AssertionError("longest palindrome");}
 static boolean palindrome(String s){int l=0,r=s.length()-1;while(l<r)if(s.charAt(l++)!=s.charAt(r--))return false;return true;}
 public static void main(String[] args){
  String a=LongestPalindromicSubstring.longestPalindrome("babad");check(a.length()==3&&palindrome(a));
  check(LongestPalindromicSubstring.longestPalindrome("cbbd").equals("bb"));
  check(LongestPalindromicSubstring.longestPalindrome("a").equals("a"));
  check(LongestPalindromicSubstring.longestPalindrome("").equals(""));
  String e=LongestPalindromicSubstring.longestPalindrome("forgeeksskeegfor");check(e.equals("geeksskeeg"));
 }
}
