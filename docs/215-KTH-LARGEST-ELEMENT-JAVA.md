# 215. Kth Largest Element in an Array

[LeetCode 215](https://leetcode.com/problems/kth-largest-element-in-an-array/)

Find the kth largest value counting duplicates separately. Sorting in descending order works but takes O(n log n); a min-heap of size k keeps only the k largest values seen so far.

## Java implementation

```java
import java.util.PriorityQueue;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> smallestOfTopK = new PriorityQueue<>();

        for (int number : nums) {
            smallestOfTopK.offer(number);
            if (smallestOfTopK.size() > k) {
                smallestOfTopK.poll();
            }
        }

        return smallestOfTopK.peek();
    }
}
```

## Why this works

After processing any prefix, the heap holds its k largest elements (or all elements if fewer than k). The heap root is the **smallest of those k values**. When the prefix becomes the whole array, that root is exactly the kth largest value, not necessarily the kth distinct value.

For `nums = [3,2,1,5,6,4]`, k = 2, the heap evolves as follows (shown as values sorted for clarity): `[3]`, `[2,3]`, `[2,3]`, `[3,5]`, `[5,6]`, `[5,6]`. The result is **5**.

For `[3,2,3,1,2,4,5,5,6]`, k = 4, the answer is **4** because the four largest occurrences are `6, 5, 5, 4`.

**Time:** O(n log k). **Space:** O(k). LeetCode guarantees `1 <= k <= nums.length`.

**Interview tip:** A size-k *min* heap retains the k largest numbers. A size-k *max* heap instead retains the k smallest numbers. Quickselect is another expected O(n) approach but has a more delicate partition invariant.
