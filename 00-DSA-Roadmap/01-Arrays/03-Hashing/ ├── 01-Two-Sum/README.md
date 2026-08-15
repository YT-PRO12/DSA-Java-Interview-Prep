# Two Sum

## Problem Statement

Given an integer array `nums` and an integer `target`, find the indices of two elements whose sum is equal to the target.

Assume that exactly one valid pair exists.

## Example

Input:
`nums = [2, 7, 11, 15]`
`target = 9`

Output:
`[0, 1]`

Because:

`2 + 7 = 9`

## Brute Force Approach

Check every possible pair using two nested loops.

### Complexity

- Time: O(n²)
- Space: O(1)

## Optimized Approach

Use a `HashMap`.

For every element:

1. Calculate `target - currentElement`.
2. Check whether the complement already exists in the map.
3. If it exists, return both indices.
4. Otherwise, store the current element and its index.

## Java Implementation

See `TwoSum.java`.

## Complexity

- Time: O(n) average
- Space: O(n)

## Key Learning

Use a HashMap when you need fast lookup of previously seen values.
