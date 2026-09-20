# Multiply Strings

## Problem

Multiply two non-negative integers represented as strings.

Do not directly convert the complete strings into integers.

## Approach

Simulate the multiplication process used on paper.

For digits at positions `i` and `j`, their multiplication contributes to:

`i + j`

and

`i + j + 1`

Store intermediate values in an integer array of size:

`m + n`

Handle the carry and finally convert the result array into a string.

## Example

num1:

123

num2:

456

Output:

56088

## Complexity

- Time Complexity: O(m * n)
- Space Complexity: O(m + n)

## Interview Pattern

String Simulation / Mathematical Multiplication
