Check if Array is Sorted

Problem Statement

Given an integer array, determine whether the array is sorted in non-decreasing order.

An array is sorted if every element is less than or equal to the element after it.

Example

Input: [1, 2, 2, 4, 7]
Output: true

Input: [1, 5, 3, 4]
Output: false

Approach

Compare each element with the next element. If any element is greater than the next one, the array is not sorted.

Java Implementation

See CheckIfArrayIsSorted.java.

Complexity

Time: O(n)

Space: O(1)

Key Learning

Checking whether a sequence satisfies a condition often requires only adjacent-element comparisons.
