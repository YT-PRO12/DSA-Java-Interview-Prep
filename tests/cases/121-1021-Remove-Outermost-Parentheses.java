class RegressionTest {
    private static void check(String actual, String expected) {
        if (!expected.equals(actual)) throw new AssertionError("Expected " + expected + " but got " + actual);
    }
    public static void main(String[] args) {
        check(RemoveOuterParentheses.removeOuterParentheses("(()())(())"), "()()()");
        check(RemoveOuterParentheses.removeOuterParentheses("(()())(())(()(()))"), "()()()()(())");
        check(RemoveOuterParentheses.removeOuterParentheses("()()"), "");
        check(RemoveOuterParentheses.removeOuterParentheses(""), "");
    }
}