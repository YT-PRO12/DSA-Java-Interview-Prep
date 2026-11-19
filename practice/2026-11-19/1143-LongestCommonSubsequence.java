/** LeetCode 1143. One-row dynamic programming: O(mn) time, O(n) space. */
class LongestCommonSubsequence {
    static int longestCommonSubsequence(String first, String second) {
        int[] dp = new int[second.length() + 1];
        for (int i = 1; i <= first.length(); i++) {
            int diagonal = 0;
            for (int j = 1; j <= second.length(); j++) {
                int above = dp[j];
                if (first.charAt(i - 1) == second.charAt(j - 1))
                    dp[j] = diagonal + 1;
                else
                    dp[j] = Math.max(above, dp[j - 1]);
                diagonal = above;
            }
        }
        return dp[second.length()];
    }

    public static void main(String[] args) {
        if (longestCommonSubsequence("abcde", "ace") != 3
                || longestCommonSubsequence("abc", "abc") != 3
                || longestCommonSubsequence("abc", "def") != 0
                || longestCommonSubsequence("", "abc") != 0)
            throw new AssertionError("LCS regression");
        System.out.println("PASS");
    }
}
