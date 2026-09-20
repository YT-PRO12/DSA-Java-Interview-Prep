# String to Integer (atoi)

## Problem

Convert a string into a 32-bit signed integer.

Handle leading spaces, optional signs, digits, and integer overflow.

## Approach

1. Skip leading spaces.
2. Detect an optional `+` or `-` sign.
3. Read digits one by one.
4. Build the number using `result = result * 10 + digit`.
5. Clamp overflow to Integer.MIN_VALUE or Integer.MAX_VALUE.

## Example

Input:

"   -42"

Output:

-42

## Complexity

- Time Complexity: O(n)
- Space Complexity: O(1)

## Interview Pattern

String Parsing / Simulation
