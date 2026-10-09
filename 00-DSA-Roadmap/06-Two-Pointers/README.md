# Two Pointers

[Roadmap](../README.md) · [Repository guide](../../README.md)

Maintain two or three boundaries to eliminate candidates, compact values, and partition arrays without extra copies.

## Concepts Covered

- Opposite-direction pointers
- Read/write compaction
- Sorted pair and k-sum reasoning
- Fast/slow pointers through linked-list cross-links

## Problem Index

| # | LeetCode | Problem | Difficulty | Pattern | Solution |
|---:|---:|---|---|---|---|
| 1 | 11 | [Container With Most Water](https://leetcode.com/problems/container-with-most-water/) | Medium | Two Pointers / Greedy | [Java](0011-Container-With-Most-Water/ContainerWithMostWater.java) |
| 2 | 15 | [3Sum](https://leetcode.com/problems/3sum/) | Medium | Sorting + Two Pointers | [Java](0015-3Sum/ThreeSum.java) |
| 3 | 18 | [4Sum](https://leetcode.com/problems/4sum/) | Medium | Sorting + Two Pointers | [Java](0018-4Sum/FourSum.java) |
| 4 | 26 | [Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/) | Easy | Two Pointers / In-Place Array Modification | [Java](0026-Remove-Duplicates-from-Sorted-Array/RemoveDuplicatesFromSortedArray.java) |
| 5 | 42 | [Trapping Rain Water](https://leetcode.com/problems/trapping-rain-water/) | Hard | Two Pointers / Prefix-Suffix Maximum | [Java](0042-Trapping-Rain-Water/TrappingRainWater.java) |
| 6 | 283 | [Move Zeroes](https://leetcode.com/problems/move-zeroes/) | Easy | Two Pointers / In-Place Array Modification | [Java](0283-Move-Zeroes/MoveZeroes.java) |

## Fundamentals

| Exercise | Focus | Implementation |
|---|---|---|
| [Sorted Array Pair Sum](Fundamentals/Sorted-Array-Pair-Sum/README.md) | Sorted Array Pair Sum | [Java](Fundamentals/Sorted-Array-Pair-Sum/SortedArrayPairSum.java) |
| [Three Way Partition](Fundamentals/Three-Way-Partition/README.md) | Three Way Partition | [Java](Fundamentals/Three-Way-Partition/ThreeWayPartition.java) |

## Learning Progression

1. Sorted pair search
2. In-place compaction
3. Three-way partition
4. Multi-value sum problems

## Interview Essentials

- Sorted order is a precondition for moving a pointer based on the sum.
- Move the shorter boundary in Container With Most Water and explain why.
- After swapping an unprocessed value from the end, inspect it before advancing.
- Use long for sums of multiple arbitrary int values.

## Learning Outcomes

State what each pointer separates and justify that every move preserves all remaining candidates.

## Related Practice

- [75. Sort Colors](../04-Sorting/0075-Sort-Colors)
- [141. Linked List Cycle](../11-Linked-List/0141-Linked-List-Cycle)
- [142. Linked List Cycle II](../11-Linked-List/0142-Linked-List-Cycle-II)
- [876. Middle of the Linked List](../11-Linked-List/0876-Middle-of-the-Linked-List)

Counts reflect files in this repository, not verified LeetCode acceptances. See the [validation report](../../docs/VALIDATION.md) for the verification scope.
