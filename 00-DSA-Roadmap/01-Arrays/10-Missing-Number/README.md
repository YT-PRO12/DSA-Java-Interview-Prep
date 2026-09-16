# Missing Number

## Problem

Given an array containing `n` distinct numbers taken from the range `0` to `n`, find the one number that is missing.

## Approach

The sum of numbers from `0` to `n` is:

`n * (n + 1) / 2`

Calculate the expected sum and subtract the actual sum of the array.

The difference is the missing number.

## Example

Input:

[3, 0, 1]

Output:

2

## Complexity

- Time Complexity: O(n)
- Space Complexity: O(1)

## Interview Pattern

Array / Mathematical Approach
