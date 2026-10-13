import java.util.*;
class RegressionTest {
  static void check(boolean ok) { if (!ok) throw new AssertionError("Regression assertion failed"); }
  public static void main(String[] args) { Solution s=new Solution();check(s.shipWithinDays(new int[]{1,2,3,4,5,6,7,8,9,10},5)==15);check(s.shipWithinDays(new int[]{3,2,2,4,1,4},3)==6); }
}
