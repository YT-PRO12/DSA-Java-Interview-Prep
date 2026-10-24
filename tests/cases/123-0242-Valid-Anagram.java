class RegressionTest {
    private static void check(boolean actual, boolean expected) {
        if (actual != expected) throw new AssertionError("Anagram regression failed");
    }
    public static void main(String[] args) {
        check(ValidAnagram.isAnagram("anagram", "nagaram"), true);
        check(ValidAnagram.isAnagram("rat", "car"), false);
        check(ValidAnagram.isAnagram("", ""), true);
        check(ValidAnagram.isAnagram("a", "aa"), false);
        check(ValidAnagram.isAnagram("listen", "silent"), true);
    }
}