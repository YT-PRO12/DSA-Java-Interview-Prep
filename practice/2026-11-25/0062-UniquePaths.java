import java.util.Arrays;

/** LeetCode 62: Unique Paths. O(rows*columns) time and O(columns) space. */
class UniquePaths {
    static int uniquePaths(int rows, int columns) {
        if (rows <= 0 || columns <= 0) return 0;
        long[] ways = new long[columns];
        Arrays.fill(ways, 1L);
        for (int r = 1; r < rows; r++)
            for (int c = 1; c < columns; c++)
                ways[c] += ways[c - 1];
        return Math.toIntExact(ways[columns - 1]);
    }
    private static void check(boolean ok) {
        if (!ok) throw new AssertionError("Unique Paths regression");
    }
    public static void main(String[] args) {
        check(uniquePaths(3, 7) == 28);
        check(uniquePaths(3, 2) == 3);
        check(uniquePaths(1, 1) == 1);
        check(uniquePaths(1, 8) == 1);
        check(uniquePaths(0, 4) == 0);
        System.out.println("PASS");
    }
}
