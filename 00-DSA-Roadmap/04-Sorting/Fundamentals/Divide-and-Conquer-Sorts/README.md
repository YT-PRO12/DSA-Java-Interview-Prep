# Divide and Conquer Sorts

A runnable foundation exercise; no LeetCode acceptance claim.

**Status:** Newly prepared implementation, verified by the repository regression harness. No online submission acceptance was verified.

## Approach

Merge sort combines sorted half-open intervals using one reusable buffer. Quick sort partitions around a middle-element pivot and recurses into the smaller partition. Both mutate the input. Merge sort is stable; quick sort is not. Revisit the call tree after the Recursion section.

## Complexity

- Time: Merge: O(n log n); quick: O(n log n) average, O(n²) worst case
- Auxiliary space: Merge: O(n) buffer plus O(log n) stack; quick: O(log n) stack due to smaller-side recursion

## Implementation

[DivideAndConquerSorts.java](DivideAndConquerSorts.java)

## Run

From this folder with JDK 17 or newer:

```bash
javac DivideAndConquerSorts.java
java DivideAndConquerSorts
```
