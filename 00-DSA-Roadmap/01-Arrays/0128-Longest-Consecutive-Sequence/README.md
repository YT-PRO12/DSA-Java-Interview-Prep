# Longest Consecutive Sequence

## Problem

Given an unsorted array of integers, find the length of the longest consecutive elements sequence.

The elements in the sequence must be consecutive integers.

## Approach

Store all elements in a `HashSet` for O(1) average-time lookup.

For every number, check whether `num - 1` exists.

If it does not exist, the current number is the start of a consecutive sequence.

Then keep checking `num + 1`, `num + 2`, and so on.

Track the longest sequence found.

## Example

Input:

[100, 4, 200, 1, 3, 2]

Output:

4

Longest consecutive sequence:

[1, 2, 3, 4]

## Complexity

- Time Complexity: O(n) average
- Space Complexity: O(n)

## Interview Pattern

HashSet / Consecutive Sequence
