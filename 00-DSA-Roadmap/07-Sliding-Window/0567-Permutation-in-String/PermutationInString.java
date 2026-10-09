import java.util.Arrays;

public class PermutationInString {

    public static boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int[] need = new int[26];
        int[] window = new int[26];

        for (char ch : s1.toCharArray()) {
            need[ch - 'a']++;
        }

        int size = s1.length();

        for (int right = 0; right < s2.length(); right++) {

            window[s2.charAt(right) - 'a']++;

            if (right >= size) {
                window[s2.charAt(right - size) - 'a']--;
            }

            if (Arrays.equals(need, window)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String s1 = "ab";
        String s2 = "eidbaooo";

        System.out.println("Permutation exists: "
                + checkInclusion(s1, s2));
    }
}
