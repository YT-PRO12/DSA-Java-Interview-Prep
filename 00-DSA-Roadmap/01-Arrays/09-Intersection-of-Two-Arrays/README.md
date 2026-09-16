# Intersection of Two Arrays

## Problem

Given two arrays, find the elements that are present in both arrays.

Each element should appear only once in the result.

## Approach

Store all elements of the first array in a `HashSet`.

Then traverse the second array.

If an element exists in the first set, add it to the intersection set.

A Set automatically prevents duplicates.

## Example

Input:

arr1 = [1, 2, 3, 4, 5]

arr2 = [3, 4, 5, 6, 7]

Output:

[3, 4, 5]

## Complexity

- Time Complexity: O(n + m)
- Space Complexity: O(n + m)

Where `n` and `m` are the sizes of the two arrays.

## Interview Pattern

Hashing / Set
