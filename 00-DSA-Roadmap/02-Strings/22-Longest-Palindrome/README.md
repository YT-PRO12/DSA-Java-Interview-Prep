# Longest Palindrome

## Problem

Given a string, find the length of the longest palindrome that can be built using its characters.

## Approach

Count the frequency of every character.

Every pair of equal characters can be placed symmetrically in the palindrome.

For each frequency, use the largest even portion:

`(count / 2) * 2`

If at least one character has an odd frequency, one extra character can be placed in the center.

## Example

Input:

abccccdd

Output:

7

## Complexity

- Time Complexity: O(n)
- Space Complexity: O(1)

## Interview Pattern

Frequency Counting / Greedy
