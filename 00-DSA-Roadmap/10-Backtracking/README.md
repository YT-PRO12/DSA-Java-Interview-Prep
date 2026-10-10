# Backtracking

[Roadmap](../README.md) · [Repository guide](../../README.md)

Explore decision trees while restoring mutable state. The curated set covers subset, permutation, reuse, board-placement, and grid constraints.

## Concepts Covered

- Choose, explore, undo
- Path copying and used-index tracking
- Duplicate avoidance through index order
- Pruning with columns, diagonals, rows and boxes

## Problem Index

| # | LeetCode | Problem | Difficulty | Pattern | Solution |
|---:|---:|---|---|---|---|
| 1 | 37 | [Sudoku Solver](https://leetcode.com/problems/sudoku-solver/) | Hard | Grid search and pruning | [Java](0037-Sudoku-Solver/Solution.java) |
| 2 | 39 | [Combination Sum](https://leetcode.com/problems/combination-sum/) | Medium | Reuse choices with pruning | [Java](0039-Combination-Sum/Solution.java) |
| 3 | 46 | [Permutations](https://leetcode.com/problems/permutations/) | Medium | Used-index decisions | [Java](0046-Permutations/Solution.java) |
| 4 | 51 | [N-Queens](https://leetcode.com/problems/n-queens/) | Hard | Constraint tracking | [Java](0051-N-Queens/Solution.java) |
| 5 | 78 | [Subsets](https://leetcode.com/problems/subsets/) | Medium | Choose, explore, undo | [Java](0078-Subsets/Solution.java) |

## Learning Progression

1. Subsets
2. Permutations and combinations
3. N-Queens constraints
4. Sudoku grid search

## Interview Essentials

- Copy a path when adding it to the answer; do not store the same mutable list repeatedly.
- Subsets advance the start index; Combination Sum deliberately reuses it.
- Undo all state changes on a failed branch.
- Pruning removes impossible branches; it does not make worst-case search polynomial.

## Learning Outcomes

Model the decision, legal choices, state restoration, and stopping condition for a constrained search.

## Related Practice

- [22. Generate Parentheses](../09-Recursion/0022-Generate-Parentheses)
- [50. Pow(x, n)](../09-Recursion/0050-Pow-x-n)

Counts reflect files in this repository, not verified LeetCode acceptances. See the [validation report](../../docs/VALIDATION.md) for the verification scope.

## Additional Curated Practice

| LeetCode | Problem | Difficulty | Pattern | Java |
|---:|---|---|---|---|
| 40 | [Combination Sum II](https://leetcode.com/problems/combination-sum-ii/) | Medium | Duplicate-aware branching | [Solution](0040-Combination-Sum-II/Solution.java) |
| 47 | [Permutations II](https://leetcode.com/problems/permutations-ii/) | Medium | Unique permutations | [Solution](0047-Permutations-II/Solution.java) |
| 90 | [Subsets II](https://leetcode.com/problems/subsets-ii/) | Medium | Duplicate-aware subsets | [Solution](0090-Subsets-II/Solution.java) |
| 77 | [Combinations](https://leetcode.com/problems/combinations/) | Medium | Combinatorial pruning | [Solution](0077-Combinations/Solution.java) |
| 79 | [Word Search](https://leetcode.com/problems/word-search/) | Medium | Grid DFS and backtracking | [Solution](0079-Word-Search/Solution.java) |
| 17 | [Letter Combinations of a Phone Number](https://leetcode.com/problems/letter-combinations-of-a-phone-number/) | Medium | Decision tree | [Solution](0017-Letter-Combinations-of-a-Phone-Number/Solution.java) |
| 131 | [Palindrome Partitioning](https://leetcode.com/problems/palindrome-partitioning/) | Medium | Partition recursion | [Solution](0131-Palindrome-Partitioning/Solution.java) |
| 216 | [Combination Sum III](https://leetcode.com/problems/combination-sum-iii/) | Medium | Fixed-length selection | [Solution](0216-Combination-Sum-III/Solution.java) |
