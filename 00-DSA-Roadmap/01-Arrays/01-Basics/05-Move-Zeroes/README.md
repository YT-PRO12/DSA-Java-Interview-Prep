Move Zeroes

Problem Statement

Given an integer array, move all zeroes to the end while maintaining the relative order of all non-zero elements.

Example

Input: [0, 1, 0, 3, 12]
Output: [1, 3, 12, 0, 0]

Approach

Use a pointer called nonZeroIndex to represent the position where the next non-zero element should be placed.

Traverse the array.

Whenever a non-zero element is found, place it at nonZeroIndex.

After all non-zero elements are placed, fill the remaining positions with zeroes.

Optimized Approach

This solution modifies the original array and uses constant extra space.

Java Implementation

See MoveZeroes.java.

Complexity

Time: O(n)

Space: O(1)

Key Learning

In-place rearrangement can often be solved by maintaining a write pointer.
