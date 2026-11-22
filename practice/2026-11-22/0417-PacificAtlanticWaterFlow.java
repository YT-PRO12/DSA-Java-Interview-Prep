import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** LeetCode 417: Pacific Atlantic Water Flow.
 * Water flows down, so search backwards from ocean borders along nondecreasing
 * heights. Include cells reachable from both oceans. O(rows*cols) time/space.
 */
class PacificAtlanticWaterFlow {
    private static final int[] DR = {1, -1, 0, 0};
    private static final int[] DC = {0, 0, 1, -1};

    static List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> result = new ArrayList<>();
        int rows = heights.length;
        if (rows == 0 || heights[0].length == 0) return result;
        int cols = heights[0].length;
        boolean[][] pacific = new boolean[rows][cols];
        boolean[][] atlantic = new boolean[rows][cols];
        ArrayDeque<int[]> pacificStarts = new ArrayDeque<>();
        ArrayDeque<int[]> atlanticStarts = new ArrayDeque<>();
        for (int r = 0; r < rows; r++) {
            pacificStarts.add(new int[]{r, 0});
            atlanticStarts.add(new int[]{r, cols - 1});
        }
        for (int c = 0; c < cols; c++) {
            pacificStarts.add(new int[]{0, c});
            atlanticStarts.add(new int[]{rows - 1, c});
        }
        flood(heights, pacific, pacificStarts);
        flood(heights, atlantic, atlanticStarts);
        for (int r = 0; r < rows; r++)
            for (int c = 0; c < cols; c++)
                if (pacific[r][c] && atlantic[r][c])
                    result.add(Arrays.asList(r, c));
        return result;
    }
    private static void flood(int[][] heights, boolean[][] reached, ArrayDeque<int[]> q) {
        int rows = heights.length, cols = heights[0].length;
        while (!q.isEmpty()) {
            int[] cell = q.remove();
            int r = cell[0], c = cell[1];
            if (reached[r][c]) continue;
            reached[r][c] = true;
            for (int d = 0; d < 4; d++) {
                int nr = r + DR[d], nc = c + DC[d];
                if (nr >= 0 && nr < rows && nc >= 0 && nc < cols
                        && !reached[nr][nc] && heights[nr][nc] >= heights[r][c])
                    q.add(new int[]{nr, nc});
            }
        }
    }
    private static void check(boolean condition) {
        if (!condition) throw new AssertionError("Two-ocean BFS regression");
    }
    public static void main(String[] args) {
        int[][] grid = {{1,2,2,3,5},{3,2,3,4,4},{2,4,5,3,1},
                        {6,7,1,4,5},{5,1,1,2,4}};
        List<List<Integer>> expected = Arrays.asList(
            Arrays.asList(0,4), Arrays.asList(1,3), Arrays.asList(1,4),
            Arrays.asList(2,2), Arrays.asList(3,0), Arrays.asList(3,1),
            Arrays.asList(4,0));
        check(pacificAtlantic(grid).equals(expected));
        check(pacificAtlantic(new int[][]{{1}}).equals(List.of(Arrays.asList(0,0))));
        check(pacificAtlantic(new int[0][0]).isEmpty());
        check(grid[0][0] == 1);
        System.out.println("PASS");
    }
}
