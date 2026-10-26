# 2390. Removing Stars From a String

[Official problem](https://leetcode.com/problems/removing-stars-from-a-string/) · **Medium**

## Intuition

The nearest surviving letter to the left is always the latest letter kept. A stack makes removal constant time.

## Approach

Write letters into a result buffer. For a star, reduce the used length by one. The official contract guarantees that a letter is available whenever a star is processed.

## Dry run

`leet**cod*e`: keep leet, remove t and e, append cod, remove d, append e. The result is `lecoe`.

## Complexity

Time: O(n). Auxiliary space: O(n).

## Important edge cases

Consecutive stars; all letters removed; no stars; long inputs. Invalid star prefixes are outside the official contract.

## Java solution and verification

[Solution.java](Solution.java) uses the LeetCode method signature. [Regression suite](../../../tests/cases/sprint-2390.java) checks examples, boundaries, and deterministic generated inputs against an independent reference.

From the repository root, run `python scripts/verify_java.py --new-only`. No online submission or acceptance is claimed.
