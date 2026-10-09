# Task Scheduler

[LeetCode 621: Task Scheduler](https://leetcode.com/problems/task-scheduler/)

**Status:** Newly prepared implementation, verified by the repository regression harness. No online submission acceptance was verified.

## Approach

In each cycle of n + 1 slots, run the most frequent distinct remaining tasks. Defer their reinsertion until the cycle ends so the same task is not selected twice. Charge a full cycle only if work remains; the final cycle needs no trailing idle slots. Inputs are uppercase A–Z.

## Complexity

- Time: O(T log A), T = tasks and A <= 26 distinct task types; effectively O(T)
- Auxiliary space: O(A), bounded by 26

## Implementation

[Solution.java](Solution.java)
