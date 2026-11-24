/** Maintain a nondecreasing digit stack, removing larger preceding digits.
 * O(n) time and O(n) space; no numeric parsing or overflow.
 */
class RemoveKDigits {
    static String removeKdigits(String num, int k) {
        StringBuilder stack = new StringBuilder();
        for (char digit : num.toCharArray()) {
            while (k > 0 && stack.length() > 0 && stack.charAt(stack.length()-1) > digit) {
                stack.setLength(stack.length()-1);
                k--;
            }
            stack.append(digit);
        }
        stack.setLength(stack.length()-k);
        int start = 0;
        while (start < stack.length() && stack.charAt(start) == '0') start++;
        return start == stack.length() ? "0" : stack.substring(start);
    }
    public static void main(String[] args) {
        if (!removeKdigits("1432219",3).equals("1219")
                || !removeKdigits("10200",1).equals("200")
                || !removeKdigits("10",2).equals("0")
                || !removeKdigits("12345",2).equals("123"))
            throw new AssertionError("Digit removal regression");
        System.out.println("PASS");
    }
}
