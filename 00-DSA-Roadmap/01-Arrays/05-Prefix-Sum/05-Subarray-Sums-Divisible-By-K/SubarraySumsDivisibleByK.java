import java.util.HashMap;
import java.util.Map;

public class SubarraySumsDivisibleByK {

    public static int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> remainderCount = new HashMap<>();
        remainderCount.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {
            prefixSum += num;

            int remainder = prefixSum % k;

            if (remainder < 0) {
                remainder += k;
            }

            if (remainderCount.containsKey(remainder)) {
                count += remainderCount.get(remainder);
            }

            remainderCount.put(
                remainder,
                remainderCount.getOrDefault(remainder, 0) + 1
            );
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 0, -2, -3, 1};
        int k = 5;

        System.out.println(
            "Number of Subarrays: " + subarraysDivByK(nums, k)
        );
    }
}