import java.util.*;
class RegressionTest {
    static void check(boolean ok) { if (!ok) throw new AssertionError("Stack/queue contract failed"); }
    public static void main(String[] args) { MyQueue q=new MyQueue();q.push(1);q.push(2);check(q.peek()==1);check(q.pop()==1);check(!q.empty());check(q.pop()==2);check(q.empty()); }
}
