/** LeetCode 309: Best Time to Buy and Sell Stock with Cooldown.
 * held: own one share; sold: sold today; rest: own none and may buy.
 * State transitions use only the previous day. O(n) time, O(1) space.
 */
class StockWithCooldown {
    static int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int held = -prices[0], sold = Integer.MIN_VALUE, rest = 0;
        for (int i = 1; i < prices.length; i++) {
            int nextHeld = Math.max(held, rest - prices[i]);
            int nextSold = held + prices[i];
            int nextRest = Math.max(rest, sold);
            held = nextHeld;
            sold = nextSold;
            rest = nextRest;
        }
        return Math.max(0, Math.max(rest, sold));
    }
    private static void check(boolean condition) {
        if (!condition) throw new AssertionError("Stock cooldown regression");
    }
    public static void main(String[] args) {
        check(maxProfit(new int[]{1, 2, 3, 0, 2}) == 3);
        check(maxProfit(new int[]{1}) == 0);
        check(maxProfit(new int[]{2, 1}) == 0);
        check(maxProfit(new int[]{1, 2}) == 1);
        check(maxProfit(new int[]{}) == 0);
        check(maxProfit(new int[]{6, 1, 6, 4, 3, 0, 2}) == 7);
        System.out.println("PASS");
    }
}
