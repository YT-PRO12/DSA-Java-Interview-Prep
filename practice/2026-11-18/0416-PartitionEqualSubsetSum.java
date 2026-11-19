// LeetCode 416: PartitionEqualSubsetSum
// Standalone Java solution and regression checks.
// Run: javac PartitionEqualSubsetSum.java && java PartitionEqualSubsetSum

class PartitionEqualSubsetSum {
 static boolean solve(int[] nums){
  int sum=0;for(int x:nums)sum+=x;
  if((sum&1)==1)return false;
  int target=sum/2;
  boolean[] dp=new boolean[target+1];dp[0]=true;
  for(int x:nums)for(int s=target;s>=x;s--)dp[s]|=dp[s-x];
  return dp[target];
 }
 public static void main(String[] args){
  if(!solve(new int[]{1,5,11,5})||solve(new int[]{1,2,3,5})||
   !solve(new int[]{0,0}))throw new AssertionError();
  System.out.println("PASS");
 }
}
