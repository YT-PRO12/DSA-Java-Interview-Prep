# Sorting

[Roadmap](../README.md) · [Repository guide](../../README.md)

Compare elementary sorts, efficient divide-and-conquer sorts, and bounded-key counting. Sorting often makes a later greedy or pointer argument possible.

## Concepts Covered

- Bubble, selection and insertion sort
- Merge sort and quick sort
- Counting sort for bounded nonnegative keys
- Stability, input mutation and comparator safety

## Problem Index

| # | LeetCode | Problem | Difficulty | Pattern | Solution |
|---:|---:|---|---|---|---|
| 1 | 75 | [Sort Colors](https://leetcode.com/problems/sort-colors/) | Medium | Dutch national flag | [Java](0075-Sort-Colors/Solution.java) |
| 2 | 451 | [Sort Characters By Frequency](https://leetcode.com/problems/sort-characters-by-frequency/) | Medium | HashMap / Frequency Sorting | [Java](0451-Sort-Characters-By-Frequency/SortCharactersByFrequency.java) |

## Fundamentals

| Exercise | Focus | Implementation |
|---|---|---|
| [Counting Sort](Fundamentals/Counting-Sort/README.md) | Counting Sort | [Java](Fundamentals/Counting-Sort/CountingSort.java) |
| [Divide and Conquer Sorts](Fundamentals/Divide-and-Conquer-Sorts/README.md) | Divide and Conquer Sorts | [Java](Fundamentals/Divide-and-Conquer-Sorts/DivideAndConquerSorts.java) |
| [Elementary Sorts](Fundamentals/Elementary-Sorts/README.md) | Elementary Sorts | [Java](Fundamentals/Elementary-Sorts/ElementarySorts.java) |

## Learning Progression

1. Elementary sorts
2. Counting sort and partitioning
3. Merge and quick sort
4. Sorting-based interview patterns

## Interview Essentials

- Study iterative sorts first; revisit the recursive sorts after chapter 09.
- Quicksort can take O(n²) time; merge sort has a predictable O(n log n) bound.
- Use Integer.compare instead of subtraction in comparators.
- Counting sort is useful only when the value domain is reasonably small.

## Learning Outcomes

Choose an algorithm by input size, stability, memory, and key range, and distinguish average from worst-case costs.

## Related Practice

- [15. 3Sum](../06-Two-Pointers/0015-3Sum)
- [56. Merge Intervals](../13-Greedy/0056-Merge-Intervals)
- [435. Non-overlapping Intervals](../13-Greedy/0435-Non-overlapping-Intervals)
- [148. Sort List](../11-Linked-List/0148-Sort-List)

Counts reflect files in this repository, not verified LeetCode acceptances. See the [validation report](../../docs/VALIDATION.md) for the verification scope.
