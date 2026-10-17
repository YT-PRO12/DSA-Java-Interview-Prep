import java.util.*;
class RegressionTest {
    static void check(boolean ok) { if (!ok) throw new AssertionError("Stack/queue contract failed"); }
    public static void main(String[] args) {
      MinStack m=new MinStack();
      m.push(-2);m.push(0);m.push(-3);
      check(m.getMin()==-3);
      m.pop();check(m.top()==0);check(m.getMin()==-2);
      m.push(-2);check(m.getMin()==-2);
      m.push(-2);m.pop();check(m.getMin()==-2);
      m.pop();check(m.getMin()==-2);
      m.pop();check(m.top()==-2);
    }
}
