import java.util.*;
class RegressionTest {
    static void check(boolean ok) { if (!ok) throw new AssertionError("Stack/queue contract failed"); }
    public static void main(String[] args) { StockSpanner s=new StockSpanner();int[] a={100,80,60,70,60,75,85};int[] e={1,1,1,2,1,4,6};for(int i=0;i<a.length;i++)check(s.next(a[i])==e[i]); }
}
