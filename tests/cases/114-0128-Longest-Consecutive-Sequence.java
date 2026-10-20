class RegressionTest {
 static void check(boolean ok){if(!ok)throw new AssertionError("longest consecutive sequence");}
 public static void main(String[] args){
  check(LongestConsecutiveSequence.findLongest(new int[]{100,4,200,1,3,2})==4);
  check(LongestConsecutiveSequence.findLongest(new int[]{0,3,7,2,5,8,4,6,0,1})==9);
  check(LongestConsecutiveSequence.findLongest(new int[]{-2,-1,0,1,1})==4);
  check(LongestConsecutiveSequence.findLongest(new int[]{})==0);
  check(LongestConsecutiveSequence.findLongest(new int[]{5,5,5})==1);
 }
}