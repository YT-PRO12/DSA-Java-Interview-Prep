class Solution {
    public void solveSudoku(char[][] board) {
        solve(board, 0);
    }
    private boolean solve(char[][] board, int cell) {
        while (cell < 81 && board[cell / 9][cell % 9] != '.') cell++;
        if (cell == 81) return true;
        int row = cell / 9, column = cell % 9;
        for (char digit = '1'; digit <= '9'; digit++) {
            if (!allowed(board, row, column, digit)) continue;
            board[row][column] = digit;
            if (solve(board, cell + 1)) return true;
            board[row][column] = '.';
        }
        return false;
    }
    private boolean allowed(char[][] board, int row, int column, char digit) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == digit || board[i][column] == digit) return false;
            if (board[(row / 3) * 3 + i / 3][(column / 3) * 3 + i % 3] == digit) return false;
        }
        return true;
    }
}
