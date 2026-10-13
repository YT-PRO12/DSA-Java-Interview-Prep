import java.util.*;
class RegressionTest {
  static void check(boolean ok) { if (!ok) throw new AssertionError("Regression assertion failed"); }
  public static void main(String[] args) { Solution s=new Solution();check(s.minDays(new int[]{1,10,3,10,2},3,1)==3);check(s.minDays(new int[]{1,10,3,10,2},3,2)==-1); }
}
