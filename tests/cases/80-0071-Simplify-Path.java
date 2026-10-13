import java.util.*;
class RegressionTest {
  static void check(boolean ok) { if (!ok) throw new AssertionError("Regression assertion failed"); }
  public static void main(String[] args) { Solution s=new Solution();check(s.simplifyPath("/home//foo/").equals("/home/foo"));check(s.simplifyPath("/a/./b/../../c/").equals("/c")); }
}
