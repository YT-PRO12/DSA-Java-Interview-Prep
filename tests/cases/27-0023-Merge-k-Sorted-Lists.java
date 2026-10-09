import java.util.*;

class RegressionTest {
    private static void check(boolean condition) {
        if (!condition) throw new AssertionError("Regression assertion failed");
    }
    public static void main(String[] args) {
        Solution s=new Solution();check(s.mergeKLists(new ListNode[0])==null);check(s.mergeKLists(new ListNode[]{null,null})==null);
        ListNode[] lists={new ListNode(1,new ListNode(4,new ListNode(5))),new ListNode(1,new ListNode(3,new ListNode(4))),new ListNode(2,new ListNode(6))};
        ListNode out=s.mergeKLists(lists);for(int value:new int[]{1,1,2,3,4,4,5,6}){check(out!=null && out.val==value);out=out.next;}check(out==null);
    }
}
