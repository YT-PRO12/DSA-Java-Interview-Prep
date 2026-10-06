import java.util.Stack;

class MinStack {
    private final Stack<Integer> stack = new Stack<>();
    private final Stack<Integer> minimums = new Stack<>();

    public void push(int val) {
        stack.push(val);
        if (minimums.isEmpty() || val <= minimums.peek()) {
            minimums.push(val);
        }
    }

    public void pop() {
        int removed = stack.pop();
        if (removed == minimums.peek()) {
            minimums.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minimums.peek();
    }
}
