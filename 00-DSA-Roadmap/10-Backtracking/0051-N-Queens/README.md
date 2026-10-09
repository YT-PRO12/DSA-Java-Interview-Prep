# N-Queens

[LeetCode 51: N-Queens](https://leetcode.com/problems/n-queens/)

**Status:** Newly prepared implementation, verified by the repository regression harness. No online submission acceptance was verified.

## Approach

Place one queen in each row. Column and diagonal masks reject attacked squares in constant time; undo every mark before trying the next column. The official range has n >= 1.

## Complexity

- Time: O(n × n! + Q × n²) upper bound, Q = number of returned boards
- Auxiliary space: O(n²) working board plus O(n) stack/flags; O(Q × n²) output

## Implementation

[Solution.java](Solution.java)
