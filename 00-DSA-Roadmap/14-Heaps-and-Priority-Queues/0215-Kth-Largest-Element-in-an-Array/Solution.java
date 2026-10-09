import java.util.PriorityQueue;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> largest = new PriorityQueue<>();
        for (int value : nums) {
            largest.offer(value);
            if (largest.size() > k) largest.remove();
        }
        return largest.element();
    }
}
