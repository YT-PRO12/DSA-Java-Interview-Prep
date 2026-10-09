# Merge k Sorted Lists

[LeetCode 23: Merge k Sorted Lists](https://leetcode.com/problems/merge-k-sorted-lists/)

**Status:** Newly prepared implementation, verified by the repository regression harness. No online submission acceptance was verified.

## Approach

Keep one frontier node from each nonempty sorted list. Extract the smallest node, append it, and expose its successor. Input nodes are reused and rewired; lists must be disjoint and acyclic as in the problem. LeetCode supplies ListNode.

## Complexity

- Time: O(k + N log(k + 1)), N = total nodes and k = number of lists
- Auxiliary space: O(k) heap; output reuses existing nodes

## Implementation

[Solution.java](Solution.java)
