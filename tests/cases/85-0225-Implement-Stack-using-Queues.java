import java.util.*;
class RegressionTest {
    static void check(boolean ok) { if (!ok) throw new AssertionError("Stack/queue contract failed"); }
    public static void main(String[] args) { MyStack s=new MyStack();s.push(1);s.push(2);check(s.top()==2);check(s.pop()==2);check(!s.empty());check(s.pop()==1);check(s.empty()); }
}
