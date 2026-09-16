# Trapping Rain Water

## Problem

Given an array where each element represents the height of a vertical bar, calculate how much rain water can be trapped between the bars.

## Approach

Use two pointers:

- `left` starts from the beginning.
- `right` starts from the end.
- `leftMax` stores the maximum height seen from the left.
- `rightMax` stores the maximum height seen from the right.

At each step, process the side with the smaller height.

If the current height is smaller than its maximum boundary, water can be trapped.

Water trapped at a position is:

`maximum boundary - current height`

## Example

Input:

[0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]

Output:

6

## Complexity

- Time Complexity: O(n)
- Space Complexity: O(1)

## Interview Pattern

Two Pointers / Prefix-Suffix Maximum
