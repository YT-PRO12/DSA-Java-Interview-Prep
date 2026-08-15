# Second Largest Element

## Problem

Given an array of integers, find the second largest distinct element.

### Example

**Input**

```text
[10, 5, 20, 8, 15]
```

**Output**

```text
15
```

## Approach

Maintain two variables:

* `largest` — stores the largest element.
* `secondLargest` — stores the second largest element.

While traversing the array:

1. If the current element is greater than `largest`, update both values.
2. Otherwise, if it is greater than `secondLargest` and different from `largest`, update `secondLargest`.

## Complexity

* Time Complexity: `O(n)`
* Space Complexity: `O(1)`

## Key Learning

Keeping track of the largest and second largest values allows the problem
to be solved in a single traversal without sorting the array.

