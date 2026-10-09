import java.util.Arrays;

public class ElementarySorts {
    public static void bubbleSort(int[] values) {
        for (int end = values.length - 1; end > 0; end--) {
            boolean swapped = false;
            for (int i = 0; i < end; i++) {
                if (values[i] > values[i + 1]) {
                    swap(values, i, i + 1);
                    swapped = true;
                }
            }
            if (!swapped) return;
        }
    }
    public static void selectionSort(int[] values) {
        for (int start = 0; start < values.length - 1; start++) {
            int smallest = start;
            for (int i = start + 1; i < values.length; i++) {
                if (values[i] < values[smallest]) smallest = i;
            }
            swap(values, start, smallest);
        }
    }
    public static void insertionSort(int[] values) {
        for (int i = 1; i < values.length; i++) {
            int value = values[i];
            int j = i - 1;
            while (j >= 0 && values[j] > value) {
                values[j + 1] = values[j];
                j--;
            }
            values[j + 1] = value;
        }
    }
    private static void swap(int[] values, int a, int b) {
        int temporary = values[a];
        values[a] = values[b];
        values[b] = temporary;
    }
    public static void main(String[] args) {
        int[] values = {5, -2, 3, 3, 1};
        insertionSort(values);
        System.out.println(Arrays.toString(values));
    }
}
