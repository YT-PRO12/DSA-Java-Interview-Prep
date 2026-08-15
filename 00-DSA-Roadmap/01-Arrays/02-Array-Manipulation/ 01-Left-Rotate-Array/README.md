Left Rotate Array

Problem Statement

Given an integer array, rotate the array to the left by one position.

Example

Input: [1, 2, 3, 4, 5]
Output: [2, 3, 4, 5, 1]

Approach

Store the first element, shift every remaining element one position to the left, and place the stored element at the end.

Optimized Approach

The array is modified in-place using constant extra space.

Java Implementation

See LeftRotateArray.java.

Complexity

Time: O(n)

Space: O(1)

Key Learning

Basic array rotation can be performed efficiently by shifting elements in-place.
