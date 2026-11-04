# Count Complete Subarrays in an Array — LeetCode 2799

[Problem](https://leetcode.com/problems/count-complete-subarrays-in-an-array/)

A subarray is *complete* when it contains every distinct value present anywhere in the input. First count the number of distinct values in the full array with a `HashSet<Integer>`.

## Sliding-window invariant

Maintain `left`, `right`, and a `HashMap<Integer, Integer>` containing the **frequencies** of values in the current interval `[left, right]`. When `map.size()` equals the total distinct count, this window is complete.

For fixed `left` and `right`, every extension ending after `right` is also complete. Therefore add `n - right` to the answer. Then remove one occurrence of `nums[left]` and increment `left` to find more valid starts.

```java
import java.util.*;

class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> distinct = new HashSet<>();
        for (int value : nums) distinct.add(value);

        Map<Integer, Integer> countByValue = new HashMap<>();
        int left = 0;
        int total = 0;

        for (int right = 0; right < nums.length; right++) {
            int value = nums[right];
            countByValue.put(value, countByValue.getOrDefault(value, 0) + 1);

            while (countByValue.size() == distinct.size()) {
                total += nums.length - right;
                int leaving = nums[left++];
                int frequency = countByValue.get(leaving);
                if (frequency == 1) countByValue.remove(leaving);
                else countByValue.put(leaving, frequency - 1);
            }
        }
        return total;
    }
}
```

Why remove the key at frequency one? Once its last occurrence leaves, that value is **no longer present** in the window. Keeping a zero-frequency entry would make `map.size()` incorrect.

Each pointer moves forward at most `n` steps: O(n) expected time with hashing and O(d) extra space for `d` distinct values. For `[1,3,1,2,2]`, the answer is 4.
