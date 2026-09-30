# Flatten Multilevel Linked List

## Problem
Flatten a linked list containing child linked lists into a single-level linked list.

## Approach
Whenever a child list is found, recursively flatten it and insert it between the current node and its original next node.

## Complexity
- Time: O(n) for traversal, with tail scans in this implementation
- Space: O(d) recursion depth

## Pattern
Linked List + Recursion
