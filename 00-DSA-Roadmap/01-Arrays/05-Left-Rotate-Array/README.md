# Left Rotate Array

## Problem

Given an array, left rotate it by one position.

## Approach

Store the first element temporarily.

Shift every remaining element one position to the left.

Finally, place the first element at the last position.

## Example

Input:
[1, 2, 3, 4, 5]

Output:
[2, 3, 4, 5, 1]

## Complexity

- Time Complexity: O(n)
- Space Complexity: O(1)

## Interview Pattern

Array Traversal / In-Place Modification
