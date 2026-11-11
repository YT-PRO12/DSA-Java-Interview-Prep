# 239. Sliding Window Maximum — Java Monotonic Deque

[LeetCode 239](https://leetcode.com/problems/sliding-window-maximum/)

For every contiguous window of size `k`, return its maximum. A max-heap can work, but keeping candidate **indices** in a decreasing monotonic deque solves the problem in linear time.

## Invariants

- Deque indices are in increasing order from front to back.
- Their values are in decreasing order from front to back.
- The front always identifies the maximum within the current window.
- Remove expired indices before reading the window maximum.

```java
import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deque = new ArrayDeque<>();
        int[] answer = new int[nums.length - k + 1];

        for (int right = 0; right < nums.length; right++) {
            while (!deque.isEmpty() && deque.peekFirst() <= right - k) {
                deque.removeFirst();
            }

            while (!deque.isEmpty()
                    && nums[deque.peekLast()] <= nums[right]) {
                deque.removeLast();
            }
            deque.addLast(right);

            if (right >= k - 1) {
                answer[right - k + 1] = nums[deque.peekFirst()];
            }
        }
        return answer;
    }
}
```

## Dry run

Input: `nums = [1,3,-1,-3,5,3,6,7]`, `k = 3`.

The first complete window `[1,3,-1]` has maximum 3. When `-3` arrives, index 0 has already expired and the maximum stays 3. When 5 arrives, it removes all weaker candidates from the back, so the next maximum is 5. Continuing yields:

`[3,3,5,5,6,7]`

The deque stores indices rather than values because expiration is based on the **index**, not the number. Equal values can discard older positions safely because the newer equal value expires later.

**Complexity:** O(n) time; each index enters and leaves the deque at most once. O(k) auxiliary space plus the output array. LeetCode guarantees `1 <= k <= nums.length`.
