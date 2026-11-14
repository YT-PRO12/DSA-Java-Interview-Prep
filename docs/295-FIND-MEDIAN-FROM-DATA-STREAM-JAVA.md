# 295. Find Median from Data Stream — Java

[LeetCode 295](https://leetcode.com/problems/find-median-from-data-stream/)

Design an object that supports adding integers and retrieving the median of all values seen so far. Sorting after each insertion is wasteful. Maintain two priority queues instead:

- `lower`: a **max-heap** holding the smaller half; its root is the largest lower-half value.
- `upper`: a **min-heap** holding the larger half; its root is the smallest upper-half value.

## Invariants

1. Every value in `lower` is less than or equal to every value in `upper`.
2. `lower.size()` is either equal to `upper.size()` or exactly one greater.
3. For an odd count, the median is `lower.peek()`. For an even count, average the two roots.

```java
import java.util.Collections;
import java.util.PriorityQueue;

class MedianFinder {
    private final PriorityQueue<Integer> lower =
        new PriorityQueue<>(Collections.reverseOrder());
    private final PriorityQueue<Integer> upper =
        new PriorityQueue<>();

    public MedianFinder() {}

    public void addNum(int num) {
        if (lower.isEmpty() || num <= lower.peek()) {
            lower.offer(num);
        } else {
            upper.offer(num);
        }

        if (lower.size() > upper.size() + 1) {
            upper.offer(lower.poll());
        } else if (upper.size() > lower.size()) {
            lower.offer(upper.poll());
        }
    }

    public double findMedian() {
        if (lower.size() > upper.size()) {
            return lower.peek();
        }
        // Promote before adding: two int roots can overflow an int sum.
        return ((long) lower.peek() + (long) upper.peek()) / 2.0;
    }
}
```

## Dry run

Insert `1, 2, 3, 4` in that order.

| Inserted | Lower (max side) | Upper (min side) | Median |
| --- | --- | --- | ---: |
| 1 | [1] | [] | 1 |
| 2 | [1] | [2] | 1.5 |
| 3 | [2, 1] | [3] | 2 |
| 4 | [2, 1] | [3, 4] | 2.5 |

The heap contents are shown as sets of values, not sorted internal arrays. Each insertion preserves both invariants after at most one transfer.

**Important comparator rule:** `Collections.reverseOrder()` avoids subtraction-based comparators such as `(a,b) -> b-a`, which overflow at extreme integers. Similarly, the cast to `long` prevents overflow when averaging two large values.

**Complexity:** `addNum` O(log n) time, `findMedian` O(1) time, O(n) stored values. LeetCode guarantees `findMedian()` is called only after at least one insertion.
