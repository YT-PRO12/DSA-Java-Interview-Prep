import java.util.HashMap;
import java.util.Map;

public class FrequencyCounting {
    public static Map<Integer, Integer> countFrequency(int[] arr) {
        Map<Integer, Integer> frequency = new HashMap<>();

        for (int value : arr) {
            frequency.put(value, frequency.getOrDefault(value, 0) + 1);
        }

        return frequency;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 2};

        Map<Integer, Integer> result = countFrequency(arr);

        System.out.println("Frequency Count:");
        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
