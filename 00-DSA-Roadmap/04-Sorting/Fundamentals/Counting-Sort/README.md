# Counting Sort

A runnable foundation exercise; no LeetCode acceptance claim.

**Status:** Newly prepared implementation, verified by the repository regression harness. No online submission acceptance was verified.

## Approach

Count nonnegative integer keys in a known, bounded domain and reconstruct the array. Validate the full input before mutating it. The explicit maximum of 1,000,000 bounds the teaching example’s memory usage. This version sorts primitive values; it does not implement stable record sorting.

## Complexity

- Time: O(n + k), k = maximum + 1
- Auxiliary space: O(k)

## Implementation

[CountingSort.java](CountingSort.java)

## Run

From this folder with JDK 17 or newer:

```bash
javac CountingSort.java
java CountingSort
```
