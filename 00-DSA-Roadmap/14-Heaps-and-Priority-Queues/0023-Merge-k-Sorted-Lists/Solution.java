import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> heap = new PriorityQueue<>(Comparator.comparingInt(node -> node.val));
        for (ListNode head : lists) if (head != null) heap.offer(head);
        ListNode dummy = new ListNode(0), tail = dummy;
        while (!heap.isEmpty()) {
            ListNode smallest = heap.remove();
            if (smallest.next != null) heap.offer(smallest.next);
            tail.next = smallest;
            tail = smallest;
        }
        return dummy.next;
    }
}
