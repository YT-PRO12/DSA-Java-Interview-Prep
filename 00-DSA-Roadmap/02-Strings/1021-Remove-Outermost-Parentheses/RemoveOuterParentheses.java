public class RemoveOuterParentheses {

    public static String removeOuterParentheses(String s) {

        StringBuilder result = new StringBuilder();

        int depth = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {

                if (depth > 0) {
                    result.append(ch);
                }

                depth++;

            } else {

                depth--;

                if (depth > 0) {
                    result.append(ch);
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String s = "(()())(())";

        System.out.println("Original: " + s);
        System.out.println("After removing outer parentheses: "
                + removeOuterParentheses(s));
    }
}
