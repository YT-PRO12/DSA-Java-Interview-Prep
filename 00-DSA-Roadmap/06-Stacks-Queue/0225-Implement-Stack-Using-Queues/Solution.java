import java.util.ArrayDeque;
import java.util.Queue;

class MyStack {
    private final Queue<Integer> queue = new ArrayDeque<>();

    public void push(int x) {
        queue.offer(x);
        int rotations = queue.size() - 1;

        while (rotations-- > 0) {
            queue.offer(queue.poll());
        }
    }

    public int pop() {
        return queue.remove();
    }

    public int top() {
        return queue.element();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
