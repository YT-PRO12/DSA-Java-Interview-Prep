# Remove Duplicates from Sorted Array

## Problem

Given a sorted array, remove duplicates in-place so that each element appears only once.

## Approach

Use two pointers.

- `i` scans the array.
- `index` keeps the position where the next unique element should be placed.

Because the array is sorted, duplicate elements are next to each other.

## Example

Input:
[1, 1, 2, 2, 3, 4, 4, 5]

Output:
[1, 2, 3, 4, 5]

New length:
5

## Complexity

- Time Complexity: O(n)
- Space Complexity: O(1)

## Interview Pattern

Two Pointers / In-Place Array Modification
