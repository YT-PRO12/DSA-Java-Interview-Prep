import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class Solution {
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> values = new ArrayList<>();
        for (ListNode node = head; node != null; node = node.next) values.add(node.val);
        int[] result = new int[values.size()];
        Deque<Integer> waiting = new ArrayDeque<>();
        for (int i = 0; i < values.size(); i++) {
            while (!waiting.isEmpty() && values.get(waiting.peek()) < values.get(i)) {
                result[waiting.pop()] = values.get(i);
            }
            waiting.push(i);
        }
        return result;
    }
}
