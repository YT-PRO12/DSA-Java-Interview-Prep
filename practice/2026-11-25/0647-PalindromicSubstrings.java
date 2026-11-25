/** LeetCode 647: Palindromic Substrings. O(n^2) time and O(1) space. */
class PalindromicSubstrings {
    static int countSubstrings(String text) {
        int total = 0;
        for (int center = 0; center < text.length(); center++) {
            total += expand(text, center, center);
            total += expand(text, center, center + 1);
        }
        return total;
    }
    private static int expand(String text, int left, int right) {
        int count = 0;
        while (left >= 0 && right < text.length()
                && text.charAt(left) == text.charAt(right)) {
            count++;
            left--;
            right++;
        }
        return count;
    }
    private static void check(boolean ok) {
        if (!ok) throw new AssertionError("Palindromic substring regression");
    }
    public static void main(String[] args) {
        check(countSubstrings("abc") == 3);
        check(countSubstrings("aaa") == 6);
        check(countSubstrings("") == 0);
        check(countSubstrings("abba") == 6);
        check(countSubstrings("a") == 1);
        System.out.println("PASS");
    }
}
