class RegressionTest {
 static void check(boolean x){if(!x)throw new AssertionError("maximum subarray");}
 public static void main(String[] args){
  check(KadaneMaximumSubarray.maxSubarraySum(new int[]{-2,1,-3,4,-1,2,1,-5,4})==6);
  check(KadaneMaximumSubarray.maxSubarraySum(new int[]{-8,-3,-6,-2,-5,-4})==-2);
  check(KadaneMaximumSubarray.maxSubarraySum(new int[]{7})==7);
  check(KadaneMaximumSubarray.maxSubarraySum(new int[]{0,0,0})==0);
 }
}
