# Implement strStr

## Problem

Find the index of the first occurrence of `needle` inside `haystack`.

Return `-1` if the substring does not exist.

## Approach

Try every possible starting position in the main string.

For each position, compare the characters of `needle`.

If every character matches, return the starting index.

## Example

Haystack:

sadbutsad

Needle:

sad

Output:

0

## Complexity

- Time Complexity: O(n * m)
- Space Complexity: O(1)

## Interview Pattern

String Matching / Two Pointers
