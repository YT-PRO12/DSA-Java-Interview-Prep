import java.util.*;
class RegressionTest {
 static void check(boolean x){if(!x)throw new AssertionError("Regression failure");}
 static void walk(TreeNode n,List<Integer> out){if(n==null)return;walk(n.left,out);out.add(n.val);walk(n.right,out);}
 public static void main(String[] args){ListNode head=new ListNode(-10,new ListNode(-3,new ListNode(0,new ListNode(5,new ListNode(9)))));TreeNode n=new Solution().sortedListToBST(head);List<Integer> vals=new ArrayList<>();walk(n,vals);check(vals.equals(Arrays.asList(-10,-3,0,5,9)));}
}
