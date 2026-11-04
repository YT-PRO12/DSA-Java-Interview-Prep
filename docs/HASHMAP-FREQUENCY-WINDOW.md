# Frequency maps in sliding windows

A `HashMap<Integer,Integer>` tracks how many times each value appears **inside the current window**, not in the entire input.

When the right pointer adds `value`:

```java
map.put(value, map.getOrDefault(value, 0) + 1);
```

When the left pointer removes one occurrence:

```java
int leaving = nums[left++];
int frequency = map.get(leaving);
if (frequency == 1) map.remove(leaving);
else map.put(leaving, frequency - 1);
```

## Why remove when frequency is 1?

For the window `[1, 3, 1]`, frequencies are `{1=2, 3=1}`. Remove the leftmost 1: now `{1=1, 3=1}`. Remove 3 next: the last 3 has left, so delete its key. Keeping `3=0` would incorrectly count 3 as a present distinct value when checking `map.size()`.

The invariant: after each update, the map contains exactly the values with positive frequencies in the current interval. Under standard hashing assumptions, both pointer updates take expected O(1) time.

Related: [LeetCode 2799 complete subarrays](COMPLETE-SUBARRAYS-SLIDING-WINDOW.md).
