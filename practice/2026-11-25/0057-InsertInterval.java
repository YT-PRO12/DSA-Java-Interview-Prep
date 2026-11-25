import java.util.ArrayList;
import java.util.List;

/** LeetCode 57: Insert Interval. O(n) time and O(n) output space. */
class InsertInterval {
    static int[][] insert(int[][] intervals, int[] newInterval) {
        if (newInterval == null || newInterval.length != 2 || newInterval[0] > newInterval[1])
            throw new IllegalArgumentException("Invalid new interval");
        List<int[]> result = new ArrayList<>();
        int index = 0, start = newInterval[0], end = newInterval[1];
        while (index < intervals.length && intervals[index][1] < start)
            result.add(intervals[index++].clone());
        while (index < intervals.length && intervals[index][0] <= end) {
            start = Math.min(start, intervals[index][0]);
            end = Math.max(end, intervals[index][1]);
            index++;
        }
        result.add(new int[]{start, end});
        while (index < intervals.length) result.add(intervals[index++].clone());
        return result.toArray(new int[0][]);
    }
    private static void check(boolean ok) {
        if (!ok) throw new AssertionError("Insert Interval regression");
    }
    public static void main(String[] args) {
        check(java.util.Arrays.deepEquals(
            insert(new int[][]{{1,3},{6,9}}, new int[]{2,5}),
            new int[][]{{1,5},{6,9}}));
        check(java.util.Arrays.deepEquals(
            insert(new int[][]{{1,2},{3,5},{6,7},{8,10},{12,16}}, new int[]{4,8}),
            new int[][]{{1,2},{3,10},{12,16}}));
        check(java.util.Arrays.deepEquals(
            insert(new int[0][2], new int[]{5,7}), new int[][]{{5,7}}));
        int[][] original = {{1,2},{5,7}};
        insert(original, new int[]{3,4});
        check(java.util.Arrays.deepEquals(original, new int[][]{{1,2},{5,7}}));
        System.out.println("PASS");
    }
}
