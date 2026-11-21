import java.util.ArrayDeque;

/** LeetCode 994: Rotting Oranges.
 * Every initially rotten orange participates in the same BFS frontier.
 * Time O(rows*cols), auxiliary space O(rows*cols).
 */
class RottingOranges {
    static int orangesRotting(int[][] grid) {
        int rows = grid.length;
        if (rows == 0) return 0;
        int cols = grid[0].length, fresh = 0, minutes = 0;
        ArrayDeque<int[]> queue = new ArrayDeque<>();
        for (int r = 0; r < rows; r++)
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 1) fresh++;
                else if (grid[r][c] == 2) queue.add(new int[]{r,c});
            }
        int[] dr = {1,-1,0,0}, dc = {0,0,1,-1};
        while (!queue.isEmpty() && fresh > 0) {
            for (int nodes = queue.size(); nodes > 0; nodes--) {
                int[] curr = queue.remove();
                for (int d = 0; d < 4; d++) {
                    int r = curr[0] + dr[d], c = curr[1] + dc[d];
                    if (r >= 0 && r < rows && c >= 0 && c < cols && grid[r][c] == 1) {
                        grid[r][c] = 2;
                        fresh--;
                        queue.add(new int[]{r,c});
                    }
                }
            }
            minutes++;
        }
        return fresh == 0 ? minutes : -1;
    }
    private static void check(boolean good) {
        if (!good) throw new AssertionError("Rotting oranges regression");
    }
    public static void main(String[] args) {
        check(orangesRotting(new int[][]{{2,1,1},{1,1,0},{0,1,1}}) == 4);
        check(orangesRotting(new int[][]{{2,1,1},{0,1,1},{1,0,1}}) == -1);
        check(orangesRotting(new int[][]{{0,2}}) == 0);
        check(orangesRotting(new int[][]{{1}}) == -1);
        check(orangesRotting(new int[0][0]) == 0);
        System.out.println("PASS");
    }
}
