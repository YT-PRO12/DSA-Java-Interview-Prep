# Remove Outer Parentheses

## Problem

Given a valid parentheses string, remove the outermost parentheses from every primitive part.

## Approach

Maintain a `depth` counter.

For `(`:

- Append it only when depth is already greater than 0.
- Then increase depth.

For `)`:

- First decrease depth.
- Append it only if depth remains greater than 0.

This automatically removes the outermost pair of every primitive group.

## Example

Input:

(()())(())

Output:

()()()

## Complexity

- Time Complexity: O(n)
- Space Complexity: O(n) for the result

## Interview Pattern

String Traversal / Parentheses Depth
