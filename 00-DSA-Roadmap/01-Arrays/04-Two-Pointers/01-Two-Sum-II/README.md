01. Two Sum II
Problem Statement

Given a sorted integer array numbers and an integer target, find two numbers whose sum equals the target.

Return their 1-based indices.

Example
Input:
numbers = [2, 7, 11, 15]
target = 9


Output:
[1, 2]

Because:

2 + 7 = 9
Approach

Use two pointers:

left starts from the beginning.
right starts from the end.

Calculate:

sum = numbers[left] + numbers[right]

If:

sum == target → solution found.
sum < target → move left forward.
sum > target → move right backward.
Java Implementation

See TwoSumII.java.

Complexity
Time: O(n)
Space: O(1)
Key Learning

A sorted array often allows the Two Pointer technique to replace nested loops.
