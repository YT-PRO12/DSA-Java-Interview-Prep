import java.util.*;
class RegressionTest {
    public static void main(String[] args) {
Solution s=new Solution();
assert s.numSubarrayProductLessThanK(new int[]{10,5,2,6},100)==8;
assert s.numSubarrayProductLessThanK(new int[]{1,2,3},0)==0;
assert s.numSubarrayProductLessThanK(new int[]{1,1},1)==0;
assert s.numSubarrayProductLessThanK(new int[]{10},10)==0;
Random random=new Random(713);
for(int trial=0;trial<1000;trial++){
 int[] a=new int[1+random.nextInt(10)];for(int i=0;i<a.length;i++)a[i]=1+random.nextInt(9);
 int k=random.nextInt(300),expected=0;
 for(int i=0;i<a.length;i++){long product=1;for(int j=i;j<a.length;j++){product*=a[j];if(product<k)expected++;}}
 int[] before=a.clone();assert s.numSubarrayProductLessThanK(a,k)==expected;assert Arrays.equals(a,before);
}
int[] ones=new int[30000];Arrays.fill(ones,1);assert s.numSubarrayProductLessThanK(ones,2)==450015000;
    }
}
