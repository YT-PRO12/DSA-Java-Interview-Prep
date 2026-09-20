# Check Palindrome

## Problem

Given a string, determine whether it reads the same from left to right and right to left.

## Approach

Use two pointers:

- `left` starts at the beginning.
- `right` starts at the end.

Compare the characters at both pointers.

If they are different, return `false`.

Otherwise, move both pointers toward the center.

If all characters match, return `true`.

## Example

Input:

madam

Output:

true

## Complexity

- Time Complexity: O(n)
- Space Complexity: O(1)

## Interview Pattern

Two Pointers / String
