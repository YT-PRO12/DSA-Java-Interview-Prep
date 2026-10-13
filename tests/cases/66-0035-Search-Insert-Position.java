import java.util.*;
class RegressionTest {
  static void check(boolean ok) { if (!ok) throw new AssertionError("Regression assertion failed"); }
  public static void main(String[] args) { Solution s=new Solution();check(s.searchInsert(new int[]{1,3,5,6},5)==2);check(s.searchInsert(new int[]{1,3,5,6},2)==1); }
}
