class RegressionTest {
    private static void check(boolean actual, boolean expected) {
        if (actual != expected) throw new AssertionError("Isomorphic string regression failed");
    }
    public static void main(String[] args) {
        check(IsomorphicStrings.isIsomorphic("egg", "add"), true);
        check(IsomorphicStrings.isIsomorphic("foo", "bar"), false);
        check(IsomorphicStrings.isIsomorphic("paper", "title"), true);
        check(IsomorphicStrings.isIsomorphic("ab", "cc"), false);
        check(IsomorphicStrings.isIsomorphic("a", "ab"), false);
        check(IsomorphicStrings.isIsomorphic("", ""), true);
    }
}