# Find Start of Cycle

## Problem
Find the node where a cycle begins in a singly linked list.

## Approach
Use Floyd's slow and fast pointers to detect a cycle. After they meet, move one pointer to the head and advance both one step at a time until they meet again.

## Complexity
- Time: O(n)
- Space: O(1)

## Pattern
Floyd's Cycle Detection
