import java.util.*;
class RegressionTest {
  static void check(boolean ok) { if (!ok) throw new AssertionError("Regression assertion failed"); }
  public static void main(String[] args) { Solution s=new Solution();check(s.evalRPN(new String[]{"2","1","+","3","*"})==9);check(s.evalRPN(new String[]{"4","13","5","/","+"})==6); }
}
