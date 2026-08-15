public class PrefixSum {

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

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int[] prefix = buildPrefixSum(nums);

        System.out.print("Prefix Sum: ");
        for (int num : prefix) {
            System.out.print(num + " ");
        }
    }
}