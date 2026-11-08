# 3. Longest Substring Without Repeating Characters

[LeetCode problem](https://leetcode.com/problems/longest-substring-without-repeating-characters/)

## Pattern: variable-size sliding window

Maintain a window `[left, right]` containing **no repeated characters**. For each character at index `right`, check its last known index. If that index lies inside the current window, move `left` to one position beyond it.

Do **not** move `left` backward if the last occurrence was in an older, already-discarded window. Use `Math.max(left, previous + 1)`.

```java
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> lastSeen = new HashMap<>();
        int left = 0;
        int longest = 0;

        for (int right = 0; right < s.length(); right++) {
            char current = s.charAt(right);
            if (lastSeen.containsKey(current)) {
                left = Math.max(left, lastSeen.get(current) + 1);
            }
            lastSeen.put(current, right);
            longest = Math.max(longest, right - left + 1);
        }
        return longest;
    }
}
```

## Dry run: `"abba"`

| Right | Character | Left after update | Active window | Best length |
| ---: | :---: | ---: | --- | ---: |
| 0 | a | 0 | a | 1 |
| 1 | b | 0 | ab | 2 |
| 2 | b | 2 | b | 2 |
| 3 | a | 2 | ba | 2 |

At index 3, `a` was last seen at index 0, which is outside the current window. Updating `left` with `Math.max(2, 1)` correctly keeps it at 2.

**Complexity:** O(n) expected time and O(min(n, distinct characters)) extra space for the hash map. Here each Java `char` is a UTF-16 code unit, matching the simple character-level interpretation used for this LeetCode question. An empty string returns 0.
