# 1248. Count Number of Nice Subarrays (Java)

[LeetCode 1248](https://leetcode.com/problems/count-number-of-nice-subarrays/)

A *nice subarray* contains exactly `k` odd numbers. A prefix count of odd elements converts this to a frequency lookup, even when zeros or even values appear consecutively.

## Prefix invariant

Let `oddCount` be the number of odd elements seen so far. A subarray ending at the current index contains exactly `k` odd elements when an **earlier** prefix had `oddCount - k` odd elements.

The map counts earlier prefix states. Initialize it with `{0: 1}` so subarrays beginning at index zero can be counted.

```java
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        Map<Integer, Integer> frequency = new HashMap<>();
        frequency.put(0, 1);

        int oddCount = 0;
        int answer = 0;

        for (int value : nums) {
            if ((value & 1) != 0) oddCount++;

            // Earlier prefixes yielding exactly k new odd numbers.
            answer += frequency.getOrDefault(oddCount - k, 0);

            // The current prefix is available to future positions.
            frequency.put(oddCount, frequency.getOrDefault(oddCount, 0) + 1);
        }
        return answer;
    }
}
```

## Dry run

Input: `nums = [1,1,2,1,1]`, `k = 3`.

| Index | Value | oddCount | Earlier prefixes with oddCount - k | Answer |
| ---: | ---: | ---: | ---: | ---: |
| 0 | 1 | 1 | 0 | 0 |
| 1 | 1 | 2 | 0 | 0 |
| 2 | 2 | 2 | 0 | 0 |
| 3 | 1 | 3 | 1 | 1 |
| 4 | 1 | 4 | 1 | 2 |

The two valid subarrays are `[1,1,2,1]` and `[1,2,1,1]`.

## Why the lookup comes before insertion

If the current prefix is inserted before the lookup, a case with `k=0` can count the empty interval as a subarray. Querying earlier prefixes first ensures the chosen start index precedes the current endpoint.

**Time:** O(n) expected with hash operations. **Extra space:** O(n) worst case. LeetCode guarantees `1 <= k <= nums.length`, so the empty-interval issue is an important general prefix-sum lesson rather than a valid-input failure in this particular problem.
