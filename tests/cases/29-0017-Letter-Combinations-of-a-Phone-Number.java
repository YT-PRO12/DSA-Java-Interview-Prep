import java.util.*;
class RegressionTest {
    private static void check(boolean ok) {
        if(!ok) throw new AssertionError("Regression assertion failed");
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        check(s.letterCombinations("").isEmpty()); check(s.letterCombinations("23").size()==9); check(s.letterCombinations("7").size()==4);
    }
}
