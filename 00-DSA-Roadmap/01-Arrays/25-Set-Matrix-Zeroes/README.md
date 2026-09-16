# Set Matrix Zeroes

## Problem

Given an `m x n` matrix, if an element is `0`, set its entire row and column to `0`.

The operation should be performed in-place.

## Approach

Use the first row and first column as markers.

When a zero is found at `matrix[i][j]`:

- Mark `matrix[i][0]` as zero.
- Mark `matrix[0][j]` as zero.

Then use these markers to set the required rows and columns to zero.

Separate boolean variables are used to remember whether the original first row or first column contained a zero.

## Example

Input:

[1, 1, 1]
[1, 0, 1]
[1, 1, 1]

Output:

[1, 0, 1]
[0, 0, 0]
[1, 0, 1]

## Complexity

- Time Complexity: O(m × n)
- Space Complexity: O(1)

## Interview Pattern

Matrix / In-Place Modification
