# Strings

[Roadmap](../README.md) · [Repository guide](../../README.md)

Build reliable character processing, parsing, and string construction skills. Specialized hashing, window, and stack problems have canonical homes elsewhere.

## Concepts Covered

- Character versus index return values
- StringBuilder and immutable strings
- Parsing and carry propagation
- Center expansion and compression

## Problem Index

| # | LeetCode | Problem | Difficulty | Pattern | Solution |
|---:|---:|---|---|---|---|
| 1 | 5 | [Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring/) | Medium | Two Pointers / Expand Around Center | [Java](0005-Longest-Palindromic-Substring/LongestPalindromicSubstring.java) |
| 2 | 8 | [String to Integer (atoi)](https://leetcode.com/problems/string-to-integer-atoi/) | Medium | String Parsing / Simulation | [Java](0008-String-to-Integer-atoi/StringToIntegerAtoi.java) |
| 3 | 14 | [Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix/) | Easy | String Traversal / Prefix Matching | [Java](0014-Longest-Common-Prefix/LongestCommonPrefix.java) |
| 4 | 28 | [Find the Index of the First Occurrence in a String](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/) | Easy | String Matching / Two Pointers | [Java](0028-Find-the-Index-of-the-First-Occurrence-in-a-String/ImplementStrStr.java) |
| 5 | 43 | [Multiply Strings](https://leetcode.com/problems/multiply-strings/) | Medium | String Simulation / Mathematical Multiplication | [Java](0043-Multiply-Strings/MultiplyStrings.java) |
| 6 | 165 | [Compare Version Numbers](https://leetcode.com/problems/compare-version-numbers/) | Medium | String Parsing / Simulation | [Java](0165-Compare-Version-Numbers/CompareVersionNumbers.java) |
| 7 | 415 | [Add Strings](https://leetcode.com/problems/add-strings/) | Easy | Two Pointers / Carry / String Simulation | [Java](0415-Add-Strings/AddStrings.java) |
| 8 | 443 | [String Compression](https://leetcode.com/problems/string-compression/) | Medium | Two Pointers / In-Place String Modification | [Java](0443-String-Compression/StringCompression.java) |
| 9 | 1021 | [Remove Outermost Parentheses](https://leetcode.com/problems/remove-outermost-parentheses/) | Easy | String Traversal / Parentheses Depth | [Java](1021-Remove-Outermost-Parentheses/RemoveOuterParentheses.java) |

## Fundamentals

| Exercise | Focus | Implementation |
|---|---|---|
| [Check Anagram](Fundamentals/Check-Anagram/README.md) | Sorting / String | [Java](Fundamentals/Check-Anagram/CheckAnagram.java) |
| [Check Palindrome](Fundamentals/Check-Palindrome/README.md) | Two Pointers / String | [Java](Fundamentals/Check-Palindrome/CheckPalindrome.java) |
| [Count Character Frequency](Fundamentals/Count-Character-Frequency/README.md) | HashMap / Frequency Counting | [Java](Fundamentals/Count-Character-Frequency/CountCharacterFrequency.java) |
| [Count Vowels and Consonants](Fundamentals/Count-Vowels-and-Consonants/README.md) | String Traversal / Character Processing | [Java](Fundamentals/Count-Vowels-and-Consonants/CountVowelsAndConsonants.java) |
| [First Non Repeating Character](Fundamentals/First-Non-Repeating-Character/README.md) | HashMap / Frequency Counting | [Java](Fundamentals/First-Non-Repeating-Character/FirstNonRepeatingCharacter.java) |
| [Remove Duplicate Characters](Fundamentals/Remove-Duplicate-Characters/README.md) | HashSet / String Traversal | [Java](Fundamentals/Remove-Duplicate-Characters/RemoveDuplicateCharacters.java) |
| [Reverse String Copy](Fundamentals/Reverse-String-Copy/README.md) | Two Pointers / String Manipulation | [Java](Fundamentals/Reverse-String-Copy/ReverseAString.java) |

## Learning Progression

1. Character scans
2. String construction
3. Parsing
4. Substring reasoning

## Interview Essentials

- State the alphabet assumption: several examples use fixed ASCII or lowercase frequency arrays.
- Java char represents a UTF-16 code unit, not every possible Unicode character.
- Repeated String concatenation can hide copying costs; use StringBuilder for accumulation.
- A standalone demo may need a class/method adapter before submission.

## Learning Outcomes

Implement string operations with clear contracts and recognize when hashing, pointers, or a window is the better pattern.

## Related Practice

- [3. Longest Substring Without Repeating Characters](../07-Sliding-Window/0003-Longest-Substring-Without-Repeating-Characters)
- [20. Valid Parentheses](../12-Stacks-and-Queues/0020-Valid-Parentheses)
- [49. Group Anagrams](../05-Hashing-and-Prefix-Sum/0049-Group-Anagrams)
- [76. Minimum Window Substring](../07-Sliding-Window/0076-Minimum-Window-Substring)
- [394. Decode String](../12-Stacks-and-Queues/0394-Decode-String)

Counts reflect files in this repository, not verified LeetCode acceptances. See the [validation report](../../docs/VALIDATION.md) for the verification scope.
