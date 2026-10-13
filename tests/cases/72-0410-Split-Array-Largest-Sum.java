import java.util.*;
class RegressionTest {
  static void check(boolean ok) { if (!ok) throw new AssertionError("Regression assertion failed"); }
  public static void main(String[] args) { Solution s=new Solution();check(s.splitArray(new int[]{7,2,5,10,8},2)==18);check(s.splitArray(new int[]{1,2,3,4,5},2)==9); }
}
