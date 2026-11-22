import java.util.ArrayDeque;

/** LeetCode 907: Sum of Subarray Minimums.
 * Pop when the current value is strictly smaller, or at the sentinel end.
 * Popped position m contributes to (m-left)*(right-m) subarrays; using >=
 * consistently assigns equal minima to one position and avoids double-counts.
 * Time O(n), stack O(n).
 */
class SumSubarrayMinimums {
    private static final long MOD = 1_000_000_007L;
    static int sumSubarrayMins(int[] values) {
        ArrayDeque<Integer> increasing = new ArrayDeque<>();
        long total = 0;
        for (int right = 0; right <= values.length; right++) {
            while (!increasing.isEmpty()
                    && (right == values.length || values[increasing.peek()] >= values[right])) {
                int middle = increasing.pop();
                int left = increasing.isEmpty() ? -1 : increasing.peek();
                long count = (long) (middle - left) * (right - middle);
                total = (total + count * values[middle]) % MOD;
            }
            if (right < values.length) increasing.push(right);
        }
        return (int) total;
    }
    private static void check(boolean condition) {
        if (!condition) throw new AssertionError("Subarray minimums regression");
    }
    public static void main(String[] args) {
        check(sumSubarrayMins(new int[]{3,1,2,4}) == 17);
        check(sumSubarrayMins(new int[]{11,81,94,43,3}) == 444);
        check(sumSubarrayMins(new int[]{2,2,2}) == 12);
        check(sumSubarrayMins(new int[]{1}) == 1);
        check(sumSubarrayMins(new int[]{}) == 0);
        System.out.println("PASS");
    }
}
