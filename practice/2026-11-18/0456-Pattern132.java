// LeetCode 456: Pattern132
// Standalone implementation with executable regression checks.
// Run: javac Pattern132.java && java Pattern132

import java.util.ArrayDeque;
import java.util.Deque;

class Pattern132 {
    static boolean find132pattern(int[] nums) {
        Deque<Integer> stack = new ArrayDeque<>();
        int middle = Integer.MIN_VALUE;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < middle) return true;
            while (!stack.isEmpty() && nums[i] > stack.peek()) middle = stack.pop();
            stack.push(nums[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        if (!find132pattern(new int[]{3,1,4,2}) ||
            find132pattern(new int[]{1,2,3,4}) ||
            !find132pattern(new int[]{-1,3,2,0}))
            throw new AssertionError("132 pattern regression");
        System.out.println("PASS");
    }
}
