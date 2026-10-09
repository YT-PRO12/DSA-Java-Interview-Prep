# Sorted Array Pair Sum

A runnable foundation exercise; no LeetCode acceptance claim.

**Status:** Newly prepared implementation, verified by the repository regression harness. No online submission acceptance was verified.

## Approach

For an ascending array, move the left pointer when the sum is too small and the right pointer when it is too large. Return zero-based indices or `[-1, -1]` when no pair exists. This teaching contract intentionally differs from LeetCode 167; addition uses `long`.

## Complexity

- Time: O(n)
- Auxiliary space: O(1)

## Implementation

[SortedArrayPairSum.java](SortedArrayPairSum.java)

## Run

From this folder with JDK 17 or newer:

```bash
javac SortedArrayPairSum.java
java SortedArrayPairSum
```
