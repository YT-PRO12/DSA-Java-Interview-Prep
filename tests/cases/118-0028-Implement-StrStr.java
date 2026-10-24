class RegressionTest {
    private static void check(boolean ok) {
        if (!ok) throw new AssertionError("strStr regression failed");
    }
    public static void main(String[] args) {
        check(ImplementStrStr.strStr("sadbutsad", "sad") == 0);
        check(ImplementStrStr.strStr("leetcode", "leeto") == -1);
        check(ImplementStrStr.strStr("hello", "ll") == 2);
        check(ImplementStrStr.strStr("abc", "") == 0);
        check(ImplementStrStr.strStr("a", "a") == 0);
        check(ImplementStrStr.strStr("a", "aa") == -1);
    }
}