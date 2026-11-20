/** LeetCode 42: Trapping Rain Water.
 * Move the side with the smaller known boundary; O(n) time, O(1) space.
 */
class TrappingRainWater {
    static int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0, water = 0;
        while (left < right) {
            if (height[left] <= height[right]) {
                leftMax = Math.max(leftMax, height[left]);
                water += leftMax - height[left++];
            } else {
                rightMax = Math.max(rightMax, height[right]);
                water += rightMax - height[right--];
            }
        }
        return water;
    }

    public static void main(String[] args) {
        check(trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}) == 6);
        check(trap(new int[]{4,2,0,3,2,5}) == 9);
        check(trap(new int[]{5,4,3,2,1}) == 0);
        check(trap(new int[]{}) == 0);
        System.out.println("PASS");
    }
    private static void check(boolean condition) {
        if (!condition) throw new AssertionError("Trapping Rain Water regression");
    }
}
