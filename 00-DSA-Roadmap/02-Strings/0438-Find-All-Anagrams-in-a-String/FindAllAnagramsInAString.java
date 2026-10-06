import java.util.*;

public class FindAllAnagramsInAString {

    public static List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();

        if (p.length() > s.length()) {
            return result;
        }

        int[] need = new int[26];
        int[] window = new int[26];

        for (char ch : p.toCharArray()) {
            need[ch - 'a']++;
        }

        int size = p.length();

        for (int right = 0; right < s.length(); right++) {

            window[s.charAt(right) - 'a']++;

            if (right >= size) {

                window[s.charAt(right - size) - 'a']--;
            }

            if (right >= size - 1 && Arrays.equals(need, window)) {

                result.add(right - size + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        String s = "cbaebabacd";
        String p = "abc";

        System.out.println("Anagram starting indices: "
                + findAnagrams(s, p));
    }
}
