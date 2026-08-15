import java.util.Arrays;

public class RemoveDuplicatesII {

    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }

        int write = 2;

        for (int read = 2; read < nums.length; read++) {
            if (nums[read] != nums[write - 2]) {
                nums[write] = nums[read];
                write++;
            }
        }

        return write;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};

        int length = removeDuplicates(nums);

        System.out.println("New Length: " + length);
        System.out.println("Array: "
                + Arrays.toString(Arrays.copyOf(nums, length)));
    }
}
