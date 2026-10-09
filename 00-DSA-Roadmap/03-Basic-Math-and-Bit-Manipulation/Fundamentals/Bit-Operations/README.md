# Bit Operations

A runnable foundation exercise; no LeetCode acceptance claim.

**Status:** Newly prepared implementation, verified by the repository regression harness. No online submission acceptance was verified.

## Approach

A one-bit mask selects a zero-based bit. OR sets it, AND with the inverted mask clears it, and XOR toggles it. The sign bit at position 31 is valid. Reject other positions because Java otherwise masks the shift distance modulo 32. The demo treats an integer as a small set of permissions.

## Complexity

- Time: O(1) per operation
- Auxiliary space: O(1)

## Implementation

[BitOperations.java](BitOperations.java)

## Run

From this folder with JDK 17 or newer:

```bash
javac BitOperations.java
java BitOperations
```
