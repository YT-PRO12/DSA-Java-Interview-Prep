import java.util.*;

class RegressionTest {
    private static void check(boolean condition) {
        if (!condition) throw new AssertionError("Regression assertion failed");
    }
    public static void main(String[] args) {
        String[] rows={"53..7....","6..195...",".98....6.","8...6...3","4..8.3..1","7...2...6",".6....28.","...419..5","....8..79"};
        String[] solved={"534678912","672195348","198342567","859761423","426853791","713924856","961537284","287419635","345286179"};
        char[][] board=new char[9][];for(int i=0;i<9;i++)board[i]=rows[i].toCharArray();Solution s=new Solution();s.solveSudoku(board);for(int i=0;i<9;i++)check(new String(board[i]).equals(solved[i]));
        s.solveSudoku(board);for(int i=0;i<9;i++)check(new String(board[i]).equals(solved[i]));board[8][8]='.';s.solveSudoku(board);check(board[8][8]=='9');
    }
}
