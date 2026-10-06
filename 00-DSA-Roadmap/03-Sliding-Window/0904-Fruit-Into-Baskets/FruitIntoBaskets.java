import java.util.HashMap;

public class FruitIntoBaskets {

    public static int totalFruit(int[] fruits) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < fruits.length; right++) {

            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

            while (map.size() > 2) {

                int current = fruits[left];

                map.put(current, map.get(current) - 1);

                if (map.get(current) == 0) {
                    map.remove(current);
                }

                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {

        int[] fruits = {1, 2, 1, 2, 3};

        System.out.println(totalFruit(fruits));
    }
}
