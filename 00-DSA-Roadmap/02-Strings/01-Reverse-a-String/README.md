# Reverse a String

## Problem

Given a string, reverse the characters of the string.

## Approach

Convert the string into a character array.

Use two pointers:

- `left` starts from the beginning.
- `right` starts from the end.

Swap the characters at `left` and `right`.

Then:

- Move `left` forward.
- Move `right` backward.

Continue until the two pointers meet.

Finally, convert the character array back into a String.

## Example

Input:

hello

Output:

olleh

## Complexity

- Time Complexity: O(n)
- Space Complexity: O(n) because Java Strings are immutable and we create a character array.

## Interview Pattern

Two Pointers / String Manipulation
