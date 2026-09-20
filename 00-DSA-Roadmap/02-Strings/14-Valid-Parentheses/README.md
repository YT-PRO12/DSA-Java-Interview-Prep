# Valid Parentheses

## Problem

Determine whether a string containing parentheses and brackets is valid.

Every opening bracket must have a matching closing bracket in the correct order.

## Approach

Use a Stack.

Push opening brackets onto the stack.

For every closing bracket:

1. Check whether the stack is empty.
2. Pop the most recent opening bracket.
3. Check whether both brackets match.

At the end, the stack must be empty.

## Example

Input:

({[]})

Output:

true

## Complexity

- Time Complexity: O(n)
- Space Complexity: O(n)

## Interview Pattern

Stack / Parentheses Matching
