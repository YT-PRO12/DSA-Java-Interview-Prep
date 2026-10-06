# Move Zeroes

## Problem

Given an array, move all zeroes to the end while maintaining the relative order of the non-zero elements.

## Approach

Use a pointer `index` to place non-zero elements at the beginning.

After all non-zero elements are placed, fill the remaining positions with zeroes.

The operation is performed in-place.

## Example

Input:
[0, 1, 0, 3, 12]

Output:
[1, 3, 12, 0, 0]

## Complexity

- Time Complexity: O(n)
- Space Complexity: O(1)

## Interview Pattern

Two Pointers / In-Place Array Modification
