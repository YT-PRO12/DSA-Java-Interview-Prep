Right Rotate Array

Problem Statement

Given an integer array, rotate the array to the right by one position.

Example

Input: [1, 2, 3, 4, 5]
Output: [5, 1, 2, 3, 4]

Approach

Store the last element, shift every other element one position to the right, and place the stored element at the beginning.

Optimized Approach

The array is modified in-place without using another array.

Java Implementation

See RightRotateArray.java.

Complexity

Time: O(n)

Space: O(1)

Key Learning

Right rotation is the reverse operation of left rotation and can also be handled with a single temporary variable.
