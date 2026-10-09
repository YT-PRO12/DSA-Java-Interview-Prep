# Elementary Sorts

A runnable foundation exercise; no LeetCode acceptance claim.

**Status:** Newly prepared implementation, verified by the repository regression harness. No online submission acceptance was verified.

## Approach

Compare three in-place sorts. Bubble moves the largest remaining item to the end; selection chooses the smallest remaining item; insertion extends a sorted prefix. Bubble and insertion are stable because equal values are not moved past each other; selection is generally unstable. All methods mutate the input.

## Complexity

- Time: O(n²) worst case for all three; O(n) best case for bubble/insertion, O(n²) for selection
- Auxiliary space: O(1)

## Implementation

[ElementarySorts.java](ElementarySorts.java)

## Run

From this folder with JDK 17 or newer:

```bash
javac ElementarySorts.java
java ElementarySorts
```
