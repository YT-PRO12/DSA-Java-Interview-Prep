import java.util.ArrayDeque;

/** LeetCode 862: Shortest Subarray with Sum at Least K.
 * Increasing prefix sums in a deque allow removal of dominated starts.
 * Time O(n), auxiliary space O(n). Long sums avoid int overflow.
 */
class ShortestSubarrayAtLeastK {
    static int shortestSubarray(int[] nums, int k) {
        long[] prefix = new long[nums.length + 1];
        for (int i = 0; i < nums.length; i++) prefix[i + 1] = prefix[i] + nums[i];
        ArrayDeque<Integer> indices = new ArrayDeque<>();
        int best = nums.length + 1;
        for (int right = 0; right < prefix.length; right++) {
            while (!indices.isEmpty() && prefix[right] - prefix[indices.peekFirst()] >= k) {
                best = Math.min(best, right - indices.removeFirst());
            }
            while (!indices.isEmpty() && prefix[right] <= prefix[indices.peekLast()]) {
                indices.removeLast();
            }
            indices.addLast(right);
        }
        return best <= nums.length ? best : -1;
    }
    private static void check(boolean ok) {
        if (!ok) throw new AssertionError("Shortest subarray regression");
    }
    public static void main(String[] args) {
        check(shortestSubarray(new int[]{1}, 1) == 1);
        check(shortestSubarray(new int[]{1,2}, 4) == -1);
        check(shortestSubarray(new int[]{2,-1,2}, 3) == 3);
        check(shortestSubarray(new int[]{84,-37,32,40,95}, 167) == 3);
        check(shortestSubarray(new int[]{-1,-1,6}, 5) == 1);
        check(shortestSubarray(new int[]{}, 1) == -1);
        System.out.println("PASS");
    }
}
