import java.util.*;
class RegressionTest {
    static void check(boolean ok) { if (!ok) throw new AssertionError("Stack/queue contract failed"); }
    public static void main(String[] args) { MyCircularQueue q=new MyCircularQueue(3);check(q.enQueue(1));check(q.enQueue(2));check(q.enQueue(3));check(!q.enQueue(4));check(q.Rear()==3);check(q.isFull());check(q.deQueue());check(q.enQueue(4));check(q.Rear()==4); }
}
