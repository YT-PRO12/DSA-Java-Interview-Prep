import java.util.HashMap;
import java.util.Map;

/** LeetCode 494: Target Sum.
 * Ways to reach each sum after processing each number. Zero doubles its
 * existing paths because +0 and -0 are distinct expressions.
 * Time O(n * number of reachable sums), O(number of reachable sums) space.
 */
class TargetSum {
    static int findTargetSumWays(int[] nums, int target) {
        Map<Integer, Integer> ways = new HashMap<>();
        ways.put(0, 1);
        for (int number : nums) {
            Map<Integer, Integer> next = new HashMap<>();
            for (Map.Entry<Integer, Integer> state : ways.entrySet()) {
                next.merge(state.getKey() + number, state.getValue(), Integer::sum);
                next.merge(state.getKey() - number, state.getValue(), Integer::sum);
            }
            ways = next;
        }
        return ways.getOrDefault(target, 0);
    }
    private static void check(boolean condition) {
        if (!condition) throw new AssertionError("Target Sum regression");
    }
    public static void main(String[] args) {
        check(findTargetSumWays(new int[]{1,1,1,1,1}, 3) == 5);
        check(findTargetSumWays(new int[]{1}, 1) == 1);
        check(findTargetSumWays(new int[]{1}, 2) == 0);
        check(findTargetSumWays(new int[]{0,0,0}, 0) == 8);
        check(findTargetSumWays(new int[]{}, 0) == 1);
        check(findTargetSumWays(new int[]{}, 1) == 0);
        System.out.println("PASS");
    }
}
