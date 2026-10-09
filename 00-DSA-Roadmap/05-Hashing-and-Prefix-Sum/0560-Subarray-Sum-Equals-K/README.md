# Subarray Sum Equals K

## Problem

Given an integer array and an integer `k`, find the total number of continuous subarrays whose sum equals `k`.

## Approach

Use prefix sum and a HashMap.

For every position:

`prefixSum = sum of elements from the beginning to current position`

We need an earlier prefix sum equal to:

`prefixSum - k`

If it exists, the elements between that earlier position and the current position form a subarray with sum `k`.

The map stores:

- prefix sum
- frequency of that prefix sum

Initialize the map with:

`0 -> 1`

This handles subarrays that start from index `0`.

## Example

Input:

[1, 2, 3]

k = 3

Valid subarrays:

[1, 2]

[3]

Output:

2

## Complexity

- Time Complexity: O(n)
- Space Complexity: O(n)

## Interview Pattern

Prefix Sum + HashMap
