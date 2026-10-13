import java.util.*;
class RegressionTest {
  static void check(boolean ok) { if (!ok) throw new AssertionError("Regression assertion failed"); }
  public static void main(String[] args) { Solution s=new Solution();check(s.maxDistance(new int[]{1,2,3,4,7},3)==3);check(s.maxDistance(new int[]{5,4,3,2,1,1000000000},2)==999999999); }
}
