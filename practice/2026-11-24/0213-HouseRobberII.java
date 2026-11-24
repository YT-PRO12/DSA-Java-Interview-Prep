/** The first and last house cannot both be selected.
 * Solve each of the two linear ranges. O(n) time, O(1) space.
 */
class HouseRobberII {
    static int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        return Math.max(linear(nums,0,nums.length-1), linear(nums,1,nums.length));
    }
    private static int linear(int[] nums, int start, int end) {
        int prev = 0, before = 0;
        for (int i = start; i < end; i++) {
            int next = Math.max(prev,before+nums[i]);
            before = prev;
            prev = next;
        }
        return prev;
    }
    public static void main(String[] args) {
        if (rob(new int[]{2,3,2}) != 3 || rob(new int[]{1,2,3,1}) != 4
                || rob(new int[]{10}) != 10 || rob(new int[]{2,9}) != 9
                || rob(new int[]{}) != 0)
            throw new AssertionError("Circular robbery regression");
        System.out.println("PASS");
    }
}
