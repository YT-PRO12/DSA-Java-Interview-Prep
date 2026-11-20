import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/** LeetCode 542: 01 Matrix.
 * Enqueue all zeros simultaneously; each cell is visited once: O(rows*cols).
 * The input matrix is never modified. LeetCode guarantees at least one zero.
 */
class ZeroOneMatrix {
    static int[][] updateMatrix(int[][] mat) {
        int rows = mat.length, cols = mat[0].length;
        int[][] distance = new int[rows][cols];
        for (int[] line : distance) Arrays.fill(line, -1);
        Queue<int[]> queue = new ArrayDeque<>();
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (mat[r][c] == 0) {
                    distance[r][c] = 0;
                    queue.add(new int[]{r, c});
                }
            }
        }
        int[] dr = {1, -1, 0, 0}, dc = {0, 0, 1, -1};
        while (!queue.isEmpty()) {
            int[] cell = queue.remove();
            for (int d = 0; d < 4; d++) {
                int r = cell[0] + dr[d], c = cell[1] + dc[d];
                if (r >= 0 && r < rows && c >= 0 && c < cols && distance[r][c] < 0) {
                    distance[r][c] = distance[cell[0]][cell[1]] + 1;
                    queue.add(new int[]{r, c});
                }
            }
        }
        return distance;
    }

    public static void main(String[] args) {
        int[][] source = {{0,0,0},{0,1,0},{1,1,1}};
        int[][] expected = {{0,0,0},{0,1,0},{1,2,1}};
        check(Arrays.deepEquals(updateMatrix(source), expected));
        check(source[2][1] == 1);
        check(Arrays.deepEquals(updateMatrix(new int[][]{{0}}), new int[][]{{0}}));
        System.out.println("PASS");
    }
    private static void check(boolean pass) {
        if (!pass) throw new AssertionError("01 Matrix regression");
    }
}
