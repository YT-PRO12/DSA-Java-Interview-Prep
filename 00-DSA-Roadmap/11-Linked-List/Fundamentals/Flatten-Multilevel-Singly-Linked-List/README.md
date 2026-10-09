# Flatten Multilevel Linked List

## Problem
Flatten a linked list containing child linked lists into a single-level linked list.

## Approach
Whenever a child list is found, recursively flatten it and insert it between the current node and its original next node.

## Complexity
- Time: O(n²) worst case because repeated tail scans revisit nested child chains
- Space: O(d) recursion depth

## Pattern
Linked List + Recursion

## Contract note

This exercise has next and child pointers, with no prev pointer. LeetCode 430 requires a doubly linked list and repairs prev links, so this singly linked exercise is cataloged as a fundamental.
