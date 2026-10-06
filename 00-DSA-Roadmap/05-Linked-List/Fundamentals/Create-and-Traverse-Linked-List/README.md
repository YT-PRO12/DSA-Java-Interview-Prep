# Create and Traverse a Linked List

## Problem
Create a singly linked list and traverse all nodes from the head to the end.

## Approach
Each node contains:
- Data
- A reference to the next node

The head stores the reference to the first node.

For traversal, start a temporary pointer at the head and repeatedly move it to `next` until it becomes `null`.

## Example

Input list:

10 -> 20 -> 30 -> null

Output:

10 -> 20 -> 30 -> null

## Complexity
- Time: O(n)
- Space: O(1)

## Pattern
Linked List Traversal
