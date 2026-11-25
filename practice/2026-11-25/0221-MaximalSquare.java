/** LeetCode 221: Maximal Square. O(rows*columns) time and O(columns) space. */
class MaximalSquare {
    static int maximalSquare(char[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) return 0;
        int columns = matrix[0].length;
        int[] dp = new int[columns + 1];
        int best = 0;
        for (char[] row : matrix) {
            if (row.length != columns) throw new IllegalArgumentException("Matrix must be rectangular");
            int diagonal = 0;
            for (int c = 1; c <= columns; c++) {
                int above = dp[c];
                if (row[c - 1] == '1') {
                    dp[c] = 1 + Math.min(diagonal, Math.min(dp[c - 1], dp[c]));
                    best = Math.max(best, dp[c]);
                } else {
                    dp[c] = 0;
                }
                diagonal = above;
            }
        }
        return best * best;
    }
    private static void check(boolean ok) {
        if (!ok) throw new AssertionError("Maximal Square regression");
    }
    public static void main(String[] args) {
        check(maximalSquare(new char[][]{
            {'1','0','1','0','0'}, {'1','0','1','1','1'},
            {'1','1','1','1','1'}, {'1','0','0','1','0'}}) == 4);
        check(maximalSquare(new char[][]{{'0','1'},{'1','0'}}) == 1);
        check(maximalSquare(new char[][]{{'0'}}) == 0);
        check(maximalSquare(new char[0][0]) == 0);
        System.out.println("PASS");
    }
}
