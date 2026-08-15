import java.util.Arrays;

public class LeftRotateArray {

    public static void rotateLeftByOne(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int first = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = first;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Original Array: " + Arrays.toString(arr));

        rotateLeftByOne(arr);

        System.out.println("After Left Rotation: " + Arrays.toString(arr));
    }
}
