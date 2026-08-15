Kadane Pattern
Overview

The Kadane Pattern is used to solve problems involving contiguous subarrays, especially problems related to finding maximum or minimum sums.

The main idea is to maintain the best possible result while traversing the array instead of checking every possible subarray.

Core Idea

For maximum subarray sum, maintain:

currentSum
maxSum

At every element:

currentSum = max(nums[i], currentSum + nums[i])
maxSum = max(maxSum, currentSum)

This allows the problem to be solved in O(n) time.

Problems Covered
Maximum Subarray
Maximum Circular Subarray
Maximum Product Subarray
Maximum Subarray Variations
Pattern Recognition

Use the Kadane Pattern when:

The problem involves a contiguous subarray.
You need the maximum/minimum sum or product.
You need an efficient O(n) solution.
The answer depends on the best result ending at the current index.
Complexity
Standard Kadane
Time: O(n)
Space: O(1)
Key Learning

The most important idea is:

At every position, decide whether to extend the previous subarray or start a new one.

Kadane's Algorithm is one of the most important array patterns for coding interviews.

Language: Java
