Merge Sorted Arrays

Problem Statement

Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

nums1 has enough space at the end to hold all elements of nums2.

Example

Input:

nums1 = [1, 2, 3, 0, 0, 0]
m = 3

nums2 = [2, 5, 6]
n = 3

Output:

[1, 2, 2, 3, 5, 6]

Approach

Use three pointers:

i = last valid element of nums1
j = last element of nums2
k = last position of nums1

Fill nums1 from the end.

Brute Force Approach

Copy all elements into another array and sort them.

This requires extra space and sorting time.

Optimized Approach

Compare elements from the end of both arrays and place the larger element at the end of nums1.

Java Implementation

See MergeSortedArrays.java.

Time Complexity

O(m + n)

Space Complexity

O(1)

Key Learning

When an array has extra space at the end, merging from the back avoids overwriting useful elements.
