import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static char firstNonRepeating(String str) {

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : str.toCharArray()) {

            if (map.get(ch) == 1) {
                return ch;
            }
        }

        return '\0';
    }

    public static void main(String[] args) {

        String str = "leetcode";

        char answer = firstNonRepeating(str);

        if (answer != '\0') {
            System.out.println("First non-repeating character: " + answer);
        } else {
            System.out.println("No non-repeating character found");
        }
    }
}
