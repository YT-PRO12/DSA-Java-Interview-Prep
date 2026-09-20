public class LongestPalindrome {

    public static int longestPalindrome(String s) {

        int[] frequency = new int[128];

        for (char ch : s.toCharArray()) {
            frequency[ch]++;
        }

        int length = 0;
        boolean hasOdd = false;

        for (int count : frequency) {

            length += (count / 2) * 2;

            if (count % 2 == 1) {
                hasOdd = true;
            }
        }

        if (hasOdd) {
            length++;
        }

        return length;
    }

    public static void main(String[] args) {

        String s = "abccccdd";

        System.out.println("Longest palindrome length: "
                + longestPalindrome(s));
    }
}
