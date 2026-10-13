import java.util.*;
class RegressionTest {
  static void check(boolean ok) { if (!ok) throw new AssertionError("Regression assertion failed"); }
  public static void main(String[] args) { Solution s=new Solution();check(Arrays.equals(s.searchRange(new int[]{5,7,7,8,8,10},8),new int[]{3,4}));check(Arrays.equals(s.searchRange(new int[]{},1),new int[]{-1,-1})); }
}
