import java.util.*;

class RegressionTest {
    private static void check(boolean condition) {
        if (!condition) throw new AssertionError("Regression assertion failed");
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        for(double x:new double[]{-2,-1,-0.5,0.5,1,2})for(int n=-20;n<=20;n++){double e=Math.pow(x,n);check(Math.abs(s.myPow(x,n)-e)<=1e-10*Math.max(1,Math.abs(e)));}
        check(s.myPow(1,Integer.MIN_VALUE)==1 && s.myPow(2,Integer.MIN_VALUE)==0 && s.myPow(0,3)==0);
    }
}
