import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int longestSubarray(int[] nums, int limit) {
        Deque<Integer> minimum = new ArrayDeque<>();
        Deque<Integer> maximum = new ArrayDeque<>();
        int left = 0, best = 0;
        for (int right = 0; right < nums.length; right++) {
            while (!minimum.isEmpty() && nums[minimum.peekLast()] > nums[right]) minimum.removeLast();
            while (!maximum.isEmpty() && nums[maximum.peekLast()] < nums[right]) maximum.removeLast();
            minimum.addLast(right);
            maximum.addLast(right);
            while ((long) nums[maximum.peekFirst()] - nums[minimum.peekFirst()] > limit) {
                if (minimum.peekFirst() == left) minimum.removeFirst();
                if (maximum.peekFirst() == left) maximum.removeFirst();
                left++;
            }
            best = Math.max(best, right - left + 1);
        }
        return best;
    }
}
