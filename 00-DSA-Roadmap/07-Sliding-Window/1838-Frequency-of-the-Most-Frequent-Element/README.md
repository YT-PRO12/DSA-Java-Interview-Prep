# 1838. Frequency of the Most Frequent Element

[Official problem](https://leetcode.com/problems/frequency-of-the-most-frequent-element/) · **Medium**

## Intuition

Only increments are allowed. After sorting, raising a group to its largest value costs target × count minus the current sum.

## Approach

Sort a copy, expand the right edge, and shrink the left edge while the cost exceeds k. Track the longest affordable window. Use long arithmetic because the product can exceed a 32-bit integer.

## Dry run

For `[1,2,4]` and k=5, raising the entire group to 4 costs 4×3−7=5, so the answer is 3.

## Complexity

Time: O(n log n) for sorting plus O(n) scanning. Auxiliary space: O(n) because the input is copied.

## Important edge cases

Duplicates; insufficient budget; exactly sufficient budget; large products; original array preserved.

## Java solution and verification

[Solution.java](Solution.java) uses the LeetCode method signature. [Regression suite](../../../tests/cases/sprint-1838.java) checks examples, boundaries, and deterministic generated inputs against an independent reference.

From the repository root, run `python scripts/verify_java.py --new-only`. No online submission or acceptance is claimed.
