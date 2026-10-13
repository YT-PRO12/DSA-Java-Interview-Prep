import java.util.*;
class RegressionTest {
  static void check(boolean ok) { if (!ok) throw new AssertionError("Regression assertion failed"); }
  public static void main(String[] args) { Solution s=new Solution();check(s.search(new int[]{4,5,6,7,0,1,2},0)==4);check(s.search(new int[]{1},0)==-1); }
}
