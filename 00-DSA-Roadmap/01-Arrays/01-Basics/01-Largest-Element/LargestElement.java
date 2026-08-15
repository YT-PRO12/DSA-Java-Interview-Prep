import java.util.Arrays;

public class LargestElement {

    public static int findLargest(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty.");
        }

        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 15};

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Largest Element: " + findLargest(arr));
    }
}
