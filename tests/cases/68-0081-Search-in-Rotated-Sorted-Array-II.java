import java.util.*;
class RegressionTest {
  static void check(boolean ok) { if (!ok) throw new AssertionError("Regression assertion failed"); }
  public static void main(String[] args) { Solution s=new Solution();check(s.search(new int[]{2,5,6,0,0,1,2},0));check(!s.search(new int[]{2,5,6,0,0,1,2},3)); }
}
