Sort 0s, 1s and 2s

Problem Statement

Given an array containing only 0, 1, and 2, sort the array in-place without using a sorting algorithm.

Example

Input:

nums = [2, 0, 2, 1, 1, 0]

Output:

[0, 0, 1, 1, 2, 2]

Approach

Use the Dutch National Flag algorithm.

Maintain three pointers:

low
mid
high

0 belongs before low.

1 belongs between low and mid.

2 belongs after high.

Brute Force Approach

Use a standard sorting algorithm.

Time complexity is generally O(n log n).

Optimized Approach

Traverse the array once using three pointers.

Java Implementation

See Sort012.java.

Time Complexity

O(n)

Space Complexity

O(1)

Key Learning

The Dutch National Flag algorithm is an important in-place array partitioning technique.
