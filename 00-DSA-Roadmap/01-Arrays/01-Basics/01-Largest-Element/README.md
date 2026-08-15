Largest Element

Problem Statement

Given an integer array, find and return the largest element in the array.

Example

Input: [10, 5, 20, 8, 15]
Output: 20

Approach

Traverse the array once while maintaining the largest value seen so far.

Optimized Approach

Assume the first element is the largest.

Compare every remaining element with the current largest.

Update the largest value whenever a bigger element is found.

Java Implementation

See LargestElement.java.

Complexity

Time: O(n)

Space: O(1)

Key Learning

A simple linear traversal is enough when only the maximum element is required.
