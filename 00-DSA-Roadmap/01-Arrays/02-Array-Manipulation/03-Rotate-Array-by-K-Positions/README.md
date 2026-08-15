Rotate Array by K Positions

Problem Statement

Given an integer array, rotate the array to the right by k positions.

Example

Input: [1, 2, 3, 4, 5, 6, 7], k = 3
Output: [5, 6, 7, 1, 2, 3, 4]

Approach

Use the Reversal Technique:

Reverse the entire array.

Reverse the first k elements.

Reverse the remaining elements.

Before rotating:

[1, 2, 3, 4, 5, 6, 7]

After reversing all:

[7, 6, 5, 4, 3, 2, 1]

After reversing the first 3:

[5, 6, 7, 4, 3, 2, 1]

After reversing the remaining elements:

[5, 6, 7, 1, 2, 3, 4]

Important

If k is larger than the array length, use:

k = k % n

This avoids unnecessary full rotations.

Java Implementation

See RotateArrayByK.java.

Complexity

Time: O(n)

Space: O(1)

Key Learning

The reversal technique is a powerful way to rotate arrays in-place using constant extra space.
