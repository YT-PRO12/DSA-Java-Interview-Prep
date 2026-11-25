/** LeetCode 918: Maximum Sum Circular Subarray. O(n) time and O(1) space. */
class MaximumSumCircularSubarray {
    static int maxSubarraySumCircular(int[] nums) {
        if (nums.length == 0) return 0;
        int total = 0, maxEnding = 0, maxSum = Integer.MIN_VALUE;
        int minEnding = 0, minSum = Integer.MAX_VALUE;
        for (int value : nums) {
            maxEnding = Math.max(value, maxEnding + value);
            maxSum = Math.max(maxSum, maxEnding);
            minEnding = Math.min(value, minEnding + value);
            minSum = Math.min(minSum, minEnding);
            total += value;
        }
        return maxSum < 0 ? maxSum : Math.max(maxSum, total - minSum);
    }
    private static void check(boolean ok) {
        if (!ok) throw new AssertionError("Circular subarray regression");
    }
    public static void main(String[] args) {
        check(maxSubarraySumCircular(new int[]{1,-2,3,-2}) == 3);
        check(maxSubarraySumCircular(new int[]{5,-3,5}) == 10);
        check(maxSubarraySumCircular(new int[]{-3,-2,-3}) == -2);
        check(maxSubarraySumCircular(new int[]{3,-1,2,-1}) == 4);
        check(maxSubarraySumCircular(new int[]{}) == 0);
        System.out.println("PASS");
    }
}
