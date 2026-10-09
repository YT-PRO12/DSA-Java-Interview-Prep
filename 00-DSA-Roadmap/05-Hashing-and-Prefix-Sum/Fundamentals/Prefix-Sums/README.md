# Prefix Sums

A runnable foundation exercise; no LeetCode acceptance claim.

**Status:** Newly prepared implementation, verified by the repository regression harness. No online submission acceptance was verified.

## Approach

Use an extra leading zero so the sum of `[from, to)` is `prefix[to] - prefix[from]`. Empty ranges have sum zero. `long` safely stores sums of `int` values. `rangeSum` expects a prefix array produced by `build`.

## Complexity

- Time: Build O(n); each query O(1)
- Auxiliary space: O(n) for the prefix array; O(1) per query

## Implementation

[PrefixSums.java](PrefixSums.java)

## Run

From this folder with JDK 17 or newer:

```bash
javac PrefixSums.java
java PrefixSums
```
