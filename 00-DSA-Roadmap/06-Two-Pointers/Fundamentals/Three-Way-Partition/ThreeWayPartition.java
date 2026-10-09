import java.util.Arrays;

public class ThreeWayPartition {
    public static int[] partition(int[] values, int pivot) {
        int low = 0, current = 0, high = values.length - 1;
        while (current <= high) {
            if (values[current] < pivot) {
                swap(values, low++, current++);
            } else if (values[current] > pivot) {
                swap(values, current, high--);
            } else {
                current++;
            }
        }
        return new int[]{low, high + 1};
    }
    private static void swap(int[] values, int a, int b) {
        int temporary = values[a];
        values[a] = values[b];
        values[b] = temporary;
    }
    public static void main(String[] args) {
        int[] values = {3, 1, 5, 3, 2};
        System.out.println(Arrays.toString(partition(values, 3)));
        System.out.println(Arrays.toString(values));
    }
}
