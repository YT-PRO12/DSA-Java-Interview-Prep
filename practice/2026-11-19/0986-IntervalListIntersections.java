import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** LeetCode 986. Intersect sorted, disjoint lists of closed intervals. O(n+m). */
class IntervalListIntersections {
    static int[][] intervalIntersection(int[][] first, int[][] second) {
        List<int[]> result = new ArrayList<>();
        int i = 0, j = 0;
        while (i < first.length && j < second.length) {
            int left = Math.max(first[i][0], second[j][0]);
            int right = Math.min(first[i][1], second[j][1]);
            if (left <= right) result.add(new int[]{left, right});
            int endA = first[i][1], endB = second[j][1];
            if (endA <= endB) i++;
            if (endB <= endA) j++;
        }
        return result.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        int[][] first = {{0,2},{5,10},{13,23},{24,25}};
        int[][] second = {{1,5},{8,12},{15,24},{25,26}};
        int[][] expected = {{1,2},{5,5},{8,10},{15,23},{24,24},{25,25}};
        if (!Arrays.deepEquals(intervalIntersection(first, second), expected)
                || intervalIntersection(first, new int[0][]).length != 0)
            throw new AssertionError("Closed interval regression");
        System.out.println("PASS");
    }
}
