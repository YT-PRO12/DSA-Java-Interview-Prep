# Primes and Divisors

A runnable foundation exercise; no LeetCode acceptance claim.

**Status:** Newly prepared implementation, verified by the repository regression harness. No online submission acceptance was verified.

## Approach

Factors occur in pairs around the square root. Use `d <= n / d` to avoid multiplication overflow. Divisor enumeration requires a positive integer and emits a perfect-square root only once.

## Complexity

- Time: O(sqrt(n))
- Auxiliary space: O(d) for the divisor lists, where d is the number of divisors; O(1) for primality

## Implementation

[PrimesAndDivisors.java](PrimesAndDivisors.java)

## Run

From this folder with JDK 17 or newer:

```bash
javac PrimesAndDivisors.java
java PrimesAndDivisors
```
