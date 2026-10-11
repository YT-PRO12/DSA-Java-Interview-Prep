import java.util.*;
class RegressionTest {
    private static void check(boolean ok) {
        if(!ok) throw new AssertionError("Regression assertion failed");
    }
    public static void main(String[] args) {
        
        KthLargest k=new KthLargest(3,new int[]{4,5,8,2});check(k.add(3)==4);check(k.add(5)==5);check(k.add(10)==5);check(k.add(9)==8);check(k.add(4)==8);
    }
}
