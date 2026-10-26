import java.util.Arrays;

class Solution {
    public int maxFrequency(int[] nums, int k) {
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        long sum = 0;
        int left = 0, best = 0;
        for (int right = 0; right < sorted.length; right++) {
            sum += sorted[right];
            while ((long) sorted[right] * (right - left + 1) - sum > k) {
                sum -= sorted[left++];
            }
            best = Math.max(best, right - left + 1);
        }
        return best;
    }
}
