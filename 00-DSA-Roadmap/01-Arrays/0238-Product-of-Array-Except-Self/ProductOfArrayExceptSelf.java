import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static int[] productExceptSelf(int[] arr) {

        int n = arr.length;
        int[] result = new int[n];

        result[0] = 1;

        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * arr[i - 1];
        }

        int rightProduct = 1;

        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * rightProduct;
            rightProduct = rightProduct * arr[i];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        int[] answer = productExceptSelf(arr);

        System.out.println("Product array: " + Arrays.toString(answer));
    }
}
