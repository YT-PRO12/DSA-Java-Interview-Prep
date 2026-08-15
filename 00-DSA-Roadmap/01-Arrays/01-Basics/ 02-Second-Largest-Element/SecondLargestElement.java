import java.util.Arrays;

public class SecondLargestElement {

    public static int findSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int value : arr) {
            if (value > largest) {
                secondLargest = largest;
                largest = value;
            } else if (value > secondLargest && value < largest) {
                secondLargest = value;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Array must contain at least two distinct elements.");
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 20, 15};

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Second Largest Element: " + findSecondLargest(arr));
    }
}
