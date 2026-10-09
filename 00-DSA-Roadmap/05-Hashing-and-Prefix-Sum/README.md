# Hashing and Prefix Sum

[Roadmap](../README.md) · [Repository guide](../../README.md)

Turn repeated searches and range calculations into reusable state with maps, sets, and cumulative sums.

## Concepts Covered

- HashSet membership and uniqueness
- HashMap frequency and complement lookup
- Prefix sums and products
- Counting subarrays with repeated prefix values

## Problem Index

| # | LeetCode | Problem | Difficulty | Pattern | Solution |
|---:|---:|---|---|---|---|
| 1 | 1 | [Two Sum](https://leetcode.com/problems/two-sum/) | Easy | HashMap / Complement Technique | [Java](0001-Two-Sum/TwoSum.java) |
| 2 | 49 | [Group Anagrams](https://leetcode.com/problems/group-anagrams/) | Medium | HashMap + Sorting | [Java](0049-Group-Anagrams/GroupAnagrams.java) |
| 3 | 128 | [Longest Consecutive Sequence](https://leetcode.com/problems/longest-consecutive-sequence/) | Medium | HashSet / Consecutive Sequence | [Java](0128-Longest-Consecutive-Sequence/LongestConsecutiveSequence.java) |
| 4 | 205 | [Isomorphic Strings](https://leetcode.com/problems/isomorphic-strings/) | Easy | HashMap / Character Mapping | [Java](0205-Isomorphic-Strings/IsomorphicStrings.java) |
| 5 | 217 | [Contains Duplicate](https://leetcode.com/problems/contains-duplicate/) | Easy | Set membership | [Java](0217-Contains-Duplicate/Solution.java) |
| 6 | 238 | [Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/) | Medium | Prefix Product + Suffix Product | [Java](0238-Product-of-Array-Except-Self/ProductOfArrayExceptSelf.java) |
| 7 | 242 | [Valid Anagram](https://leetcode.com/problems/valid-anagram/) | Easy | Frequency Array / String | [Java](0242-Valid-Anagram/ValidAnagram.java) |
| 8 | 290 | [Word Pattern](https://leetcode.com/problems/word-pattern/) | Easy | HashMap / Bidirectional Mapping | [Java](0290-Word-Pattern/WordPattern.java) |
| 9 | 349 | [Intersection of Two Arrays](https://leetcode.com/problems/intersection-of-two-arrays/) | Easy | Hashing / Set | [Java](0349-Intersection-of-Two-Arrays/IntersectionOfTwoArrays.java) |
| 10 | 560 | [Subarray Sum Equals K](https://leetcode.com/problems/subarray-sum-equals-k/) | Medium | Prefix Sum + HashMap | [Java](0560-Subarray-Sum-Equals-K/SubarraySumEqualsK.java) |

## Fundamentals

| Exercise | Focus | Implementation |
|---|---|---|
| [Prefix Sums](Fundamentals/Prefix-Sums/README.md) | Prefix Sums | [Java](Fundamentals/Prefix-Sums/PrefixSums.java) |

## Learning Progression

1. Set lookup
2. Frequency and mapping
3. Prefix preprocessing
4. Prefix frequency counting

## Interview Essentials

- Hash operations are expected constant time, not an unconditional worst-case guarantee.
- Initialize the zero prefix count before processing subarrays.
- A frequency map counts repeated prefixes; a set loses their multiplicity.
- A standard shrinking sum window does not work for arbitrary negative values.

## Learning Outcomes

Replace repeated scans with lookups, choose set versus map correctly, and derive a range or subarray equation.

## Related Practice

- [3. Longest Substring Without Repeating Characters](../07-Sliding-Window/0003-Longest-Substring-Without-Repeating-Characters)
- [209. Minimum Size Subarray Sum](../07-Sliding-Window/0209-Minimum-Size-Subarray-Sum)
- [215. Kth Largest Element in an Array](../14-Heaps-and-Priority-Queues/0215-Kth-Largest-Element-in-an-Array)

Counts reflect files in this repository, not verified LeetCode acceptances. See the [validation report](../../docs/VALIDATION.md) for the verification scope.
