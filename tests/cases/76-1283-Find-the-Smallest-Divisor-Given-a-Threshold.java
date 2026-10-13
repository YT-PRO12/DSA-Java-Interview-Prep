import java.util.*;
class RegressionTest {
  static void check(boolean ok) { if (!ok) throw new AssertionError("Regression assertion failed"); }
  public static void main(String[] args) { Solution s=new Solution();check(s.smallestDivisor(new int[]{1,2,5,9},6)==5);check(s.smallestDivisor(new int[]{44,22,33,11,1},5)==44); }
}
