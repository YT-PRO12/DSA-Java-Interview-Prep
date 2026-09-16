# Maximum Consecutive Ones

## Problem

Given a binary array, find the maximum number of consecutive `1`s.

## Approach

Maintain two variables:

- `count` ? current consecutive number of `1`s.
- `maxCount` ? maximum consecutive `1`s found so far.

When we encounter `1`, increase `count`.

When we encounter `0`, reset `count` to `0`.

Update `maxCount` whenever a longer sequence is found.

## Example

Input:

[1, 1, 0, 1, 1, 1, 0, 1]

Output:

3

## Complexity

- Time Complexity: O(n)
- Space Complexity: O(1)

## Interview Pattern

Array Traversal / Counting
