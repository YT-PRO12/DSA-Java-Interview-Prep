# 1019. Next Greater Node In Linked List

[Official problem](https://leetcode.com/problems/next-greater-node-in-linked-list/) · **Medium**

## Intuition

Keep unresolved positions in decreasing value order. A larger value resolves every smaller waiting position before it.

## Approach

Copy node values into indexed storage without modifying the list. Scan left to right, assigning the current value to popped indices. Leave unresolved answers at zero. Equal values remain waiting because the comparison is strict.

## Dry run

For 2 → 1 → 5, indices 0 and 1 wait on the stack. At 5 both are resolved; the final node has no successor answer, yielding `[5,5,0]`.

## Complexity

Time: O(n), since each index is pushed and popped at most once. Auxiliary space: O(n).

## Important edge cases

Equal values are not greater; increasing or decreasing lists; a single node; repeated values; original links remain unchanged.

## Java solution and verification

[Solution.java](Solution.java) uses the LeetCode method signature. LeetCode supplies `ListNode`; the local verifier provides a test-only equivalent. [Regression suite](../../../tests/cases/sprint-1019.java) checks examples, boundaries, and deterministic generated inputs against an independent reference.

From the repository root, run `python scripts/verify_java.py --new-only`. No online submission or acceptance is claimed.
