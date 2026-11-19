import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** LeetCode 763. Each character appears in exactly one partition. O(n) time. */
class PartitionLabels {
    static List<Integer> partitionLabels(String s) {
        int[] last = new int[26];
        for (int i = 0; i < s.length(); i++) last[s.charAt(i) - 'a'] = i;
        List<Integer> result = new ArrayList<>();
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            end = Math.max(end, last[s.charAt(i) - 'a']);
            if (i == end) {
                result.add(end - start + 1);
                start = i + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        if (!partitionLabels("ababcbacadefegdehijhklij").equals(Arrays.asList(9, 7, 8))
                || !partitionLabels("eccbbbbdec").equals(Arrays.asList(10))
                || !partitionLabels("aaaa").equals(Arrays.asList(4))
                || !partitionLabels("").isEmpty()) {
            throw new AssertionError("Partition boundary regression");
        }
        System.out.println("PASS");
    }
}
