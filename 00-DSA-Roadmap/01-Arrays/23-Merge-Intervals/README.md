# Merge Intervals

## Problem

Given an array of intervals, merge all overlapping intervals.

## Approach

First sort the intervals by their starting value.

Then traverse the intervals.

For each interval:

- If it does not overlap with the previous interval, add it to the result.
- If it overlaps, merge them by taking the maximum ending value.

Two intervals overlap when the current interval starts before or at the end of the previous interval.

## Example

Input:

[[1,3], [2,6], [8,10], [15,18]]

Output:

[[1,6], [8,10], [15,18]]

## Complexity

- Time Complexity: O(n log n)
- Space Complexity: O(n)

## Interview Pattern

Sorting + Interval Merging
