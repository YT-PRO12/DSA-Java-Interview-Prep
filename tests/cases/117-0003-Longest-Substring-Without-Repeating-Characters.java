class RegressionTest {
 static void check(boolean ok){if(!ok)throw new AssertionError("longest substring");}
 public static void main(String[] args){
  check(LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabcbb")==3);
  check(LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("bbbbb")==1);
  check(LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("pwwkew")==3);
  check(LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("")==0);
  check(LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcdef")==6);
  check(LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abba")==2);
 }
}