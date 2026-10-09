# Recursive Palindrome

A runnable foundation exercise; no LeetCode acceptance claim.

**Status:** Newly prepared implementation, verified by the repository regression harness. No online submission acceptance was verified.

## Approach

Compare the two ends, then ask the same question about the interior. This is an exact, case-sensitive comparison of Java UTF-16 code units; it does not normalize punctuation or Unicode grapheme clusters. Large strings are better handled iteratively.

## Complexity

- Time: O(n)
- Auxiliary space: O(n) stack

## Implementation

[RecursivePalindrome.java](RecursivePalindrome.java)

## Run

From this folder with JDK 17 or newer:

```bash
javac RecursivePalindrome.java
java RecursivePalindrome
```
