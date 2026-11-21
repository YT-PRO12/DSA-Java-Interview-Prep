/** LeetCode 91: Decode Ways.
 * A digit decodes alone only if nonzero; a pair decodes if 10..26.
 * Time O(n), auxiliary space O(1).
 */
class DecodeWays {
    static int numDecodings(String digits) {
        if (digits.isEmpty()) return 0;
        int beforePrevious = 1;
        int previous = digits.charAt(0) == '0' ? 0 : 1;
        for (int i = 1; i < digits.length(); i++) {
            int current = 0;
            if (digits.charAt(i) != '0') current += previous;
            int pair = (digits.charAt(i - 1) - '0') * 10
                     + (digits.charAt(i) - '0');
            if (pair >= 10 && pair <= 26) current += beforePrevious;
            beforePrevious = previous;
            previous = current;
        }
        return previous;
    }
    private static void check(boolean good) {
        if (!good) throw new AssertionError("Decode Ways regression");
    }
    public static void main(String[] args) {
        check(numDecodings("12") == 2);
        check(numDecodings("226") == 3);
        check(numDecodings("06") == 0);
        check(numDecodings("11106") == 2);
        check(numDecodings("10") == 1);
        check(numDecodings("0") == 0);
        check(numDecodings("") == 0);
        System.out.println("PASS");
    }
}
