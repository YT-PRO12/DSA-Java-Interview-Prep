# PriorityQueue interview cheat sheet (Java 17+)

A **priority queue** removes the element with the highest *priority* first. Java's default `PriorityQueue<Integer>` is a **min-heap**, so `peek()` and `poll()` return the smallest element.

## Comparator direction

```java
PriorityQueue<Integer> smallestFirst = new PriorityQueue<>();
PriorityQueue<Integer> largestFirst =
    new PriorityQueue<>(Comparator.reverseOrder());
```

For arrays, use an explicit comparator:

```java
PriorityQueue<int[]> byCountThenIndex = new PriorityQueue<>(
    (a, b) -> {
        int countOrder = Integer.compare(a[0], b[0]);
        return countOrder != 0 ? countOrder : Integer.compare(a[1], b[1]);
    }
);
```

`Integer.compare` avoids integer overflow from `a[0] - b[0]`.

## Top K invariant

To retain the **K largest** numbers, keep a **min-heap of at most K** elements:

1. Offer the next value.
2. If heap size exceeds K, poll the *smallest* value.
3. The remaining values are the K largest encountered so far (not in sorted iteration order).

Time: `O(n log k)`; extra space: `O(k)`.

For the **K closest** points, reverse the priority by distance and keep a **max-heap of size K**, so the farthest candidate is removed. Use `long` for squared distances:

```java
static long distanceSquared(int[] p) {
    return (long) p[0] * p[0] + (long) p[1] * p[1];
}
```

## Sliding-window maximum via heap

Store `{value, index}` in a max-heap. For each right endpoint `i`, add the element; discard entries at the heap top whose index is less than `i - k + 1`. Only write a result once `i >= k - 1`: the first complete window ends at index `k - 1`.

Heap method: `O(n log n)` worst case and `O(n)` space because stale entries can remain below the top. A monotonic deque improves this to `O(n)` time and `O(k)` space.

## Frequent mistakes

- `PriorityQueue` iteration is **not** sorted.
- `poll()` removes the **root**, not the last inserted element.
- A heap-based window must store indices to recognize expired elements.
- Comparators should return zero for equal priority and handle tie-breaking explicitly.
- `peek()` returns `null` for an empty heap.

Related: [Heaps chapter](../00-DSA-Roadmap/14-Heaps-and-Priority-Queues/README.md).
