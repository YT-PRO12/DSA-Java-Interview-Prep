import java.util.Arrays;

public class CheckAnagram {

    public static boolean isAnagram(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {

        String s1 = "listen";
        String s2 = "silent";

        System.out.println("First string: " + s1);
        System.out.println("Second string: " + s2);
        System.out.println("Are anagrams: " + isAnagram(s1, s2));
    }
}
