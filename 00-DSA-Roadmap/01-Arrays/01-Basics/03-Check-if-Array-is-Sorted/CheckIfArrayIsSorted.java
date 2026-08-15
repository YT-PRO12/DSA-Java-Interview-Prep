import java.util.Arrays;

public class CheckIfArrayIsSorted {

    public static boolean isSorted(int[] arr) {
        if (arr == null || arr.length < 2) {
            return true;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4, 7};

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Is Sorted: " + isSorted(arr));
    }
}
