class RegressionTest {
    private static void check(boolean actual, boolean expected) {
        if (actual != expected) throw new AssertionError("Word pattern regression failed");
    }
    public static void main(String[] args) {
        check(WordPattern.wordPattern("abba", "dog cat cat dog"), true);
        check(WordPattern.wordPattern("abba", "dog cat cat fish"), false);
        check(WordPattern.wordPattern("aaaa", "dog cat cat dog"), false);
        check(WordPattern.wordPattern("abba", "dog dog dog dog"), false);
        check(WordPattern.wordPattern("abc", "one two three"), true);
        check(WordPattern.wordPattern("ab", "single"), false);
    }
}