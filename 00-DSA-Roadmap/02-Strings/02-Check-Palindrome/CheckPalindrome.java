public class CheckPalindrome {

    public static boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        String str = "madam";

        boolean answer = isPalindrome(str);

        System.out.println("String: " + str);
        System.out.println("Is palindrome: " + answer);
    }
}
