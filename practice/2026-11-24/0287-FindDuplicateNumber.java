/** Interpret each value as a next pointer and locate the cycle entrance.
 * Under the problem's 1..n contract, it identifies the duplicate.
 * O(n) time and O(1) space; leaves the input unchanged.
 */
class FindDuplicateNumber {
    static int findDuplicate(int[] nums) {
        int slow = nums[0], fast = nums[0];
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
    public static void main(String[] args) {
        int[] sample = {1,3,4,2,2};
        int[] original = sample.clone();
        if (findDuplicate(sample) != 2 || findDuplicate(new int[]{3,1,3,4,2}) != 3
                || findDuplicate(new int[]{2,2,2,2,2}) != 2
                || !java.util.Arrays.equals(sample,original))
            throw new AssertionError("Duplicate search regression");
        System.out.println("PASS");
    }
}
