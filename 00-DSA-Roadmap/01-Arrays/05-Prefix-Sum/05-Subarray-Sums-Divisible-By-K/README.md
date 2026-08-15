# Subarray Sums Divisible by K

## Problem Statement

Given an integer array `nums` and an integer `k`, find the number of non-empty subarrays whose sum is divisible by `k`.

## Example

Input:

`nums = [4, 5, 0, -2, -3, 1]`
`k = 5`

Output:

`7`

## Approach

Use **Prefix Sum + HashMap**.

Calculate the prefix sum while traversing the array.

Store the remainder:

```text
remainder = prefixSum % k
```

If two prefix sums have the same remainder, the sum of the elements between them is divisible by `k`.

For negative remainders:

```text
if (remainder < 0)
    remainder += k
```

Initialize:

```text
remainderCount.put(0, 1)
```

## Java Implementation

See `SubarraySumsDivisibleByK.java`.

## Complexity

- Time: O(n)
- Space: O(k)

## Key Learning

Tracking prefix-sum remainders is a powerful technique for subarray divisibility problems.
