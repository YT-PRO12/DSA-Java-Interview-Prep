# Java PriorityQueue comparator safety

Prefer Integer.compare or Long.compare instead of subtracting two keys, which can overflow.

```java
PriorityQueue<int[]> nearestFirst = new PriorityQueue<>(
    (a, b) -> Long.compare(distanceSquared(a), distanceSquared(b))
);

static long distanceSquared(int[] p) {
    return (long) p[0] * p[0] + (long) p[1] * p[1];
}
```

For a max-heap, reverse the arguments to Long.compare. Explicitly handle equal priority when deterministic tie order matters; the standard PriorityQueue is not stable.

A heap's iterator is not sorted. Use poll repeatedly when sorted extraction is required.
