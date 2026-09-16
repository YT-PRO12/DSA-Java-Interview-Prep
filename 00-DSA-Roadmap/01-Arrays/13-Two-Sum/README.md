# Two Sum

## Problem

Given an array of integers and a target value, find the indices of two numbers whose sum equals the target.

## Approach

Use a `HashMap` to store each number and its index.

For every element, calculate:

`complement = target - current element`

If the complement already exists in the map, the two required indices have been found.

Otherwise, store the current number and its index.

## Example

Input:

[2, 7, 11, 15]

Target:
9

Output:

[0, 1]

Because:

2 + 7 = 9

## Complexity

- Time Complexity: O(n)
- Space Complexity: O(n)

## Interview Pattern

HashMap / Complement Technique
