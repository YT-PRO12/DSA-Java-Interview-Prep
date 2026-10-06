# Decode String

## Problem

Decode an encoded string where:

`k[encoded_string]`

means the string inside the brackets must be repeated `k` times.

## Approach

Use two stacks:

- One stack stores repetition counts.
- One stack stores previous strings.

When `[` appears, save the current state.

When `]` appears, repeat the current string and attach it to the previous string.

This also handles nested expressions.

## Example

Input:

3[a2[c]]

Output:

accaccacc

## Complexity

- Time Complexity: O(output size)
- Space Complexity: O(n)

## Interview Pattern

Stack / Nested String Processing
