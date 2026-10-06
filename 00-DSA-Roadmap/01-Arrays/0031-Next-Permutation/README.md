# Next Permutation

## Problem

Given an array of integers representing a permutation, rearrange the numbers into the lexicographically next greater permutation.

If no greater permutation exists, rearrange the array into the lowest possible order.

## Approach

1. Find the first decreasing element from the right.
2. Find the smallest element on the right that is greater than it.
3. Swap those two elements.
4. Reverse the elements after the first position.

## Example

Input:

[1, 2, 3]

Output:

[1, 3, 2]

## Complexity

- Time Complexity: O(n)
- Space Complexity: O(1)

## Interview Pattern

Greedy + Two Pointers / In-Place Array Manipulation
