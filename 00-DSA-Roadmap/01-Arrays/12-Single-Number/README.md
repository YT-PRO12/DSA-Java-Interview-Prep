# Single Number

## Problem

Given an array where every element appears twice except for one element, find the element that appears only once.

## Approach

Use the XOR (`^`) operator.

Important XOR properties:

- `a ^ a = 0`
- `a ^ 0 = a`
- XOR is commutative, so the order does not matter.

Therefore, all duplicate elements cancel each other out and the remaining value is the single number.

## Example

Input:

[4, 1, 2, 1, 2]

Output:

4

## Complexity

- Time Complexity: O(n)
- Space Complexity: O(1)

## Interview Pattern

Bit Manipulation / XOR
