# Longest Consecutive Sequence

## Problem Statement

Given an unsorted integer array, find the length of the longest sequence of consecutive integers.

The elements do not need to be adjacent in the original array.

## Example

Input:

`[100, 4, 200, 1, 3, 2]`

Output:

`4`

The longest consecutive sequence is:

`1, 2, 3, 4`

## Brute Force Approach

For every element, repeatedly search for the next consecutive number.

This can take O(n²) time.

## Optimized Approach

Use a `HashSet`.

First, insert every element into the HashSet.

Then for every number:

1. Check if `num - 1` exists.
2. If it does not exist, the number is the beginning of a sequence.
3. Keep checking `num + 1`.
4. Track the longest sequence.

## Java Implementation

See `LongestConsecutiveSequence.java`.

## Complexity

- Time: O(n) average
- Space: O(n)

## Key Learning

Use HashSet when you need fast existence checks without needing key-value pairs.
