# PriorityQueue: visual dry run

A Java `PriorityQueue<Integer>` is a **min-heap** by default. It stores elements in an internal heap array, not a sorted array. `peek()` returns the minimum; `poll()` removes that minimum.

## Insert and remove

Input values: `[7, 2, 9, 4]`.

| Operation | Heap's minimum | Values present (unordered set notation) |
| --- | --- | --- |
| offer(7) | 7 | 7 |
| offer(2) | 2 | 2, 7 |
| offer(9) | 2 | 2, 7, 9 |
| offer(4) | 2 | 2, 4, 7, 9 |
| poll() | 4 | 4, 7, 9 |
| poll() | 7 | 7, 9 |

The first `poll()` returned 2; the second returned 4. The displayed collection deliberately does **not** claim the internal heap-array order.

## Why a size-k min-heap finds k largest

Input: `[5, 1, 9, 3, 7]`; `k = 3`.

1. Insert 5, 1, 9: heap retains `{1,5,9}`.
2. Insert 3: size becomes 4; remove smallest 1; retain `{3,5,9}`.
3. Insert 7: remove smallest 3; retain `{5,7,9}`.

The retained three values are the largest three. Use `O(n log k)` time and `O(k)` space. See [heap interview notes](HEAP-INTERVIEW-CHEATSHEET.md).
