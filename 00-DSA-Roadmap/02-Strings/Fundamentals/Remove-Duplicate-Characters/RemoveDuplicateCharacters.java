import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharacters {

    public static String removeDuplicates(String str) {

        Set<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {

            if (!seen.contains(ch)) {
                seen.add(ch);
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String str = "programming";

        System.out.println("Original string: " + str);
        System.out.println("After removing duplicates: " + removeDuplicates(str));
    }
}
