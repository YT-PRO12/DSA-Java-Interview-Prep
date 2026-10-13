import java.util.*;
class RegressionTest {
  static void check(boolean ok) { if (!ok) throw new AssertionError("Regression assertion failed"); }
  public static void main(String[] args) { Solution s=new Solution();check(s.minEatingSpeed(new int[]{3,6,7,11},8)==4);check(s.minEatingSpeed(new int[]{30,11,23,4,20},5)==30); }
}
