import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        Arrays.fill(answer, -1);
        Deque<Integer> pending = new ArrayDeque<>();

        // Push each index once; the second pass supplies wraparound candidates.
        for (int i = 0; i < 2 * n; i++) {
            int index = i % n;
            while (!pending.isEmpty() && nums[pending.peek()] < nums[index]) {
                answer[pending.pop()] = nums[index];
            }
            if (i < n) {
                pending.push(index);
            }
        }
        return answer;
    }
}
