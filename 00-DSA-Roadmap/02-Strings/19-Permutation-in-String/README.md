# Permutation in String

## Problem

Determine whether one string contains a permutation of another string.

## Approach

Use a fixed-size Sliding Window.

Create two frequency arrays:

- Required frequencies from `s1`.
- Frequencies inside the current window of `s2`.

The window size must equal the length of `s1`.

If both frequency arrays become equal, a permutation exists.

## Example

s1:

ab

s2:

eidbaooo

Output:

true

Because `ba` is a permutation of `ab`.

## Complexity

- Time Complexity: O(n)
- Space Complexity: O(1)

## Interview Pattern

Sliding Window + Frequency Array
