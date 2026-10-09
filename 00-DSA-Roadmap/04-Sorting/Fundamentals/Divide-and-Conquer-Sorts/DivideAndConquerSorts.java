import java.util.Arrays;

public class DivideAndConquerSorts {
    public static void mergeSort(int[] values) {
        mergeSort(values, new int[values.length], 0, values.length);
    }
    private static void mergeSort(int[] values, int[] buffer, int low, int high) {
        if (high - low < 2) return;
        int middle = low + (high - low) / 2;
        mergeSort(values, buffer, low, middle);
        mergeSort(values, buffer, middle, high);
        int left = low, right = middle;
        for (int write = low; write < high; write++) {
            if (right == high || (left < middle && values[left] <= values[right])) {
                buffer[write] = values[left++];
            } else {
                buffer[write] = values[right++];
            }
        }
        System.arraycopy(buffer, low, values, low, high - low);
    }
    public static void quickSort(int[] values) {
        quickSort(values, 0, values.length - 1);
    }
    private static void quickSort(int[] values, int low, int high) {
        while (low < high) {
            int pivot = values[low + (high - low) / 2];
            int left = low, right = high;
            while (left <= right) {
                while (values[left] < pivot) left++;
                while (values[right] > pivot) right--;
                if (left <= right) {
                    int temporary = values[left];
                    values[left++] = values[right];
                    values[right--] = temporary;
                }
            }
            // Recurse only into the smaller partition to bound stack depth.
            if (right - low < high - left) {
                quickSort(values, low, right);
                low = left;
            } else {
                quickSort(values, left, high);
                high = right;
            }
        }
    }
    public static void main(String[] args) {
        int[] values = {9, 1, 5, -2, 5};
        quickSort(values);
        System.out.println(Arrays.toString(values));
    }
}
