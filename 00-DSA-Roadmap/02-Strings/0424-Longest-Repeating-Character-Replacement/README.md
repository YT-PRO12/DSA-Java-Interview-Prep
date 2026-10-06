# Longest Repeating Character Replacement

## Problem

Find the length of the longest substring that can contain the same character after replacing at most `k` characters.

## Approach

Use Sliding Window and a frequency array.

Maintain the frequency of characters inside the current window.

`maxFrequency` is the frequency of the most common character.

Characters that must be replaced:

`window length - maxFrequency`

If this becomes greater than `k`, shrink the window from the left.

## Example

Input:

AABABBA

k = 1

Output:

4

## Complexity

- Time Complexity: O(n)
- Space Complexity: O(1)

## Interview Pattern

Sliding Window + Frequency Array
