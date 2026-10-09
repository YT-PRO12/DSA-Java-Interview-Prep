import java.util.*;

class RegressionTest {
    private static void check(boolean condition) {
        if (!condition) throw new AssertionError("Regression assertion failed");
    }
    public static void main(String[] args) {
        Solution s=new Solution();java.util.Random r=new java.util.Random(621);for(int trial=0;trial<500;trial++){int length=1+r.nextInt(100),cooldown=r.nextInt(15);char[] a=new char[length];int[] freq=new int[26];for(int i=0;i<length;i++){a[i]=(char)('A'+r.nextInt(8));freq[a[i]-'A']++;}int max=0,ties=0;for(int f:freq)max=Math.max(max,f);for(int f:freq)if(f==max)ties++;int expected=Math.max(length,(max-1)*(cooldown+1)+ties);check(s.leastInterval(a,cooldown)==expected);}
        check(s.leastInterval(new char[]{'A','A','A','B','B','B'},2)==8);
    }
}
