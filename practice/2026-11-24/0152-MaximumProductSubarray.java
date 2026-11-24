/** Track both maximum and minimum products ending at the current position.
 * Negative values exchange their roles. O(n) time, O(1) space.
 */
class MaximumProductSubarray {
    static int maxProduct(int[] nums) {
        int high = nums[0], low = nums[0], best = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int x = nums[i];
            int nextHigh = Math.max(x,Math.max(high*x,low*x));
            int nextLow = Math.min(x,Math.min(high*x,low*x));
            high = nextHigh;
            low = nextLow;
            best = Math.max(best,high);
        }
        return best;
    }
    public static void main(String[] args) {
        if (maxProduct(new int[]{2,3,-2,4}) != 6
                || maxProduct(new int[]{-2,0,-1}) != 0
                || maxProduct(new int[]{-2,3,-4}) != 24
                || maxProduct(new int[]{-7}) != -7)
            throw new AssertionError("Maximum product regression");
        System.out.println("PASS");
    }
}
