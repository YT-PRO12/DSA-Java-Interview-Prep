# Insert at Beginning of a Linked List

## Problem
Insert a new node at the beginning of a singly linked list.

## Approach
1. Create a new node.
2. Point the new node's `next` reference to the current head.
3. Update the head to the new node.

## Example

Before:

10 -> 20 -> 30 -> null

Insert:

5

After:

5 -> 10 -> 20 -> 30 -> null

## Complexity
- Time: O(1)
- Space: O(1)

## Pattern
Linked List Pointer Manipulation
