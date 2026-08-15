Merge Intervals

Problem Statement

Given an array of intervals where intervals[i] = [start, end], merge all overlapping intervals.

Example

Input:

intervals = [[1,3],[2,6],[8,10],[15,18]]

Output:

[[1,6],[8,10],[15,18]]

The intervals [1,3] and [2,6] overlap, so they are merged into:

[1,6]

Approach

First sort the intervals by their starting value.

Then compare each interval with the current interval.

If:

currentStart <= currentEnd

the intervals overlap.

Update the end:

end = max(end, currentEnd)

Otherwise, store the current interval and start a new interval.

Brute Force Approach

Repeatedly compare every pair of intervals and merge overlapping intervals.

This can take O(n²) time.

Optimized Approach

Sort intervals first and then perform one linear traversal.

Java Implementation

See MergeIntervals.java.

Time Complexity

O(n log n)

Space Complexity

O(n)

Key Learning

Sorting intervals by their starting point makes overlapping interval problems much easier to solve.
