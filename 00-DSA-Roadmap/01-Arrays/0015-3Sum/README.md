# Three Sum

## Problem

Given an integer array, find all unique triplets whose sum is `0`.

## Approach

First sort the array.

Then fix one element using a loop and use two pointers for the remaining two elements:

- `left` starts after the fixed element.
- `right` starts at the end.

If the sum is:

- `0` ? store the triplet and move both pointers.
- Less than `0` ? move `left` forward.
- Greater than `0` ? move `right` backward.

Skip duplicate values to avoid duplicate triplets.

## Example

Input:

[-1, 0, 1, 2, -1, -4]

Output:

[[-1, -1, 2], [-1, 0, 1]]

## Complexity

- Time Complexity: O(n²)
- Space Complexity: O(1) auxiliary space, excluding the output.

## Interview Pattern

Sorting + Two Pointers
