import java.util.ArrayDeque;

/** LeetCode 329: Longest Increasing Path in a Matrix.
 * Treat moves to strictly larger neighbors as outgoing edges. Start at
 * local maxima and peel layers toward smaller values to avoid deep DFS.
 * Time and auxiliary space O(rows*cols).
 */
class LongestIncreasingPathMatrix {
    static int longestIncreasingPath(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) return 0;
        int rows = matrix.length, cols = matrix[0].length;
        int[][] outdegree = new int[rows][cols];
        int[] dr = {1, -1, 0, 0}, dc = {0, 0, 1, -1};
        ArrayDeque<int[]> queue = new ArrayDeque<>();
        for (int r = 0; r < rows; r++)
            for (int c = 0; c < cols; c++) {
                for (int d = 0; d < 4; d++) {
                    int nr = r + dr[d], nc = c + dc[d];
                    if (nr >= 0 && nr < rows && nc >= 0 && nc < cols
                            && matrix[nr][nc] > matrix[r][c])
                        outdegree[r][c]++;
                }
                if (outdegree[r][c] == 0) queue.add(new int[]{r,c});
            }
        int longest = 0;
        while (!queue.isEmpty()) {
            longest++;
            for (int nodes = queue.size(); nodes > 0; nodes--) {
                int[] current = queue.remove();
                for (int d = 0; d < 4; d++) {
                    int nr = current[0] + dr[d], nc = current[1] + dc[d];
                    if (nr >= 0 && nr < rows && nc >= 0 && nc < cols
                            && matrix[nr][nc] < matrix[current[0]][current[1]]
                            && --outdegree[nr][nc] == 0)
                        queue.add(new int[]{nr,nc});
                }
            }
        }
        return longest;
    }
    private static void check(boolean good) {
        if (!good) throw new AssertionError("Increasing path regression");
    }
    public static void main(String[] args) {
        check(longestIncreasingPath(new int[][]{
            {9,9,4},{6,6,8},{2,1,1}
        }) == 4);
        check(longestIncreasingPath(new int[][]{
            {3,4,5},{3,2,6},{2,2,1}
        }) == 4);
        check(longestIncreasingPath(new int[][]{{7,7},{7,7}}) == 1);
        check(longestIncreasingPath(new int[0][0]) == 0);
        System.out.println("PASS");
    }
}
