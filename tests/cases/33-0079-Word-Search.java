import java.util.*;
class RegressionTest {
    private static void check(boolean ok) {
        if(!ok) throw new AssertionError("Regression assertion failed");
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        char[][] b={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};check(s.exist(b,"ABCCED"));check(s.exist(b,"SEE"));check(!s.exist(b,"ABCB"));
    }
}
