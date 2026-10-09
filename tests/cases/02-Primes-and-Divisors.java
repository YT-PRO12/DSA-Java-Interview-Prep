import java.util.*;

class RegressionTest {
    private static void check(boolean condition) {
        if (!condition) throw new AssertionError("Regression assertion failed");
    }
    public static void main(String[] args) {
        check(!PrimesAndDivisors.isPrime(-7) && !PrimesAndDivisors.isPrime(1));
        check(PrimesAndDivisors.isPrime(2) && PrimesAndDivisors.isPrime(Integer.MAX_VALUE));
        check(PrimesAndDivisors.divisors(36).equals(java.util.List.of(1,2,3,4,6,9,12,18,36)));
        for(int n=1;n<=200;n++) {
         java.util.List<Integer> expected=new java.util.ArrayList<>();
         for(int d=1;d<=n;d++) if(n%d==0) expected.add(d);
         check(PrimesAndDivisors.divisors(n).equals(expected));
         check(PrimesAndDivisors.isPrime(n)==(expected.size()==2));
        }
        boolean rejected=false;try{PrimesAndDivisors.divisors(0);}catch(IllegalArgumentException ex){rejected=true;}check(rejected);
    }
}
