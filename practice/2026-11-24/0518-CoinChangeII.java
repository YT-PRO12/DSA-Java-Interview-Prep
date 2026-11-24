/** Coin-first iteration counts combinations, not permutations.
 * O(amount * coins.length) time and O(amount) space.
 */
class CoinChangeII {
    static int change(int amount, int[] coins) {
        int[] dp = new int[amount+1];
        dp[0] = 1;
        for (int coin : coins)
            for (int value = coin; value <= amount; value++)
                dp[value] += dp[value-coin];
        return dp[amount];
    }
    public static void main(String[] args) {
        if (change(5,new int[]{1,2,5}) != 4
                || change(3,new int[]{2}) != 0
                || change(0,new int[]{2}) != 1
                || change(10,new int[]{10}) != 1)
            throw new AssertionError("Combination count regression");
        System.out.println("PASS");
    }
}
