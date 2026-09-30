# Rotate Linked List

## Problem
Rotate a linked list to the right by k positions.

## Approach
Find the length, connect the tail to the head to form a cycle, locate the new tail and break the cycle.

## Complexity
- Time: O(n)
- Space: O(1)

## Pattern
Circular Linking + Pointer Manipulation
