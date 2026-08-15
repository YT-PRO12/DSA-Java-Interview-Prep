# Reverse an Array

## Problem

Given an array of integers, reverse the elements of the array.

### Example

**Input**

```text
[1, 2, 3, 4, 5]
```

**Output**

```text
[5, 4, 3, 2, 1]
```

## Approach

Use the two-pointer technique.

* Set `left` at the beginning of the array.
* Set `right` at the end.
* Swap the elements at `left` and `right`.
* Move `left` forward and `right` backward.
* Continue until the pointers meet.

## Complexity

* Time Complexity: `O(n)`
* Space Complexity: `O(1)`

## Key Learning

The two-pointer technique can reverse an array in-place without using
an additional array.

