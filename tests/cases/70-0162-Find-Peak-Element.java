import java.util.*;
class RegressionTest {
  static void check(boolean ok) { if (!ok) throw new AssertionError("Regression assertion failed"); }
  public static void main(String[] args) { Solution s=new Solution();check(s.findPeakElement(new int[]{1,2,3,1})==2);check(s.findPeakElement(new int[]{1})==0); }
}
