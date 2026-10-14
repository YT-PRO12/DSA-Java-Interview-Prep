import java.util.*;
class RegressionTest {
    static void check(boolean ok) { if (!ok) throw new AssertionError("Stack/queue contract failed"); }
    public static void main(String[] args) { MyCircularDeque q=new MyCircularDeque(3);check(q.insertLast(1));check(q.insertLast(2));check(q.insertFront(3));check(!q.insertFront(4));check(q.getRear()==2);check(q.isFull());check(q.deleteLast());check(q.insertFront(4));check(q.getFront()==4); }
}
