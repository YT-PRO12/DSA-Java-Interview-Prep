# 1456. Maximum Number of Vowels in a Substring of Given Length

[Official problem](https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/) · **Medium**

## Intuition

Adjacent length-k substrings differ by only one entering and one leaving character. Maintain the vowel count instead of recounting each substring.

## Approach

Scan the string, adding an entering vowel and subtracting the character k positions behind. Update the maximum only once a complete length-k window exists. The contract uses lowercase English letters.

## Dry run

For `baeco` and k = 3, the window counts are 2, 2 and 2, so the answer is 2.

## Complexity

O(n) time and O(1) auxiliary space; no substring copies are created.

## Important edge cases

k = 1; k equals the string length; all vowels; no vowels; the optimum at the first or final window.

## Java solution and verification

[Solution.java](Solution.java) follows the LeetCode method signature. The [regression suite](../../../tests/cases/sprint-2026-10-28-1456.java) compares deterministic random inputs with an independent exhaustive reference and covers large inputs.

Run `python scripts/verify_java.py --new-only` from the repository root with JDK 17 or newer. No online acceptance is claimed.
