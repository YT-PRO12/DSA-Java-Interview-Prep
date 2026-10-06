# Minimum Window Substring

## Problem

Find the smallest substring of `s` containing every character of `t`, including duplicate characters.

## Approach

Use a variable-size Sliding Window.

Store required character frequencies.

Expand `right` until the window contains all required characters.

When all characters are present, move `left` forward to make the window as small as possible.

Keep track of the smallest valid window.

## Example

s = ADOBECODEBANC
t = ABC

Output:

BANC

## Complexity

- Time Complexity: O(n + m)
- Space Complexity: O(1) for the fixed ASCII frequency array

## Interview Pattern

Sliding Window / Frequency Counting
