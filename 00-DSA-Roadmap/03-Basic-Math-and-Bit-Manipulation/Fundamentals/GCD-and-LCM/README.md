# GCD and LCM

A runnable foundation exercise; no LeetCode acceptance claim.

**Status:** Newly prepared implementation, verified by the repository regression harness. No online submission acceptance was verified.

## Approach

Euclid replaces the pair with the divisor and remainder until the remainder is zero. Convert to `long` before taking absolute values, including `Integer.MIN_VALUE`. Define gcd(0,0) and any LCM with zero as zero; divide before multiplying.

## Complexity

- Time: O(log(max(|a|, |b|) + 1))
- Auxiliary space: O(1)

## Implementation

[GcdLcm.java](GcdLcm.java)

## Run

From this folder with JDK 17 or newer:

```bash
javac GcdLcm.java
java GcdLcm
```
