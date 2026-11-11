# 1004. Max Consecutive Ones III

[LeetCode 1004](https://leetcode.com/problems/max-consecutive-ones-iii/)

## Sliding-window invariant

Find the longest contiguous interval containing **at most k zeros**. Changing up to k zeros to ones makes that interval all ones.

Expand the right endpoint and count zeros. While the current interval contains more than k zeros, move the left endpoint right, subtracting a zero whenever one leaves. Only evaluate the window length after the interval becomes valid.

```java
class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int zeros = 0;
        int best = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) zeros++;

            while (zeros > k) {
                if (nums[left] == 0) zeros--;
                left++;
            }

            best = Math.max(best, right - left + 1);
        }
        return best;
    }
}
```

## Dry run

Input: `[1,1,1,0,0,0,1,1,1,1,0]`, `k=2`.

At `right=5`, the prefix contains three zeros, so the left pointer advances past the first zero at index 3. After this, the window `[4..5]` contains exactly two zeros. Continuing right reaches `[4..9]`, containing two zeros and four ones; its length is **6**. The final zero forces another shrink, so the best remains 6.

For `k=0`, the algorithm finds the longest existing run of ones. For an all-ones array, the answer is its entire length.

**Complexity:** O(n) time because each pointer only moves forward, O(1) auxiliary space. The problem guarantees binary input and a nonnegative `k`.
