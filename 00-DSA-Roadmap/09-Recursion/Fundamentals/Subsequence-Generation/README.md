# Subsequence Generation

A runnable foundation exercise; no LeetCode acceptance claim.

**Status:** Newly prepared implementation, verified by the repository regression harness. No online submission acceptance was verified.

## Approach

Each character creates an exclude branch and an include branch. Restore the mutable path after inclusion. The empty subsequence is included; equal characters can produce equal strings from different index choices. Keep inputs small because the output is exponential.

## Complexity

- Time: O(n × 2^n), including copying outputs
- Auxiliary space: O(n) working stack/path; O(n × 2^n) output

## Implementation

[Subsequences.java](Subsequences.java)

## Run

From this folder with JDK 17 or newer:

```bash
javac Subsequences.java
java Subsequences
```
