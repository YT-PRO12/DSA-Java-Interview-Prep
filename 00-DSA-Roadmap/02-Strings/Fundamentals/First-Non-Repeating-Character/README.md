# First Non-Repeating Character

## Problem

Given a string, find the first character that occurs exactly once.

## Approach

Use two passes.

First pass:

Store the frequency of every character in a HashMap.

Second pass:

Traverse the original string again.

The first character whose frequency is `1` is the answer.

## Example

Input:

leetcode

Output:

l

## Complexity

- Time Complexity: O(n)
- Space Complexity: O(k)

Where `k` is the number of unique characters.

## Interview Pattern

HashMap / Frequency Counting
