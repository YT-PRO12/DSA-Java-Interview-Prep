import java.util.*;

class RegressionTest {
    private static void check(boolean condition) {
        if (!condition) throw new AssertionError("Regression assertion failed");
    }
    public static void main(String[] args) {
        check(Subsequences.generate("").equals(java.util.List.of("")));
        check(new java.util.HashSet<>(Subsequences.generate("abc")).equals(java.util.Set.of("","a","b","c","ab","ac","bc","abc")));
        check(Subsequences.generate("aa").size()==4 && java.util.Collections.frequency(Subsequences.generate("aa"),"a")==2);
        check(Subsequences.generate("abcdefgh").size()==256);
    }
}
