/** LeetCode 154: Find Minimum in Rotated Sorted Array II.
 * Duplicates prevent a reliable choice of sorted half, so shrink right
 * on equality. O(log n) typical, O(n) worst-case, O(1) space.
 */
class MinimumRotatedSortedArrayII {
    static int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] > nums[right]) {
                left = middle + 1;
            } else if (nums[middle] < nums[right]) {
                right = middle;
            } else {
                right--;
            }
        }
        return nums[left];
    }
    private static void check(boolean ok) {
        if (!ok) throw new AssertionError("Rotated minimum regression");
    }
    public static void main(String[] args) {
        check(findMin(new int[]{1,3,5}) == 1);
        check(findMin(new int[]{2,2,2,0,1}) == 0);
        check(findMin(new int[]{3,3,1,3}) == 1);
        check(findMin(new int[]{1,1,1}) == 1);
        check(findMin(new int[]{5}) == 5);
        check(findMin(new int[]{1,2,1,1,1}) == 1);
        System.out.println("PASS");
    }
}
