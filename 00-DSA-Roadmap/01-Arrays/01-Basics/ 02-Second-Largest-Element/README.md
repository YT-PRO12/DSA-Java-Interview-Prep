Second Largest Element

Problem Statement

Given an integer array, find the second largest distinct element.

Example

Input: [10, 5, 20, 8, 20, 15]
Output: 15

Approach

Keep track of two values:

largest

secondLargest

During one traversal, update them whenever a larger or second-largest distinct value is found.

Optimized Approach

The array is scanned only once. No sorting is required.

Java Implementation

See SecondLargestElement.java.

Complexity

Time: O(n)

Space: O(1)

Key Learning

Many "second best" problems can be solved with multiple tracking variables instead of sorting.
