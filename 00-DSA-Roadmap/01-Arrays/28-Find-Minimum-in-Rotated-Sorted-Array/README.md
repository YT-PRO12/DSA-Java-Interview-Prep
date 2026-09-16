# Find Minimum in Rotated Sorted Array

## Problem

Given a sorted array that has been rotated at an unknown position, find the minimum element.

All elements are unique.

## Approach

Use Binary Search.

Compare the middle element with the rightmost element.

If:

`arr[mid] > arr[right]`

the minimum must be on the right side of `mid`.

Therefore:

`left = mid + 1`

Otherwise, the minimum is at `mid` or somewhere on its left.

Therefore:

`right = mid`

Continue until `left == right`.

That position contains the minimum element.

## Example

Input:

[4, 5, 6, 7, 0, 1, 2]

Output:

0

## Complexity

- Time Complexity: O(log n)
- Space Complexity: O(1)

## Interview Pattern

Binary Search / Rotated Sorted Array
