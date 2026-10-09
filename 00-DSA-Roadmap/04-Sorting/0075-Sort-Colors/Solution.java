class Solution {
    public void sortColors(int[] nums) {
        int low = 0, current = 0, high = nums.length - 1;
        while (current <= high) {
            if (nums[current] == 0) {
                swap(nums, low++, current++);
            } else if (nums[current] == 2) {
                swap(nums, current, high--);
            } else {
                current++;
            }
        }
    }
    private void swap(int[] nums, int a, int b) {
        int temporary = nums[a];
        nums[a] = nums[b];
        nums[b] = temporary;
    }
}
