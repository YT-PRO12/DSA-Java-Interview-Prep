# Container With Most Water

## Problem

Given an array where each element represents the height of a vertical line, find two lines that together with the x-axis form a container that holds the maximum amount of water.

## Approach

Use two pointers:

- `left` starts at the first element.
- `right` starts at the last element.

The area between two lines is:

`width × minimum height`

So:

`area = (right - left) × min(height[left], height[right])`

After calculating the current area, move the pointer with the smaller height.

Why?

The smaller height limits the amount of water. Moving the taller pointer cannot increase the limiting height, while moving the smaller pointer may find a taller boundary.

## Example

Input:

[1, 8, 6, 2, 5, 4, 8, 3, 7]

Output:

49

## Complexity

- Time Complexity: O(n)
- Space Complexity: O(1)

## Interview Pattern

Two Pointers / Greedy
