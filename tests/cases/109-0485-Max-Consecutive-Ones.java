class RegressionTest {
 static void check(boolean ok){if(!ok)throw new AssertionError("consecutive ones");}
 public static void main(String[] args){
  check(MaximumConsecutiveOnes.findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1})==3);
  check(MaximumConsecutiveOnes.findMaxConsecutiveOnes(new int[]{0,0,0})==0);
  check(MaximumConsecutiveOnes.findMaxConsecutiveOnes(new int[]{1,1,1,1})==4);
  check(MaximumConsecutiveOnes.findMaxConsecutiveOnes(new int[]{})==0);
  check(MaximumConsecutiveOnes.findMaxConsecutiveOnes(new int[]{1})==1);
 }
}