import java.util.*;
class RegressionTest {
  static void check(boolean ok) { if (!ok) throw new AssertionError("Regression assertion failed"); }
  public static void main(String[] args) { Solution s=new Solution();check(s.findMin(new int[]{3,4,5,1,2})==1);check(s.findMin(new int[]{11,13,15,17})==11); }
}
