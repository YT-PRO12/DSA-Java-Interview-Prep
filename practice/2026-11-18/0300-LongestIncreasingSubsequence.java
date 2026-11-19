// LeetCode 300: LongestIncreasingSubsequence
// Standalone Java solution and regression checks.
// Run: javac LongestIncreasingSubsequence.java && java LongestIncreasingSubsequence

class LongestIncreasingSubsequence {
 static int solve(int[] nums){
  int[] tails=new int[nums.length];int size=0;
  for(int x:nums){
   int lo=0,hi=size;
   while(lo<hi){
    int mid=lo+(hi-lo)/2;
    if(tails[mid]<x)lo=mid+1;else hi=mid;
   }
   tails[lo]=x;
   if(lo==size)size++;
  }
  return size;
 }
 public static void main(String[] args){
  if(solve(new int[]{10,9,2,5,3,7,101,18})!=4 ||
   solve(new int[]{7,7,7})!=1||solve(new int[0])!=0)throw new AssertionError();
  System.out.println("PASS");
 }
}
