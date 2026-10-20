class RegressionTest {
 static void check(boolean ok){if(!ok)throw new AssertionError("subarray sum equals k");}
 public static void main(String[] args){
  check(SubarraySumEqualsK.subarraySum(new int[]{1,1,1},2)==2);
  check(SubarraySumEqualsK.subarraySum(new int[]{1,2,3},3)==2);
  check(SubarraySumEqualsK.subarraySum(new int[]{1,-1,0},0)==3);
  check(SubarraySumEqualsK.subarraySum(new int[]{},0)==0);
  check(SubarraySumEqualsK.subarraySum(new int[]{-1,-1,1},-1)==3);
 }
}