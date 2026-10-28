import java.util.*;
class RegressionTest {
    public static void main(String[] args) {
Solution s=new Solution();
assert s.maxScore(new int[]{1,2,3,4,5,6,1},3)==12;
assert s.maxScore(new int[]{9,7,7,9,7,7,9},7)==55;
assert s.maxScore(new int[]{100,1,1,100},2)==200;
Random random=new Random(1423);
for(int trial=0;trial<1000;trial++){
 int[] a=new int[1+random.nextInt(10)];for(int i=0;i<a.length;i++)a[i]=1+random.nextInt(30);
 int k=1+random.nextInt(a.length);int[] before=a.clone();
 assert s.maxScore(a,k)==brute(a,0,a.length-1,k);assert Arrays.equals(a,before);
}
int[] large=new int[100000];Arrays.fill(large,10000);assert s.maxScore(large,large.length)==1000000000;
    }
    private static int brute(int[] a,int left,int right,int k) {
        if(k==0)return 0;
        return Math.max(a[left]+brute(a,left+1,right,k-1),a[right]+brute(a,left,right-1,k-1));
    }
}
