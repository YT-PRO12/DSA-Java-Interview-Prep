# Move Zeroes

## Problem

Given an array, move all zeroes to the end while maintaining the relative
order of the non-zero elements.

### Example

**Input**

```text
[0, 1, 0, 3, 12]
```

**Output**

```text
[1, 3, 12, 0, 0]
```

## Approach

Use an index to track the position where the next non-zero element should
be placed.

1. Traverse the array.
2. Copy every non-zero element to the current `index`.
3. After all non-zero elements are placed, fill the remaining positions
   with zeroes.

## Complexity

* Time Complexity: `O(n)`
* Space Complexity: `O(1)`

## Key Learning

The problem demonstrates in-place array manipulation while preserving
the relative order of non-zero elements.
