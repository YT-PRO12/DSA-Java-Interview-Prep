# Prefix Sum

## Problem Statement

Given an integer array `nums`, create a prefix sum array where each element contains the sum of all elements from the beginning of the array up to that index.

## Example

Input:

`nums = [1, 2, 3, 4, 5]`

Output:

`[1, 3, 6, 10, 15]`

## Approach

Create a prefix array.

For every index:

```text
prefix[i] = prefix[i - 1] + nums[i]
```

The first element is:

```text
prefix[0] = nums[0]
```

## Java Implementation

See `PrefixSum.java`.

## Complexity

- Time: O(n)
- Space: O(n)

## Key Learning

Prefix Sum stores cumulative information so repeated sum calculations can be performed efficiently.
