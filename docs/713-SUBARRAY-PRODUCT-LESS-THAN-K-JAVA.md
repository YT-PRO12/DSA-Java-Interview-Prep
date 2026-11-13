# 713. Subarray Product Less Than K (Java)

[LeetCode 713](https://leetcode.com/problems/subarray-product-less-than-k/)

Given an array of **positive integers**, count contiguous subarrays whose product is strictly less than `k`. A variable-size sliding window works because removing positive factors from the left cannot increase the product.

## Key invariant

After processing each `right` endpoint, shrink from the left until the product of `nums[left..right]` is less than `k`. Every suffix ending at `right` and starting at any index in `[left..right]` is then valid.

There are exactly `right - left + 1` such suffixes. We add them to the answer once per right endpoint—no nested enumeration is needed.

```java
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;

        int left = 0;
        int count = 0;
        long product = 1;

        for (int right = 0; right < nums.length; right++) {
            product *= nums[right];

            while (product >= k) {
                product /= nums[left];
                left++;
            }

            count += right - left + 1;
        }

        return count;
    }
}
```

## Dry run

Input: `nums = [10, 5, 2, 6]`, `k = 100`.

| Right | Value | Current valid window | New valid subarrays | Running count |
| ---: | ---: | --- | ---: | ---: |
| 0 | 10 | [10] | 1 | 1 |
| 1 | 5 | [10, 5] | 2 | 3 |
| 2 | 2 | [5, 2] | 2 | 5 |
| 3 | 6 | [5, 2, 6] | 3 | 8 |

At index 2, `10 × 5 × 2 = 100` is **not** smaller than 100. Removing 10 leaves `[5,2]` with product 10, giving the two new subarrays `[5,2]` and `[2]`.

If `k <= 1`, no nonempty product of positive integers can satisfy the strict bound, so return zero.

**Complexity:** O(n) time—each pointer moves at most n times—and O(1) auxiliary space. The problem's positivity constraint is essential; this method is not valid for arbitrary signed input or zeros without separate handling.
