# Valid Anagram

## Problem

Determine whether two lowercase English strings are anagrams.

## Approach

Use an integer frequency array of size 26.

For every position:

- Increase the frequency for the character from the first string.
- Decrease the frequency for the character from the second string.

If every frequency becomes zero, both strings contain exactly the same characters.

## Example

anagram
nagaram

Output:

true

## Complexity

- Time Complexity: O(n)
- Space Complexity: O(1)

## Interview Pattern

Frequency Array / String
