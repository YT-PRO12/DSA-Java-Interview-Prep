# 347. Top K Frequent Elements — Java

[Official LeetCode problem](https://leetcode.com/problems/top-k-frequent-elements/)

Given an integer array and an integer k, return the k elements with highest frequencies. The problem accepts any order of the selected elements.

## Why bucket sorting works

No element can occur more than n times in an array of length n. First count values with a HashMap. Then create n + 1 buckets, where bucket f holds the distinct values appearing exactly f times. Traverse frequency buckets from n down to 1 until k elements have been selected.

```java
import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int value : nums) {
            frequency.put(value, frequency.getOrDefault(value, 0) + 1);
        }

        List<Integer>[] buckets = new ArrayList[nums.length + 1];
        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            int count = entry.getValue();
            if (buckets[count] == null) {
                buckets[count] = new ArrayList<>();
            }
            buckets[count].add(entry.getKey());
        }

        int[] answer = new int[k];
        int index = 0;
        for (int count = nums.length; count >= 1 && index < k; count--) {
            if (buckets[count] == null) continue;
            for (int value : buckets[count]) {
                if (index == k) break;
                answer[index++] = value;
            }
        }
        return answer;
    }
}
```

## Dry run

For nums = [1,1,1,2,2,3] and k = 2, the frequencies are 1→3, 2→2, 3→1. Bucket 3 contains 1 and bucket 2 contains 2, so the answer is [1,2].

For nums = [4,4,-1,-1,7] and k = 2, both 4 and -1 occur twice; returning either order is valid.

**Complexity:** O(n) expected time and O(n) extra space. The HashMap gives expected O(1) insertion; bucket creation and the reverse traversal each visit at most O(n) entries. The problem guarantees 1 ≤ k ≤ number of unique elements.

**Interview distinction:** LeetCode 692 (Top K Frequent Words) requires alphabetical tie breaking. LeetCode 347 does not, so this simpler bucket approach is valid.
