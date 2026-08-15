import java.util.Arrays;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int slow = 0;

        for (int fast = 1; fast < arr.length; fast++) {
            if (arr[fast] != arr[slow]) {
                slow++;
                arr[slow] = arr[fast];
            }
        }

        return slow + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4};

        System.out.println("Original Array: " + Arrays.toString(arr));

        int uniqueCount = removeDuplicates(arr);

        System.out.println("Number of Unique Elements: " + uniqueCount);
        System.out.println("Array Without Duplicates: "
                + Arrays.toString(Arrays.copyOf(arr, uniqueCount)));
    }
}
