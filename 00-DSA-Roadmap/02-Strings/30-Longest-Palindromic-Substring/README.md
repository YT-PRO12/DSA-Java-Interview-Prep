# Longest Palindromic Substring

## Problem

Find the longest substring that is a palindrome.

## Approach

Use Expand Around Center.

Every palindrome has a center.

There are two possibilities:

1. Odd-length palindrome: center is one character.
2. Even-length palindrome: center is between two characters.

For every index, expand in both ways while the left and right characters are equal.

Track the longest palindrome found.

## Example

Input:

babad

Possible Output:

bab

`aba` is also a valid answer.

## Complexity

- Time Complexity: O(n^2)
- Space Complexity: O(1)

## Interview Pattern

Two Pointers / Expand Around Center
