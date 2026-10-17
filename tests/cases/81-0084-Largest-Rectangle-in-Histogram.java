import java.util.*;
class RegressionTest {
  static void check(boolean ok) { if (!ok) throw new AssertionError("Regression assertion failed"); }
  public static void main(String[] args) {
    Solution s=new Solution();
    check(s.largestRectangleArea(new int[]{2,1,5,6,2,3})==10);
    check(s.largestRectangleArea(new int[]{2,4})==4);
    check(s.largestRectangleArea(new int[]{0,0,0})==0);
    check(s.largestRectangleArea(new int[]{2,2,2,2})==8);
    check(s.largestRectangleArea(new int[]{5})==5);
    check(s.largestRectangleArea(new int[]{1,2,3,4,5})==9);
    check(s.largestRectangleArea(new int[]{5,4,3,2,1})==9);
  }
}
