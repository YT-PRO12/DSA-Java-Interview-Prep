# Find All Anagrams in a String

## Problem

Find all starting indices where an anagram of `p` occurs inside `s`.

## Approach

Use a fixed-size Sliding Window of length `p.length()`.

Maintain:

- Frequency array for `p`
- Frequency array for the current window

Whenever both arrays are equal, the current window is an anagram.

Store its starting index.

## Example

s = cbaebabacd
p = abc

Output:

[0, 6]

## Complexity

- Time Complexity: O(26 * n), effectively O(n)
- Space Complexity: O(1)

## Interview Pattern

Fixed Sliding Window / Frequency Array
