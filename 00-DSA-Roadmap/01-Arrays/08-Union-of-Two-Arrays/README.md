# Union of Two Arrays

## Problem

Given two arrays, find their union.

The union contains every distinct element that appears in either array.

## Approach

Use a `LinkedHashSet`.

A Set automatically removes duplicate elements.

`LinkedHashSet` also maintains the insertion order.

Add all elements from the first array and then all elements from the second array.

## Example

Input:

arr1 = [1, 2, 3, 4]

arr2 = [3, 4, 5, 6]

Output:

[1, 2, 3, 4, 5, 6]

## Complexity

- Time Complexity: O(n + m)
- Space Complexity: O(n + m)

Where `n` and `m` are the sizes of the two arrays.

## Interview Pattern

Hashing / Set
