Missing Number

Problem Statement

Given an array containing n distinct numbers taken from the range [0, n], find the one number that is missing.

Example

Input: [3, 0, 1]
Output: 2

Brute Force Approach

One approach is to calculate the expected sum from 0 to n and subtract the array elements from it.

The formula is:

n * (n + 1) / 2

This approach is simple, but for very large values, arithmetic overflow can be a concern.

Optimized Approach

Use the XOR technique.

Important XOR properties:

x ^ x = 0

x ^ 0 = x

If we XOR all numbers from 0 to n with all elements of the array, every present number cancels itself and only the missing number remains.

Java Implementation

See MissingNumber.java.

Complexity

Time: O(n)

Space: O(1)

Key Learning

XOR can be used to find a missing value without extra space and without relying on arithmetic-sum calculations.
