# 692. Top K Frequent Words — Java PriorityQueue

[LeetCode 692](https://leetcode.com/problems/top-k-frequent-words/)

The output order is **higher frequency first**, with lexicographically smaller words first when frequencies tie. Use a HashMap to count words and a min-heap of at most `k` entries that retains the **best** candidates.

For eviction, the heap root must be the *worst* retained word: lower frequency first; on a tie, lexicographically **larger** word first.

```java
import java.util.*;

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> frequency = new HashMap<>();
        for (String word : words) {
            frequency.put(word, frequency.getOrDefault(word, 0) + 1);
        }

        PriorityQueue<String> heap = new PriorityQueue<>((a, b) -> {
            int cmp = Integer.compare(frequency.get(a), frequency.get(b));
            return cmp != 0 ? cmp : b.compareTo(a);
        });

        for (String word : frequency.keySet()) {
            heap.offer(word);
            if (heap.size() > k) {
                heap.poll();
            }
        }

        LinkedList<String> answer = new LinkedList<>();
        while (!heap.isEmpty()) {
            answer.addFirst(heap.poll());
        }
        return answer;
    }
}
```

## Dry run

Input: `["i","love","leetcode","i","love","coding"]`, `k = 2`. Counts: `i=2`, `love=2`, `coding=1`, `leetcode=1`. The two frequency-two words remain; for their tie, `love` is treated as worse than `i`, so polling and prepending gives `["i","love"]`.

For `["a","b","b","a","c"]` and `k=2`, the result is `["a","b"]`. The heap can be processed in arbitrary HashMap iteration order, yet its comparator makes the retained top two consistent.

**Complexity:** Let `n` be total words, `u` distinct words, and `L` maximum word length. Counting takes O(n) expected hash operations. Heap operations take O(u log k) comparisons (up to O(L) for lexical ties). Extra space: O(u + k), excluding the answer. The problem guarantees `1 <= k <= u`.
