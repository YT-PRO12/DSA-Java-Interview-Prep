import java.util.*;

class RegressionTest {
    private static void check(boolean condition) {
        if (!condition) throw new AssertionError("Regression assertion failed");
    }
    public static void main(String[] args) {
        for(int value:new int[]{0,1,-1,Integer.MIN_VALUE,42}) for(int p=0;p<32;p++) {
         check(BitOperations.isSet(BitOperations.set(value,p),p));
         check(!BitOperations.isSet(BitOperations.clear(value,p),p));
         check(BitOperations.toggle(BitOperations.toggle(value,p),p)==value);
         check(BitOperations.isSet(value,p)==(((value>>>p)&1)==1));
        }
        boolean rejected=false;try{BitOperations.set(0,32);}catch(IllegalArgumentException ex){rejected=true;}check(rejected);
    }
}
