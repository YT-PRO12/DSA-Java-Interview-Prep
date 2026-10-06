# Search in Rotated Sorted Array

## Problem

Given a sorted array that has been rotated at an unknown position, search for a target element.

Return its index if found, otherwise return `-1`.

## Approach

Use modified Binary Search.

At every step, at least one half of the array is sorted.

Check whether the left half is sorted:

`arr[left] <= arr[mid]`

If the target lies inside the sorted left half, search there.

Otherwise, search the other half.

If the left half is not sorted, the right half must be sorted.

Then check whether the target lies inside the sorted right half.

## Example

Input:

[4, 5, 6, 7, 0, 1, 2]

Target:

0

Output:

4

## Complexity

- Time Complexity: O(log n)
- Space Complexity: O(1)

## Interview Pattern

Binary Search / Modified Binary Search
