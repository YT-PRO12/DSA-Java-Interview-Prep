# Reorder Linked List

## Problem
Reorder a linked list from L0 -> L1 -> ... -> Ln into L0 -> Ln -> L1 -> Ln-1.

## Approach
Find the middle, reverse the second half and merge both halves alternately.

## Complexity
- Time: O(n)
- Space: O(1)

## Pattern
Slow/Fast Pointers + Reversal + Merge
