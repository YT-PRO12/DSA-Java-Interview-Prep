import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (char[] row : board) Arrays.fill(row, '.');
        List<List<String>> result = new ArrayList<>();
        search(0, board, new boolean[n], new boolean[2 * n - 1], new boolean[2 * n - 1], result);
        return result;
    }
    private void search(int row, char[][] board, boolean[] columns, boolean[] rising,
                        boolean[] falling, List<List<String>> result) {
        int n = board.length;
        if (row == n) {
            List<String> answer = new ArrayList<>();
            for (char[] line : board) answer.add(new String(line));
            result.add(answer);
            return;
        }
        for (int column = 0; column < n; column++) {
            int up = row + column, down = row - column + n - 1;
            if (columns[column] || rising[up] || falling[down]) continue;
            columns[column] = rising[up] = falling[down] = true;
            board[row][column] = 'Q';
            search(row + 1, board, columns, rising, falling, result);
            board[row][column] = '.';
            columns[column] = rising[up] = falling[down] = false;
        }
    }
}
