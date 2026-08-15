Kth Largest Element in an Array

Problem Statement

Given an integer array nums and an integer k, return the kth largest element in the array.

The array does not need to be sorted completely.

Example

Input:

nums = [3, 2, 1, 5, 6, 4]
k = 2

Output:

5

The sorted array in descending order is:

[6, 5, 4, 3, 2, 1]

Therefore, the 2nd largest element is:

5

Approach

Use a Min Heap of size k.

For every number:

Add it to the heap.

If the heap size becomes greater than k, remove the smallest element.

After processing all elements, the heap contains the k largest elements.

The root of the heap is the kth largest element.

Brute Force Approach

Sort the entire array and return:

nums[nums.length - k]

Time complexity:

O(n log n)

Optimized Approach

Maintain a Min Heap containing only k elements.

This avoids sorting the entire array.

Java Implementation

See KthLargestElement.java.

Time Complexity

O(n log k)

Space Complexity

O(k)

Key Learning

A heap is useful when we need to continuously maintain the largest or smallest k elements.
