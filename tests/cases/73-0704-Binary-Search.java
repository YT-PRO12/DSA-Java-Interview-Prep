import java.util.*;
class RegressionTest {
  static void check(boolean ok) { if (!ok) throw new AssertionError("Regression assertion failed"); }
  public static void main(String[] args) { Solution s=new Solution();check(s.search(new int[]{-1,0,3,5,9,12},9)==4);check(s.search(new int[]{-1,0,3},2)==-1); }
}
