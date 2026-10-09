# Sliding Window

[Roadmap](../README.md) · [Repository guide](../../README.md)

Reuse work as a contiguous range expands and contracts. Covers fixed windows, frequency constraints, and monotonic deques.

## Concepts Covered

- Fixed-size running sums
- Variable-size windows
- Frequency maps and replacement budgets
- Monotonic deque maxima

## Problem Index

| # | LeetCode | Problem | Difficulty | Pattern | Solution |
|---:|---:|---|---|---|---|
| 1 | 3 | [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/) | Medium | See implementation and notes | [Java](0003-Longest-Substring-Without-Repeating-Characters/LongestSubstringWithoutRepeatingCharacters.java) |
| 2 | 76 | [Minimum Window Substring](https://leetcode.com/problems/minimum-window-substring/) | Hard | Sliding Window / Frequency Counting | [Java](0076-Minimum-Window-Substring/MinimumWindowSubstring.java) |
| 3 | 209 | [Minimum Size Subarray Sum](https://leetcode.com/problems/minimum-size-subarray-sum/) | Medium | Positive-sum shrinking window | [Java](0209-Minimum-Size-Subarray-Sum/MinimumSizeSubarraySum.java) |
| 4 | 239 | [Sliding Window Maximum](https://leetcode.com/problems/sliding-window-maximum/) | Hard | Monotonic deque | [Java](0239-Sliding-Window-Maximum/Solution.java) |
| 5 | 424 | [Longest Repeating Character Replacement](https://leetcode.com/problems/longest-repeating-character-replacement/) | Medium | See implementation and notes | [Java](0424-Longest-Repeating-Character-Replacement/LongestRepeatingCharacterReplacement.java) |
| 6 | 438 | [Find All Anagrams in a String](https://leetcode.com/problems/find-all-anagrams-in-a-string/) | Medium | Fixed Sliding Window / Frequency Array | [Java](0438-Find-All-Anagrams-in-a-String/FindAllAnagramsInAString.java) |
| 7 | 567 | [Permutation in String](https://leetcode.com/problems/permutation-in-string/) | Medium | Sliding Window + Frequency Array | [Java](0567-Permutation-in-String/PermutationInString.java) |
| 8 | 643 | [Maximum Average Subarray I](https://leetcode.com/problems/maximum-average-subarray-i/) | Easy | Fixed-size running sum | [Java](0643-Maximum-Average-Subarray-I/MaximumAverageSubarray.java) |
| 9 | 904 | [Fruit Into Baskets](https://leetcode.com/problems/fruit-into-baskets/) | Medium | At-most-two frequency window | [Java](0904-Fruit-Into-Baskets/FruitIntoBaskets.java) |
| 10 | 1004 | [Max Consecutive Ones III](https://leetcode.com/problems/max-consecutive-ones-iii/) | Medium | At-most-k zero window | [Java](1004-Max-Consecutive-Ones-III/MaxConsecutiveOnesIII.java) |

## Fundamentals

| Exercise | Focus | Implementation |
|---|---|---|
| Maximum Sum Subarray | Maximum Sum Subarray | [Java](Fundamentals/Maximum-Sum-Subarray/MaximumSumSubarray.java) |

## Preserved Local Variants

These are original alternatives or runnable demos of an indexed problem. They count as source files, not additional problems.

| LeetCode | Original implementation |
|---:|---|
| 3 | [LongestSubstringWithoutRepeatingCharacters.java](0003-Longest-Substring-Without-Repeating-Characters/examples/strings/LongestSubstringWithoutRepeatingCharacters.java) |
| 239 | [SlidingWindowMaximum.java](0239-Sliding-Window-Maximum/SlidingWindowMaximum.java) |
| 424 | [LongestRepeatingCharacterReplacement.java](0424-Longest-Repeating-Character-Replacement/examples/strings/LongestRepeatingCharacterReplacement.java) |

## Learning Progression

1. Fixed windows
2. Positive-sum windows
3. Frequency constraints
4. Monotonic deque

## Interview Essentials

- Write the validity condition before choosing when to shrink.
- For minimum-size sum windows, the existing algorithm assumes positive numbers.
- Store indices in a deque so expired elements can be removed.
- O(n) window scans rely on each boundary moving only forward.

## Learning Outcomes

Choose a fixed or variable window, maintain its state, and justify the amortized bound.

## Related Practice

- [560. Subarray Sum Equals K](../05-Hashing-and-Prefix-Sum/0560-Subarray-Sum-Equals-K)
- [739. Daily Temperatures](../12-Stacks-and-Queues/0739-Daily-Temperatures)
- [84. Largest Rectangle in Histogram](../12-Stacks-and-Queues/0084-Largest-Rectangle-in-Histogram)

Counts reflect files in this repository, not verified LeetCode acceptances. See the [validation report](../../docs/VALIDATION.md) for the verification scope.
