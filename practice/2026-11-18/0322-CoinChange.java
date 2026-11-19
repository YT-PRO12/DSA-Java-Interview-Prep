// LeetCode 322: CoinChange
// Standalone Java solution and regression checks.
// Run: javac CoinChange.java && java CoinChange

import java.util.Arrays;
class CoinChange {
 static int solve(int[] coins,int amount){
  int sentinel=amount+1;
  int[] dp=new int[amount+1];
  Arrays.fill(dp,sentinel);dp[0]=0;
  for(int sum=1;sum<=amount;sum++)
   for(int coin:coins)
    if(coin>0&&coin<=sum&&dp[sum-coin]!=sentinel)
     dp[sum]=Math.min(dp[sum],dp[sum-coin]+1);
  return dp[amount]==sentinel?-1:dp[amount];
 }
 public static void main(String[] args){
  if(solve(new int[]{1,2,5},11)!=3||solve(new int[]{2},3)!=-1||
   solve(new int[]{2},0)!=0)throw new AssertionError();
  System.out.println("PASS");
 }
}
