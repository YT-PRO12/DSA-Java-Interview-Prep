Remove Duplicates from Sorted Array

Problem Statement

Given a sorted integer array, remove duplicate elements in-place so that each unique element appears only once.

Return the number of unique elements.

Example

Input: [1, 1, 2, 2, 3]
Output: 3

The first three positions become:

[1, 2, 3]

Approach

Use the Two Pointers technique:

slow points to the position of the last unique element.

fast scans the array.

When a new unique element is found, move slow forward and copy the element there.

Important

The input array must be sorted for this technique to work correctly.

Java Implementation

See RemoveDuplicates.java.

Complexity

Time: O(n)

Space: O(1)

Key Learning

Two pointers are extremely useful for in-place operations on sorted arrays.
