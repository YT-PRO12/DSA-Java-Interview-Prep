# 1047. Remove All Adjacent Duplicates In String

[Official problem](https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/) · **Easy**

## Intuition

After reducing a prefix, only its final character can match the next incoming character. A stack stores exactly that reduced prefix.

## Approach

Push a different character. Pop when the new character matches the top. Removing a pair can expose another pair later, which the same rule handles without rescanning.

## Dry run

`abbaca`: keep a, push b, cancel bb, cancel aa, then keep c and a. The result is `ca`.

## Complexity

Time: O(n). Auxiliary space: O(n), including the character stack.

## Important edge cases

Complete cancellation; cascading pairs; alternating characters; one character; long repeated runs.

## Java solution and verification

[Solution.java](Solution.java) uses the LeetCode method signature. [Regression suite](../../../tests/cases/sprint-1047.java) checks examples, boundaries, and deterministic generated inputs against an independent reference.

From the repository root, run `python scripts/verify_java.py --new-only`. No online submission or acceptance is claimed.
