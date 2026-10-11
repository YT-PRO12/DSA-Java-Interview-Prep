import java.util.*;
class RegressionTest {
    private static void check(boolean ok) {
        if(!ok) throw new AssertionError("Regression assertion failed");
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        check(s.combine(4,2).size()==6); check(s.combine(1,1).size()==1); check(s.combine(3,0).size()==1);
    }
}
