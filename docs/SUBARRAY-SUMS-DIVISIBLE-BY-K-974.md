# 974. Subarray Sums Divisible by K

[LeetCode 974](https://leetcode.com/problems/subarray-sums-divisible-by-k/)

## Principle

A subarray sum is divisible by `k` when the prefix sums **before and after** it have the same remainder modulo `k`. Store how often each normalized remainder has appeared.

Java's `%` can return a negative remainder. Normalize using `((prefix % k) + k) % k`. Store remainder 0 once initially to count a qualifying subarray beginning at index zero.

```java
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> seen = new HashMap<>();
        seen.put(0, 1);
        long prefix = 0;
        int answer = 0;

        for (int num : nums) {
            prefix += num;
            int remainder = (int) (((prefix % k) + k) % k);
            answer += seen.getOrDefault(remainder, 0);
            seen.put(remainder, seen.getOrDefault(remainder, 0) + 1);
        }
        return answer;
    }
}
```

## Dry run

For `nums = [4, 5, 0, -2, -3, 1]` and `k = 5`, normalized prefix remainders are `[4, 4, 4, 2, 4, 0]`. Starting with remainder-frequency `{0:1}`, the added counts at each step are `0, 1, 2, 0, 3, 1`; total **7**.

The map counts *earlier prefix positions*, not the elements themselves. Query before inserting the current prefix to avoid counting an empty subarray.

**Complexity:** O(n) expected time and O(min(n, k)) additional space for positive `k`. The problem guarantees `k > 0`. Negative input elements are supported.
