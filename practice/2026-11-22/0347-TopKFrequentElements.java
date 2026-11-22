import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** LeetCode 347: Top K Frequent Elements.
 * Sort distinct keys by descending frequency, then ascending numeric value.
 * Time O(n + u log u), space O(u), where u is the number of unique values.
 */
class TopKFrequentElements {
    static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int value : nums) frequency.merge(value, 1, Integer::sum);
        Integer[] keys = frequency.keySet().toArray(new Integer[0]);
        Arrays.sort(keys, (a, b) -> {
            int frequencyOrder = Integer.compare(frequency.get(b), frequency.get(a));
            return frequencyOrder != 0 ? frequencyOrder : Integer.compare(a, b);
        });
        int[] result = new int[k];
        for (int i = 0; i < k; i++) result[i] = keys[i];
        return result;
    }
    private static void check(boolean condition) {
        if (!condition) throw new AssertionError("Top K Frequent regression");
    }
    public static void main(String[] args) {
        check(Arrays.equals(topKFrequent(new int[]{1,1,1,2,2,3}, 2), new int[]{1,2}));
        check(Arrays.equals(topKFrequent(new int[]{1}, 1), new int[]{1}));
        check(Arrays.equals(topKFrequent(new int[]{5,4,5,4,3}, 2), new int[]{4,5}));
        check(Arrays.equals(topKFrequent(new int[]{-1,-1,2,2,2}, 1), new int[]{2}));
        check(topKFrequent(new int[]{1,1}, 0).length == 0);
        System.out.println("PASS");
    }
}
