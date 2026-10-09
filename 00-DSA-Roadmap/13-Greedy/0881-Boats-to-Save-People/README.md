# Boats to Save People

[LeetCode 881: Boats to Save People](https://leetcode.com/problems/boats-to-save-people/)

**Status:** Newly prepared implementation, verified by the repository regression harness. No online submission acceptance was verified.

## Approach

The heaviest remaining person must leave on some boat. If the lightest cannot fit, nobody can share it; otherwise pairing these two admits an optimal completion by an exchange argument. Each boat holds at most two people and each person fits alone under the official contract. Sorts input in place.

## Complexity

- Time: O(n log n)
- Auxiliary space: O(log n) sorting stack for Java primitive-array sort

## Implementation

[Solution.java](Solution.java)
