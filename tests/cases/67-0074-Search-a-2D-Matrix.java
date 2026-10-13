import java.util.*;
class RegressionTest {
  static void check(boolean ok) { if (!ok) throw new AssertionError("Regression assertion failed"); }
  public static void main(String[] args) { Solution s=new Solution();int[][] m={{1,3,5},{7,9,11}};check(s.searchMatrix(m,9));check(!s.searchMatrix(m,8)); }
}
