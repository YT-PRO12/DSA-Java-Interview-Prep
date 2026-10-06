import java.util.LinkedHashMap;
import java.util.Map;

public class CountCharacterFrequency {

    public static void countFrequency(String str) {

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            System.out.println(
                entry.getKey() + " -> " + entry.getValue()
            );
        }
    }

    public static void main(String[] args) {

        String str = "banana";

        System.out.println("String: " + str);
        System.out.println("Character frequencies:");

        countFrequency(str);
    }
}
