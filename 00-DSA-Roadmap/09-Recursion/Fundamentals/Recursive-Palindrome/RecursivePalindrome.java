public class RecursivePalindrome {
    public static boolean isPalindrome(String text) {
        return isPalindrome(text, 0, text.length() - 1);
    }
    private static boolean isPalindrome(String text, int left, int right) {
        if (left >= right) return true;
        return text.charAt(left) == text.charAt(right) && isPalindrome(text, left + 1, right - 1);
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));
    }
}
