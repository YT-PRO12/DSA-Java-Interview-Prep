public class RangeSumQuery {

    public static int[] buildPrefixSum(int[] nums) {
        int[] prefix = new int[nums.length];

        if (nums.length == 0) {
            return prefix;
        }

        prefix[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        return prefix;
    }

    public static int rangeSum(int[] prefix, int left, int right) {
        if (left == 0) {
            return prefix[right];
        }
        return prefix[right] - prefix[left - 1];
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int[] prefix = buildPrefixSum(nums);

        int left = 1;
        int right = 3;

        System.out.println("Range Sum: " + rangeSum(prefix, left, right));
    }
}