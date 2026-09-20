# Word Pattern

## Problem

Determine whether a sentence follows a given character pattern.

## Approach

Use two HashMaps to maintain a one-to-one relationship:

- Character -> Word
- Word -> Character

If either mapping becomes inconsistent, return false.

## Example

Pattern:

abba

String:

dog cat cat dog

Output:

true

## Complexity

- Time Complexity: O(n)
- Space Complexity: O(n)

## Interview Pattern

HashMap / Bidirectional Mapping
