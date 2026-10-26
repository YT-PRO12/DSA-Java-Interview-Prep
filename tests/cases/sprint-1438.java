import java.util.*;
class RegressionTest {
 public static void main(String[] args) {
Solution s=new Solution();
assert s.longestSubarray(new int[]{8,2,4,7},4)==2;
assert s.longestSubarray(new int[]{10,1,2,4,7,2},5)==4;
assert s.longestSubarray(new int[]{4,2,2,2,4,4,2,2},0)==3;
Random random=new Random(1438);
for(int trial=0;trial<1000;trial++){
 int[] a=new int[1+random.nextInt(50)];for(int i=0;i<a.length;i++)a[i]=1+random.nextInt(50);
 int limit=random.nextInt(50),best=0;
 for(int i=0;i<a.length;i++){int min=a[i],max=a[i];for(int j=i;j<a.length;j++){min=Math.min(min,a[j]);max=Math.max(max,a[j]);if(max-min<=limit)best=Math.max(best,j-i+1);}}
 assert s.longestSubarray(a,limit)==best;
}
int[] large=new int[100000];Arrays.fill(large,7);assert s.longestSubarray(large,0)==large.length;

 }
}
