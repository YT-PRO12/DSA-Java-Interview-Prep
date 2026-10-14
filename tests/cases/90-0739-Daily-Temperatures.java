import java.util.*;
class RegressionTest {
    static void check(boolean ok) { if (!ok) throw new AssertionError("Stack/queue contract failed"); }
    public static void main(String[] args) { Solution s=new Solution();check(Arrays.equals(s.dailyTemperatures(new int[]{73,74,75,71,69,72,76,73}),new int[]{1,1,4,2,1,1,0,0})); }
}
