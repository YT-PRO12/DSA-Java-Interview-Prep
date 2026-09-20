import java.util.*;

public class SortCharactersByFrequency {

    public static String frequencySort(String s) {

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        List<Character> characters = new ArrayList<>(map.keySet());

        characters.sort((a, b) -> map.get(b) - map.get(a));

        StringBuilder result = new StringBuilder();

        for (char ch : characters) {

            for (int i = 0; i < map.get(ch); i++) {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String s = "tree";

        System.out.println("Sorted by frequency: " + frequencySort(s));
    }
}
