import java.util.*;

class RegressionTest {
    private static void check(boolean condition) {
        if (!condition) throw new AssertionError("Regression assertion failed");
    }
    public static void main(String[] args) {
        check(ArrayRecursion.sum(new int[0])==0 && ArrayRecursion.firstIndex(new int[0],1)==-1);
        check(ArrayRecursion.sum(new int[]{Integer.MAX_VALUE,Integer.MAX_VALUE})==4294967294L);
        int[] a={4,2,4,7};check(ArrayRecursion.sum(a)==17 && ArrayRecursion.firstIndex(a,4)==0 && ArrayRecursion.firstIndex(a,9)==-1);
    }
}
