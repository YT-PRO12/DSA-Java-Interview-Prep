import java.util.*;

class RegressionTest {
    private static void check(boolean condition) {
        if (!condition) throw new AssertionError("Regression assertion failed");
    }
    public static void main(String[] args) {
        int[] a={Integer.MIN_VALUE,4,4,0,Integer.MAX_VALUE};int[] sorted=a.clone();java.util.Arrays.sort(sorted);check(java.util.Arrays.equals(PriorityQueueBasics.drain(a,false),sorted));int[] desc=PriorityQueueBasics.drain(a,true);for(int i=0;i<a.length;i++)check(desc[i]==sorted[a.length-1-i]);check(PriorityQueueBasics.drain(new int[0],true).length==0);
    }
}
