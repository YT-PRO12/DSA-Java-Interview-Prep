# Arrays

[Roadmap](../README.md) · [Repository guide](../../README.md)

Practice contiguous storage, scans, in-place updates, and matrix transformations before moving to specialized patterns.

## Concepts Covered

- Traversal and indexing
- Running extrema and majority voting
- Kadane’s algorithm
- Matrix markers and rotation

## Problem Index

| # | LeetCode | Problem | Difficulty | Pattern | Solution |
|---:|---:|---|---|---|---|
| 1 | 48 | [Rotate Image](https://leetcode.com/problems/rotate-image/) | Medium | Matrix / Transpose + Reverse | [Java](0048-Rotate-Image/RotateMatrix.java) |
| 2 | 53 | [Maximum Subarray](https://leetcode.com/problems/maximum-subarray/) | Medium | Kadane's Algorithm / Dynamic Programming | [Java](0053-Maximum-Subarray/KadaneMaximumSubarray.java) |
| 3 | 73 | [Set Matrix Zeroes](https://leetcode.com/problems/set-matrix-zeroes/) | Medium | Matrix / In-Place Modification | [Java](0073-Set-Matrix-Zeroes/SetMatrixZeroes.java) |
| 4 | 169 | [Majority Element](https://leetcode.com/problems/majority-element/) | Easy | Moore's Voting Algorithm | [Java](0169-Majority-Element/MajorityElement.java) |
| 5 | 229 | [Majority Element II](https://leetcode.com/problems/majority-element-ii/) | Medium | Extended Moore's Voting Algorithm | [Java](0229-Majority-Element-II/MajorityElementII.java) |
| 6 | 485 | [Max Consecutive Ones](https://leetcode.com/problems/max-consecutive-ones/) | Easy | Array Traversal / Counting | [Java](0485-Max-Consecutive-Ones/MaximumConsecutiveOnes.java) |

## Fundamentals

| Exercise | Focus | Implementation |
|---|---|---|
| [Check if Array is Sorted](Fundamentals/Check-if-Array-is-Sorted/README.md) | Array Traversal | [Java](Fundamentals/Check-if-Array-is-Sorted/CheckIfArrayIsSorted.java) |
| [Largest Element](Fundamentals/Largest-Element/README.md) | Array Traversal | [Java](Fundamentals/Largest-Element/LargestElement.java) |
| [Left Rotate Array](Fundamentals/Left-Rotate-Array/README.md) | Array Traversal / In-Place Modification | [Java](Fundamentals/Left-Rotate-Array/LeftRotateArray.java) |
| [Linear Search](Fundamentals/Linear-Search/README.md) | Array Traversal / Searching | [Java](Fundamentals/Linear-Search/LinearSearch.java) |
| [Second Largest Element](Fundamentals/Second-Largest-Element/README.md) | Array Traversal | [Java](Fundamentals/Second-Largest-Element/SecondLargestElement.java) |
| [Union of Two Arrays](Fundamentals/Union-of-Two-Arrays/README.md) | Hashing / Set | [Java](Fundamentals/Union-of-Two-Arrays/UnionOfTwoArrays.java) |

## Learning Progression

1. Scan and search
2. Track running state
3. Modify in place
4. Transform matrices

## Interview Essentials

- State the valid input range before indexing the first element.
- Distinguish a contiguous subarray from a subsequence.
- Know when an output array counts as auxiliary memory.
- Dry-run all-negative arrays, duplicates, and boundary rows.

## Learning Outcomes

Choose a scan invariant, explain O(n) versus O(n²) work, and update arrays without overwriting information too early.

## Related Practice

- [1. Two Sum](../05-Hashing-and-Prefix-Sum/0001-Two-Sum)
- [11. Container With Most Water](../06-Two-Pointers/0011-Container-With-Most-Water)
- [560. Subarray Sum Equals K](../05-Hashing-and-Prefix-Sum/0560-Subarray-Sum-Equals-K)
- [33. Search in Rotated Sorted Array](../08-Binary-Search/0033-Search-in-Rotated-Sorted-Array)

Counts reflect files in this repository, not verified LeetCode acceptances. See the [validation report](../../docs/VALIDATION.md) for the verification scope.
