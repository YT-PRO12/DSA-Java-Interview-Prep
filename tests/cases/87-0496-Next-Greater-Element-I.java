import java.util.*;
class RegressionTest {
    static void check(boolean ok) { if (!ok) throw new AssertionError("Stack/queue contract failed"); }
    public static void main(String[] args) { Solution s=new Solution();check(Arrays.equals(s.nextGreaterElement(new int[]{4,1,2},new int[]{1,3,4,2}),new int[]{-1,3,-1})); }
}
