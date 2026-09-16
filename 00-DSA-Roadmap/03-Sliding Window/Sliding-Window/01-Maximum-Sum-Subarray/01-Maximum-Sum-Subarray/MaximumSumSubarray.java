public class MaximumSumSubarray {

    public static int maxSum(int[] arr, int k) {

        int left = 0;
        int windowSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int right = 0; right < arr.length; right++) {

            windowSum += arr[right];

            if (right - left + 1 == k) {
                maxSum = Math.max(maxSum, windowSum);

                windowSum -= arr[left];
                left++;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        System.out.println(maxSum(arr, k));
    }
}
