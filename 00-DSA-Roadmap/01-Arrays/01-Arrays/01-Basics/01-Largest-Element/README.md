# Largest Element in an Array

## Problem

Given an array of integers, find the largest element in the array.

### Example

**Input**

```text
[10, 5, 20, 8, 15]
```

**Output**

```text
20
```

## Approach

* Assume the first element is the largest.
* Traverse the remaining elements.
* Compare each element with the current largest value.
* Update the largest value whenever a bigger element is found.
* Return the largest value after the traversal.

## Complexity

* Time Complexity: `O(n)`
* Space Complexity: `O(1)`

## Key Learning

A single traversal is sufficient to find the largest element in an array.
This is a basic array traversal pattern used in many DSA problems.

