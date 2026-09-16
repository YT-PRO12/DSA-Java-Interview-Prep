# Rotate Matrix

## Problem

Given an `n x n` matrix, rotate the matrix 90 degrees clockwise.

The rotation must be performed in-place.

## Approach

Use two steps:

### Step 1: Transpose the matrix

Convert rows into columns by swapping:

`matrix[i][j]` with `matrix[j][i]`

### Step 2: Reverse every row

After transposing, reverse each row.

These two operations together rotate the matrix 90 degrees clockwise.

## Example

Input:

[1, 2, 3]
[4, 5, 6]
[7, 8, 9]

Output:

[7, 4, 1]
[8, 5, 2]
[9, 6, 3]

## Complexity

- Time Complexity: O(n²)
- Space Complexity: O(1)

## Interview Pattern

Matrix / Transpose + Reverse
