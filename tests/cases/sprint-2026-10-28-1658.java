import java.util.*;
class RegressionTest {
    public static void main(String[] args) {
Solution s = new Solution();
assert s.minOperations(new int[]{1,1,4,2,3},5)==2;
assert s.minOperations(new int[]{5,6,7,8,9},4)==-1;
assert s.minOperations(new int[]{3,2,20,1,1,3},10)==5;
assert s.minOperations(new int[]{1,2},3)==2;
assert s.minOperations(new int[]{1,2},4)==-1;
Random random = new Random(1658);
for(int trial=0;trial<1000;trial++) {
 int[] a=new int[1+random.nextInt(10)];for(int i=0;i<a.length;i++)a[i]=1+random.nextInt(10);
 int x=1+random.nextInt(100),expected=Integer.MAX_VALUE;
 for(int left=0;left<=a.length;left++)for(int right=0;right+left<=a.length;right++){
  int removed=0;for(int i=0;i<left;i++)removed+=a[i];for(int i=0;i<right;i++)removed+=a[a.length-1-i];
  if(removed==x)expected=Math.min(expected,left+right);
 }
 int[] before=a.clone();assert s.minOperations(a,x)==(expected==Integer.MAX_VALUE?-1:expected);assert Arrays.equals(a,before);
}
int[] large=new int[100000];Arrays.fill(large,10000);assert s.minOperations(large,1000000000)==100000;
    }
}
