import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public String decodeString(String s) {
        Deque<Integer> counts = new ArrayDeque<>();
        Deque<StringBuilder> strings = new ArrayDeque<>();

        StringBuilder current = new StringBuilder();
        int number = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                number = number * 10 + (ch - '0');
            } else if (ch == '[') {
                counts.push(number);
                strings.push(current);
                number = 0;
                current = new StringBuilder();
            } else if (ch == ']') {
                int repeat = counts.pop();
                StringBuilder previous = strings.pop();

                while (repeat-- > 0) {
                    previous.append(current);
                }

                current = previous;
            } else {
                current.append(ch);
            }
        }

        return current.toString();
    }
}
