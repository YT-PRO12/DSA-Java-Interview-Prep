# Array Recursion

A runnable foundation exercise; no LeetCode acceptance claim.

**Status:** Newly prepared implementation, verified by the repository regression harness. No online submission acceptance was verified.

## Approach

The base case handles an empty suffix. Each call advances one index, so the remaining work shrinks. Use a loop for large arrays: Java does not eliminate these recursive stack frames.

## Complexity

- Time: O(n)
- Auxiliary space: O(n) call stack

## Implementation

[ArrayRecursion.java](ArrayRecursion.java)

## Run

From this folder with JDK 17 or newer:

```bash
javac ArrayRecursion.java
java ArrayRecursion
```
