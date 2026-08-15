public class MaximumCircularSubarray {
    public static int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        int currentMax = nums[0], maxSum = nums[0];
        int currentMin = nums[0], minSum = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (i > 0) {
                currentMax = Math.max(nums[i], currentMax + nums[i]);
                maxSum = Math.max(maxSum, currentMax);
                currentMin = Math.min(nums[i], currentMin + nums[i]);
                minSum = Math.min(minSum, currentMin);
            }
            totalSum += nums[i];
        }

        if (maxSum < 0) return maxSum;
        return Math.max(maxSum, totalSum - minSum);
    }

    public static void main(String[] args) {
        int[] nums = {5, -3, 5};
        System.out.println("Maximum Circular Subarray Sum: " + maxSubarraySumCircular(nums));
    }
}