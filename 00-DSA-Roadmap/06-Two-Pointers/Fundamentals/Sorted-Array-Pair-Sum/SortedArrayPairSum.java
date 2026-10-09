import java.util.Arrays;

public class SortedArrayPairSum {
    public static int[] findPair(int[] sorted, long target) {
        int left = 0, right = sorted.length - 1;
        while (left < right) {
            long sum = (long) sorted[left] + sorted[right];
            if (sum == target) return new int[]{left, right};
            if (sum < target) left++;
            else right--;
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findPair(new int[]{1, 2, 4, 7}, 9)));
    }
}
