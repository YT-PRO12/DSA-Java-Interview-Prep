import java.util.Arrays;

public class MissingNumber {

    public static int findMissingNumber(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array must not be null.");
        }

        int n = arr.length;
        int xor = n;

        for (int i = 0; i < n; i++) {
            xor ^= i;
            xor ^= arr[i];
        }

        return xor;
    }

    public static void main(String[] args) {
        int[] arr = {3, 0, 1};

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Missing Number: " + findMissingNumber(arr));
    }
}
