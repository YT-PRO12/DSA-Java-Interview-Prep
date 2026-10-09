import java.util.*;

class RegressionTest {
    private static void check(boolean condition) {
        if (!condition) throw new AssertionError("Regression assertion failed");
    }
    public static void main(String[] args) {
        Solution s=new Solution();java.util.Random r=new java.util.Random(217);
        for(int n=0;n<80;n++){int[] a=new int[n];for(int i=0;i<n;i++)a[i]=r.nextInt(101)-50;boolean e=false;for(int i=0;i<n;i++)for(int j=0;j<i;j++)if(a[i]==a[j])e=true;check(s.containsDuplicate(a)==e);}
        check(s.containsDuplicate(new int[]{Integer.MIN_VALUE,Integer.MIN_VALUE}));
    }
}
