import java.util.*;
class RegressionTest {
 public static void main(String[] args) {
Solution s=new Solution();
assert s.findKthPositive(new int[]{2,3,4,7,11},5)==9;
assert s.findKthPositive(new int[]{1,2,3,4},2)==6;
Random random=new Random(1539);
for(int trial=0;trial<1000;trial++){
 int[] a=new int[1+random.nextInt(30)];int value=0;
 for(int i=0;i<a.length;i++){value+=1+random.nextInt(4);a[i]=value;}
 int k=1+random.nextInt(100), left=k, expected=0,index=0;
 while(left>0){expected++;if(index<a.length && a[index]==expected) index++;else left--;}
 assert s.findKthPositive(a,k)==expected;
}

 }
}
