/** LeetCode 198: House Robber.
 * At each house, either skip it or take it plus the best two houses ago.
 * Time O(n), auxiliary space O(1).
 */
class HouseRobber {
    static int rob(int[] nums) {
        int twoBack = 0, previous = 0;
        for (int money : nums) {
            int current = Math.max(previous, twoBack + money);
            twoBack = previous;
            previous = current;
        }
        return previous;
    }
    private static void check(boolean condition) {
        if (!condition) throw new AssertionError("House Robber regression");
    }
    public static void main(String[] args) {
        check(rob(new int[]{1, 2, 3, 1}) == 4);
        check(rob(new int[]{2, 7, 9, 3, 1}) == 12);
        check(rob(new int[]{10}) == 10);
        check(rob(new int[]{0, 0, 0}) == 0);
        check(rob(new int[]{}) == 0);
        System.out.println("PASS");
    }
}
