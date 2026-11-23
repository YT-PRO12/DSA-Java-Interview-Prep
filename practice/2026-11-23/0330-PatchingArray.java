/** LeetCode 330: Patching Array.
 * If every sum from 1 through missing-1 is representable, a number no
 * greater than missing extends that interval. Otherwise patch missing itself.
 * Time O(nums.length + answer), auxiliary space O(1).
 */
class PatchingArray {
    static int minPatches(int[] nums, int n) {
        long missing = 1;
        int index = 0, patches = 0;
        while (missing <= n) {
            if (index < nums.length && nums[index] <= missing) {
                missing += nums[index++];
            } else {
                missing += missing;
                patches++;
            }
        }
        return patches;
    }
    private static void check(boolean ok) {
        if (!ok) throw new AssertionError("Patching Array regression");
    }
    public static void main(String[] args) {
        check(minPatches(new int[]{1,3}, 6) == 1);
        check(minPatches(new int[]{1,5,10}, 20) == 2);
        check(minPatches(new int[]{1,2,2}, 5) == 0);
        check(minPatches(new int[]{}, 7) == 3);
        check(minPatches(new int[]{2}, 7) == 2);
        check(minPatches(new int[]{1}, Integer.MAX_VALUE) == 30);
        check(minPatches(new int[]{}, 0) == 0);
        System.out.println("PASS");
    }
}
