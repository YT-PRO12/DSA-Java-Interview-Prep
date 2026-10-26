import java.util.*;
class RegressionTest {
 public static void main(String[] args) {
Solution s=new Solution();
assert s.maxFrequency(new int[]{1,2,4},5)==3;
int[] large=new int[100000];Arrays.fill(large,100000);large[0]=1;
assert s.maxFrequency(large,100000)==100000;
int[] split=new int[100000];Arrays.fill(split,1);Arrays.fill(split,50000,100000,100000);
assert s.maxFrequency(split,100000)==50001;
Random random=new Random(1838);
for(int trial=0;trial<300;trial++){
 int[] a=new int[1+random.nextInt(9)];for(int i=0;i<a.length;i++)a[i]=1+random.nextInt(20);
 int[] before=a.clone();int k=1+random.nextInt(40),best=0;
 for(int mask=1;mask<(1<<a.length);mask++){int max=0,count=0;long sum=0;for(int i=0;i<a.length;i++)if((mask&(1<<i))!=0){max=Math.max(max,a[i]);sum+=a[i];count++;}if((long)max*count-sum<=k)best=Math.max(best,count);}
 assert s.maxFrequency(a,k)==best;assert Arrays.equals(a,before);
}

 }
}
