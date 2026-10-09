# Binary Search

A curated Java interview-preparation set covering classic binary search, boundary search, rotated arrays, peak finding, matrix search, and binary search on the answer.

## Current Problem Set

| LeetCode | Problem | Difficulty | Pattern |
|---:|---|---|---|
| 33 | Search in Rotated Sorted Array | Medium | Rotated array |
| 34 | Find First and Last Position of Element in Sorted Array | Medium | Boundary search |
| 35 | Search Insert Position | Easy | Lower bound |
| 74 | Search a 2D Matrix | Medium | Flattened binary search |
| 81 | Search in Rotated Sorted Array II | Medium | Rotated array + duplicates |
| 153 | Find Minimum in Rotated Sorted Array | Medium | Rotated minimum |
| 162 | Find Peak Element | Medium | Peak search |
| 240 | Search a 2D Matrix II | Medium | Matrix elimination |
| 410 | Split Array Largest Sum | Hard | Binary search on answer |
| 704 | Binary Search | Easy | Classic binary search |
| 875 | Koko Eating Bananas | Medium | Binary search on answer |
| 1011 | Capacity To Ship Packages Within D Days | Medium | Binary search on answer |
| 1283 | Find the Smallest Divisor Given a Threshold | Medium | Binary search on answer |
| 1482 | Minimum Number of Days to Make m Bouquets | Medium | Minimum feasible value |
| 1552 | Magnetic Force Between Two Balls | Medium | Maximum minimum distance |

## Pattern Progression

```text
Classic Binary Search
        ↓
Lower / Upper Bound
        ↓
Boundary Search
        ↓
Rotated Arrays
        ↓
Peak Search
        ↓
Matrix Search
        ↓
Binary Search on Answer
        ↓
Partition / Optimization Problems
```

## Naming Convention

Each official LeetCode problem follows:

```text
XXXX-Problem-Name/
└── Solution.java
```

The four-digit prefix is the official LeetCode problem number.

## Interview Notes

- Use `mid = left + (right - left) / 2` to avoid overflow.
- Decide whether the search space contains indices or possible answers.
- For binary search on answer, define a monotonic feasibility function.
- Know when to use `left <= right` versus `left < right`.
- For minimum feasible answers, move `right = mid` after success.
- For maximum feasible answers, preserve the current candidate and move rightward.
