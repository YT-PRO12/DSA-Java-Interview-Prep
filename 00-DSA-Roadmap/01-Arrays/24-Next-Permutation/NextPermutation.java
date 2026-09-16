import java.util.Arrays;

public class NextPermutation {

    public static void nextPermutation(int[] arr) {

        int n = arr.length;
        int i = n - 2;

        // Find the first decreasing element from the right
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        if (i >= 0) {

            // Find the smallest element greater than arr[i]
            int j = n - 1;

            while (arr[j] <= arr[i]) {
                j--;
            }

            // Swap
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // Reverse the suffix
        int left = i + 1;
        int right = n - 1;

        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        nextPermutation(arr);

        System.out.println("Next permutation: " + Arrays.toString(arr));
    }
}
