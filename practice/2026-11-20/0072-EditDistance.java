/** LeetCode 72: Edit Distance.
 * dp[j] is the cost for the previous row before it is overwritten.
 * O(m*n) time, O(n) auxiliary space.
 */
class EditDistance {
    static int minDistance(String first, String second) {
        int[] dp = new int[second.length() + 1];
        for (int j = 0; j < dp.length; j++) dp[j] = j;
        for (int i = 1; i <= first.length(); i++) {
            int diagonal = dp[0];
            dp[0] = i;
            for (int j = 1; j <= second.length(); j++) {
                int previousRow = dp[j];
                if (first.charAt(i - 1) == second.charAt(j - 1)) {
                    dp[j] = diagonal;
                } else {
                    dp[j] = 1 + Math.min(diagonal, Math.min(dp[j], dp[j - 1]));
                }
                diagonal = previousRow;
            }
        }
        return dp[second.length()];
    }

    public static void main(String[] args) {
        check(minDistance("horse", "ros") == 3);
        check(minDistance("intention", "execution") == 5);
        check(minDistance("", "abc") == 3);
        check(minDistance("same", "same") == 0);
        System.out.println("PASS");
    }
    private static void check(boolean pass) {
        if (!pass) throw new AssertionError("Edit Distance regression");
    }
}
