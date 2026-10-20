class RegressionTest {
 static void check(boolean ok){if(!ok)throw new AssertionError("longest common prefix");}
 public static void main(String[] args){
  check(LongestCommonPrefix.longestCommonPrefix(new String[]{"flower","flow","flight"}).equals("fl"));
  check(LongestCommonPrefix.longestCommonPrefix(new String[]{"dog","racecar","car"}).equals(""));
  check(LongestCommonPrefix.longestCommonPrefix(new String[]{"alone"}).equals("alone"));
  check(LongestCommonPrefix.longestCommonPrefix(new String[]{""}).equals(""));
  check(LongestCommonPrefix.longestCommonPrefix(new String[]{}).equals(""));
  check(LongestCommonPrefix.longestCommonPrefix(new String[]{"prefix","prefix"}).equals("prefix"));
 }
}