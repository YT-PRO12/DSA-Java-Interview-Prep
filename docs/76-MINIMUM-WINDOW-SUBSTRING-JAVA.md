# 76. Minimum Window Substring

[LeetCode 76](https://leetcode.com/problems/minimum-window-substring/)

## Key idea

Find the shortest contiguous substring of `s` containing every character of `t`, including repeated characters. A set is insufficient: if `t = "AABC"`, we need two `A` characters, not one.

Use a frequency array `need` and an integer `missing`. `missing` counts the total number of character occurrences that are still required, including duplicates. As the right edge expands, decrement the frequency; when the old frequency was positive, we have satisfied one needed occurrence. When `missing == 0`, shrink from the left while retaining a valid window.

```java
class Solution {
    public String minWindow(String s, String t) {
        if (t.length() > s.length()) return "";

        int[] need = new int[128];
        for (int i = 0; i < t.length(); i++) {
            need[t.charAt(i)]++;
        }

        int missing = t.length();
        int left = 0;
        int bestStart = 0;
        int bestLength = Integer.MAX_VALUE;

        for (int right = 0; right < s.length(); right++) {
            char added = s.charAt(right);
            if (need[added] > 0) missing--;
            need[added]--;

            while (missing == 0) {
                int length = right - left + 1;
                if (length < bestLength) {
                    bestLength = length;
                    bestStart = left;
                }

                char removed = s.charAt(left++);
                need[removed]++;
                if (need[removed] > 0) missing++;
            }
        }

        return bestLength == Integer.MAX_VALUE
            ? ""
            : s.substring(bestStart, bestStart + bestLength);
    }
}
```

## Dry run

For `s = "ADOBECODEBANC"` and `t = "ABC"`, the first valid window is `"ADOBEC"` (length 6). As `right` advances and `left` shrinks, the best valid window becomes `"BANC"` (length 4).

If `s = "a"` and `t = "aa"`, return the empty string; there aren't enough `a` occurrences. If `s = "aa"` and `t = "aa"`, return `"aa"`.

**Complexity:** O(|s| + |t|) time because both pointers move only forward, and O(1) auxiliary space for a fixed ASCII-sized count array. This implementation uses the problem's English-letter character constraints.
