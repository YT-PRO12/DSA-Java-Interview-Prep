import java.util.*;
class RegressionTest {
  static void check(boolean ok) { if (!ok) throw new AssertionError("Regression assertion failed"); }
  public static void main(String[] args) { Solution s=new Solution();int[][] m={{1,4,7},{2,5,8},{3,6,9}};check(s.searchMatrix(m,6));check(!s.searchMatrix(m,10)); }
}
