# Priority Queue Basics

A runnable foundation exercise; no LeetCode acceptance claim.

**Status:** Newly prepared implementation, verified by the repository regression harness. No online submission acceptance was verified.

## Approach

A PriorityQueue exposes its smallest element by default. Reverse the comparator for a max-heap. Repeated removal produces priority order; iterating a PriorityQueue does not guarantee sorted order. Comparator helpers avoid overflow from subtraction.

## Complexity

- Time: O(n log n) to insert and remove all values
- Auxiliary space: O(n) heap, plus O(n) output

## Implementation

[PriorityQueueBasics.java](PriorityQueueBasics.java)

## Run

From this folder with JDK 17 or newer:

```bash
javac PriorityQueueBasics.java
java PriorityQueueBasics
```
