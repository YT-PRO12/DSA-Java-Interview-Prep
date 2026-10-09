import java.util.*;

class RegressionTest {
    private static void check(boolean condition) {
        if (!condition) throw new AssertionError("Regression assertion failed");
    }
    public static void main(String[] args) {
        for(String x:new String[]{"","a","abba","racecar","ab","Aa","abca"}) check(RecursivePalindrome.isPalindrome(x)==x.equals(new StringBuilder(x).reverse().toString()));
    }
}
