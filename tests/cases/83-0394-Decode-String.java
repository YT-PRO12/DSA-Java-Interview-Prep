import java.util.*;
class RegressionTest {
  static void check(boolean ok) { if (!ok) throw new AssertionError("Regression assertion failed"); }
  public static void main(String[] args) { Solution s=new Solution();check(s.decodeString("3[a]2[bc]").equals("aaabcbc"));check(s.decodeString("3[a2[c]]").equals("accaccacc")); }
}
