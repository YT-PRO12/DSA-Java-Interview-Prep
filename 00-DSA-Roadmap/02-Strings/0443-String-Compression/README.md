# String Compression

## Problem

Compress consecutive repeating characters in-place.

For a repeated group, store the character followed by its count.

## Approach

Use two pointers:

- `read` scans groups of equal characters.
- `write` stores the compressed result.

Find the size of each consecutive group.

Write the character first.

If its count is greater than 1, write each digit of the count.

## Example

Input:

[a,a,b,b,c,c,c]

Output:

a2b2c3

New Length:

6

## Complexity

- Time Complexity: O(n)
- Space Complexity: O(1) auxiliary space

## Interview Pattern

Two Pointers / In-Place String Modification
