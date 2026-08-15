import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {
    public static int countSubarrays(int[] nums, int k) {
        Map<Integer, Integer> prefixFrequency = new HashMap<>();
        prefixFrequency.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {
            prefixSum += num;

            count += prefixFrequency.getOrDefault(prefixSum - k, 0);

            prefixFrequency.put(
                    prefixSum,
                    prefixFrequency.getOrDefault(prefixSum, 0) + 1
            );
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        int k = 2;

        System.out.println("Number of Subarrays: "
                + countSubarrays(nums, k));
    }
}
