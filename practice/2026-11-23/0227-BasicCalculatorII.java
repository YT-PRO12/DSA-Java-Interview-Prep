/** LeetCode 227: Basic Calculator II.
 * Commit the previous term at + or -, while * and / update the pending term.
 * Time O(n), auxiliary space O(1); division truncates toward zero.
 */
class BasicCalculatorII {
    static int calculate(String expression) {
        long total = 0, term = 0, number = 0;
        char operation = '+';
        for (int i = 0; i <= expression.length(); i++) {
            char ch = i == expression.length() ? '+' : expression.charAt(i);
            if (ch >= '0' && ch <= '9') {
                number = number * 10 + ch - '0';
                continue;
            }
            if (ch == ' ') continue;
            switch (operation) {
                case '+': total += term; term = number; break;
                case '-': total += term; term = -number; break;
                case '*': term *= number; break;
                case '/': term /= number; break;
                default: throw new IllegalArgumentException("Unknown operator");
            }
            operation = ch;
            number = 0;
        }
        return (int) (total + term);
    }
    private static void check(boolean ok) {
        if (!ok) throw new AssertionError("Calculator regression");
    }
    public static void main(String[] args) {
        check(calculate("3+2*2") == 7);
        check(calculate(" 3/2 ") == 1);
        check(calculate(" 3+5 / 2 ") == 5);
        check(calculate("14-3/2") == 13);
        check(calculate("0-7/2") == -3);
        check(calculate("1-1+1") == 1);
        check(calculate("42") == 42);
        System.out.println("PASS");
    }
}
