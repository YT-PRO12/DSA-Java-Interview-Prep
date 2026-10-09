import java.util.*;

class RegressionTest {
    private static void check(boolean condition) {
        if (!condition) throw new AssertionError("Regression assertion failed");
    }
    public static void main(String[] args) {
        check(GcdLcm.gcd(18,24)==6 && GcdLcm.lcm(18,24)==72);
        check(GcdLcm.gcd(0,0)==0 && GcdLcm.lcm(0,4)==0);
        check(GcdLcm.gcd(Integer.MIN_VALUE,0)==2147483648L);
        check(GcdLcm.lcm(Integer.MIN_VALUE,Integer.MAX_VALUE)==4611686016279904256L);
        for(int a=-20;a<=20;a++) for(int b=-20;b<=20;b++) {
         long expected=java.math.BigInteger.valueOf(a).gcd(java.math.BigInteger.valueOf(b)).longValue();
         check(GcdLcm.gcd(a,b)==expected);
        }
    }
}
