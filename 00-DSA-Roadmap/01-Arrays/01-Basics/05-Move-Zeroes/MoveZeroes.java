import java.util.Arrays;

public class MoveZeroes {

    public static void moveZeroes(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array must not be null.");
        }

        int nonZeroIndex = 0;

        // Move all non-zero elements to the front.
        for (int value : arr) {
            if (value != 0) {
                arr[nonZeroIndex++] = value;
            }
        }

        // Fill the remaining positions with zeroes.
        while (nonZeroIndex < arr.length) {
            arr[nonZeroIndex++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};

        System.out.println("Original Array: " + Arrays.toString(arr));

        moveZeroes(arr);

        System.out.println("After Moving Zeroes: " + Arrays.toString(arr));
    }
}
