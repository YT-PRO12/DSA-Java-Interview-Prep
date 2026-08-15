# Maximum Subarray

## Problem

Given an integer array, find the contiguous subarray with the largest
sum and return its sum.

### Example

**Input**

```text
[-2, 1, -3, 4, -1, 2, 1, -5, 4]
```

**Output**

```text
6
```

The maximum-sum subarray is:

```text
[4, -1, 2, 1]
```

## Approach

Use Kadane's Algorithm.

Maintain two values:

* `currentSum` — the best sum ending at the current position.
* `maxSum` — the best sum found so far.

For each element, decide whether to:

* Start a new subarray from the current element.
* Extend the existing subarray.

Then update `maxSum`.

## Complexity

* Time Complexity: `O(n)`
* Space Complexity: `O(1)`

## Key Learning

Kadane's Algorithm is an important pattern for maximum subarray
problems and allows the problem to be solved in a single traversal.
