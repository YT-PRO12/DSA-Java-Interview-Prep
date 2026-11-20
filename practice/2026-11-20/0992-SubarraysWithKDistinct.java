import java.util.HashMap;
import java.util.Map;

/** LeetCode 992: Subarrays with K Different Integers.
 * Exactly(k) = atMost(k) - atMost(k-1); O(n) expected time, O(k) space.
 */
class SubarraysWithKDistinct {
    static int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    private static int atMost(int[] nums, int k) {
        if (k <= 0) return 0;
        Map<Integer, Integer> frequencies = new HashMap<>();
        int left = 0, count = 0;
        for (int right = 0; right < nums.length; right++) {
            frequencies.merge(nums[right], 1, Integer::sum);
            while (frequencies.size() > k) {
                int value = nums[left++];
                int remaining = frequencies.get(value) - 1;
                if (remaining == 0) frequencies.remove(value);
                else frequencies.put(value, remaining);
            }
            count += right - left + 1;
        }
        return count;
    }

    public static void main(String[] args) {
        check(subarraysWithKDistinct(new int[]{1,2,1,2,3}, 2) == 7);
        check(subarraysWithKDistinct(new int[]{1,2,1,3,4}, 3) == 3);
        check(subarraysWithKDistinct(new int[]{1,1,1}, 1) == 6);
        check(subarraysWithKDistinct(new int[]{1,2}, 0) == 0);
        check(subarraysWithKDistinct(new int[]{}, 1) == 0);
        System.out.println("PASS");
    }
    private static void check(boolean pass) {
        if (!pass) throw new AssertionError("K distinct regression");
    }
}
