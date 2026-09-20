# Longest Common Prefix

## Problem

Find the longest common prefix among an array of strings.

## Approach

Take the first string as the initial prefix.

Compare it with every other string.

While a string does not start with the prefix, remove the last character from the prefix.

## Example

Input:

["flower", "flow", "flight"]

Output:

fl

## Complexity

- Time Complexity: O(n * m)
- Space Complexity: O(1)

## Interview Pattern

String Traversal / Prefix Matching
