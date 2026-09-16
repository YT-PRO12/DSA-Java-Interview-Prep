# Kadane's Maximum Subarray

## Problem

Given an integer array, find the contiguous subarray with the largest sum.

Return the maximum sum.

## Approach

Use Kadane's Algorithm.

Maintain:

- `currentSum` ? maximum sum of a subarray ending at the current position.
- `maxSum` ? maximum sum found so far.

At each element, choose between:

- Starting a new subarray from the current element.
- Extending the existing subarray.

Formula:

`currentSum = max(arr[i], currentSum + arr[i])`

Then update `maxSum`.

## Example

Input:

[-2, 1, -3, 4, -1, 2, 1, -5, 4]

Output:

6

The maximum-sum subarray is:

[4, -1, 2, 1]

## Complexity

- Time Complexity: O(n)
- Space Complexity: O(1)

## Interview Pattern

Kadane's Algorithm / Dynamic Programming
