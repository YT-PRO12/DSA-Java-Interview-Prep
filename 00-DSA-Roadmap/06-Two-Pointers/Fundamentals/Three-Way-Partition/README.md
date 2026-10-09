# Three Way Partition

A runnable foundation exercise; no LeetCode acceptance claim.

**Status:** Newly prepared implementation, verified by the repository regression harness. No online submission acceptance was verified.

## Approach

Partition arbitrary integer values into less-than, equal-to and greater-than regions. Return the half-open interval containing values equal to the pivot. This in-place operation is not stable. Compare with the specialized Sort Colors implementation through the topic cross-links.

## Complexity

- Time: O(n)
- Auxiliary space: O(1)

## Implementation

[ThreeWayPartition.java](ThreeWayPartition.java)

## Run

From this folder with JDK 17 or newer:

```bash
javac ThreeWayPartition.java
java ThreeWayPartition
```
