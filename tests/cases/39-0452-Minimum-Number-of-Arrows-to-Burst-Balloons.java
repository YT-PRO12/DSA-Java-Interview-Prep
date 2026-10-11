import java.util.*;
class RegressionTest {
    private static void check(boolean ok) {
        if(!ok) throw new AssertionError("Regression assertion failed");
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        check(s.findMinArrowShots(new int[][]{{10,16},{2,8},{1,6},{7,12}})==2);check(s.findMinArrowShots(new int[][]{{1,2},{3,4},{5,6},{7,8}})==4);
    }
}
