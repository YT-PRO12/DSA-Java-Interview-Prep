# Basic Math and Bit Manipulation

[Roadmap](../README.md) · [Repository guide](../../README.md)

Learn numerical invariants and bit masks that simplify arithmetic, counting, and small-set representations.

## Concepts Covered

- Euclidean GCD and overflow-safe LCM
- Primes and divisor pairs
- AND, OR, XOR, NOT and shifts
- Set, clear, check and toggle bits

## Problem Index

| # | LeetCode | Problem | Difficulty | Pattern | Solution |
|---:|---:|---|---|---|---|
| 1 | 136 | [Single Number](https://leetcode.com/problems/single-number/) | Easy | Bit Manipulation / XOR | [Java](0136-Single-Number/SingleNumber.java) |
| 2 | 191 | [Number of 1 Bits](https://leetcode.com/problems/number-of-1-bits/) | Easy | Clear lowest set bit | [Java](0191-Number-of-1-Bits/Solution.java) |
| 3 | 268 | [Missing Number](https://leetcode.com/problems/missing-number/) | Easy | Array / Mathematical Approach | [Java](0268-Missing-Number/MissingNumber.java) |

## Fundamentals

| Exercise | Focus | Implementation |
|---|---|---|
| [Bit Operations](Fundamentals/Bit-Operations/README.md) | Bit Operations | [Java](Fundamentals/Bit-Operations/BitOperations.java) |
| [GCD and LCM](Fundamentals/GCD-and-LCM/README.md) | GCD and LCM | [Java](Fundamentals/GCD-and-LCM/GcdLcm.java) |
| [Primes and Divisors](Fundamentals/Primes-and-Divisors/README.md) | Primes and Divisors | [Java](Fundamentals/Primes-and-Divisors/PrimesAndDivisors.java) |

## Learning Progression

1. GCD and divisibility
2. Prime and factor tests
3. Single-bit masks
4. XOR and set-bit counting

## Interview Essentials

- Cast before arithmetic when an intermediate can overflow int.
- Use d <= n / d for a square-root loop without d*d overflow.
- Java shifts mask the shift distance; validate bit positions.
- XOR cancels equal pairs; that argument relies on the problem’s multiplicities.

## Learning Outcomes

Explain the arithmetic invariant, handle zero and sign boundaries, and use a mask as a compact set.

## Related Practice

- [78. Subsets](../10-Backtracking/0078-Subsets)
- [50. Pow(x, n)](../09-Recursion/0050-Pow-x-n)

Counts reflect files in this repository, not verified LeetCode acceptances. See the [validation report](../../docs/VALIDATION.md) for the verification scope.
