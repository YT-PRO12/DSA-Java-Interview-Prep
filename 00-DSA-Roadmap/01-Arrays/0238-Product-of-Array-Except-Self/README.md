# Product of Array Except Self

## Problem

Given an integer array, return an array where each element contains the product of all elements except the element at the same index.

Do not use division.

## Approach

Use prefix and suffix products.

First pass stores the product of all elements to the left of each index.

Second pass multiplies this with the product of all elements to the right.

This produces the answer without using division.

## Example

Input:

[1, 2, 3, 4]

Output:

[24, 12, 8, 6]

## Complexity

- Time Complexity: O(n)
- Space Complexity: O(1) auxiliary space

The output array itself requires O(n) space.

## Interview Pattern

Prefix Product + Suffix Product
