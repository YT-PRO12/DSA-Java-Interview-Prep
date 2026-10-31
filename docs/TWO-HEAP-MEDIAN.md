# Two-heap median (LeetCode 295)

Maintain `small` as a max-heap containing the lower half and `large` as a min-heap containing the upper half.

## Invariants

1. Every item in `small` is less than or equal to every item in `large`.
2. `small.size()` equals `large.size()` or exceeds it by one.

Example input `[12, 3, 8, 20, 5]`: after insertion and rebalancing, lower half can contain `[3,5,8]` and upper half `[12,20]`. Their roots are 8 and 12, respectively, and the median is 8.

If sizes are equal, the median is `((long)small.peek() + large.peek()) / 2.0`; use a widened sum to avoid integer overflow. Otherwise the median is `small.peek()`.

Each insertion costs `O(log n)` and querying the median costs `O(1)`; total storage is `O(n)`.

See [Heaps roadmap](../00-DSA-Roadmap/14-Heaps-and-Priority-Queues/README.md).
