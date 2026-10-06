# Add Strings

## Problem

Add two non-negative integers represented as strings without converting the complete strings into integers.

## Approach

Start from the last digit of both strings.

For every position:

1. Get both digits.
2. Add them with the carry.
3. Store `sum % 10`.
4. Update carry using `sum / 10`.

Since digits are generated from right to left, reverse the result at the end.

## Example

456 + 77 = 533

## Complexity

- Time Complexity: O(max(n, m))
- Space Complexity: O(max(n, m))

## Interview Pattern

Two Pointers / Carry / String Simulation
