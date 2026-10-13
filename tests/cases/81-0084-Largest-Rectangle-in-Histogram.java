import java.util.*;
class RegressionTest {
  static void check(boolean ok) { if (!ok) throw new AssertionError("Regression assertion failed"); }
  public static void main(String[] args) { Solution s=new Solution();check(s.largestRectangleArea(new int[]{2,1,5,6,2,3})==10);check(s.largestRectangleArea(new int[]{2,4})==4); }
}
