# Sudoku Solver

[LeetCode 37: Sudoku Solver](https://leetcode.com/problems/sudoku-solver/)

**Status:** Newly prepared implementation, verified by the repository regression harness. No online submission acceptance was verified.

## Approach

Search empty cells in row-major order. A candidate must be absent from its row, column, and 3×3 box. Keep a successful assignment, but restore a failed one. The official input is a valid 9×9 puzzle with one solution; this is not a general malformed-board validator.

## Complexity

- Time: O(9^E) conservative bound for E empty cells on a fixed 9×9 board
- Auxiliary space: O(E) recursion stack; board modified in place

## Implementation

[Solution.java](Solution.java)
