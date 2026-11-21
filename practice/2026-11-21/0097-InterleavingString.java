/** LeetCode 97: Interleaving String.
 * dp[j] means the first i chars of a and j chars of b form a prefix of c.
 * Time O(|a|*|b|); auxiliary space O(|b|).
 */
class InterleavingString {
    static boolean isInterleave(String a, String b, String c) {
        if (a.length() + b.length() != c.length()) return false;
        boolean[] dp = new boolean[b.length() + 1];
        dp[0] = true;
        for (int j = 1; j <= b.length(); j++)
            dp[j] = dp[j - 1] && b.charAt(j - 1) == c.charAt(j - 1);
        for (int i = 1; i <= a.length(); i++) {
            dp[0] = dp[0] && a.charAt(i - 1) == c.charAt(i - 1);
            for (int j = 1; j <= b.length(); j++) {
                char next = c.charAt(i + j - 1);
                dp[j] = (dp[j] && a.charAt(i - 1) == next)
                     || (dp[j - 1] && b.charAt(j - 1) == next);
            }
        }
        return dp[b.length()];
    }
    private static void check(boolean good) {
        if (!good) throw new AssertionError("Interleaving regression");
    }
    public static void main(String[] args) {
        check(isInterleave("aabcc", "dbbca", "aadbbcbcac"));
        check(!isInterleave("aabcc", "dbbca", "aadbbbaccc"));
        check(isInterleave("", "", ""));
        check(isInterleave("", "abc", "abc"));
        check(!isInterleave("a", "", "b"));
        check(!isInterleave("a", "b", "a"));
        System.out.println("PASS");
    }
}
