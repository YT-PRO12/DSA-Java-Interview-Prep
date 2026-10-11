import java.util.*;
class RegressionTest {
    private static void check(boolean ok) {
        if(!ok) throw new AssertionError("Regression assertion failed");
    }
    public static void main(String[] args) {
        
        MedianFinder m=new MedianFinder();m.addNum(1);m.addNum(2);check(m.findMedian()==1.5);m.addNum(3);check(m.findMedian()==2.0);
    }
}
