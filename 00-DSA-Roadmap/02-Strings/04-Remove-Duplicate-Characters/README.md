# Remove Duplicate Characters

## Problem

Remove duplicate characters from a string while maintaining the original order.

## Approach

Use a HashSet to remember characters already encountered.

Traverse the string.

If a character has not been seen before, add it to the HashSet and append it to the result.

## Example

Input:

programming

Output:

progamin

## Complexity

- Time Complexity: O(n)
- Space Complexity: O(n)

## Interview Pattern

HashSet / String Traversal
