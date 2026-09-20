# Longest Substring Without Repeating Characters

## Problem

Find the length of the longest substring without repeating characters.

## Approach

Use Sliding Window with a HashSet.

Expand the window using `right`.

If the current character already exists, remove characters from the left until the duplicate disappears.

Window length:

`right - left + 1`

Track the maximum length.

## Example

Input:

abcabcbb

Output:

3

The substring `abc` has length 3.

## Complexity

- Time Complexity: O(n)
- Space Complexity: O(k)

## Interview Pattern

Sliding Window + HashSet
