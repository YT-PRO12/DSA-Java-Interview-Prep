# Four Sum

## Problem

Given an integer array and a target value, find all unique quadruplets whose sum equals the target.

## Approach

First sort the array.

Use two loops to fix the first two elements.

Then use two pointers:

- `left` starts after the second fixed element.
- `right` starts at the end.

If the sum equals the target, store the quadruplet.

If the sum is smaller than the target, move `left` forward.

If the sum is greater than the target, move `right` backward.

Skip duplicate values to avoid duplicate quadruplets.

`long` is used for the sum to reduce the risk of integer overflow.

## Example

Input:

[1, 0, -1, 0, -2, 2]

Target:

0

Output:

[[-2, -1, 1, 2], [-2, 0, 0, 2], [-1, 0, 0, 1]]

## Complexity

- Time Complexity: O(n³)
- Space Complexity: O(1) auxiliary space, excluding the output.

## Interview Pattern

Sorting + Two Pointers
