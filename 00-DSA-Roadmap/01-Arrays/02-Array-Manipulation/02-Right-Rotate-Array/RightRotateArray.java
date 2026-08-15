import java.util.Arrays;

public class RightRotateArray {

    public static void rotateRightByOne(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int last = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = last;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Original Array: " + Arrays.toString(arr));

        rotateRightByOne(arr);

        System.out.println("After Right Rotation: " + Arrays.toString(arr));
    }
}
