# Subarray Sum Equals K

## Problem Statement

Given an integer array `nums` and an integer `k`, find the total number of continuous subarrays whose sum equals `k`.

## Example

Input:

`nums = [1, 1, 1]`
`k = 2`

Output:

`2`

The valid subarrays are:

```text
[1, 1]
[1, 1]
```

## Approach

Use **Prefix Sum + HashMap**.

Maintain the current prefix sum.

For the current prefix sum, we need a previous prefix sum such that:

```text
previousPrefixSum = prefixSum - k
```

If it exists, the elements between those positions form a subarray whose sum is `k`.

Store the frequency of every prefix sum in a HashMap.

Initialize:

```text
prefixCount.put(0, 1)
```

## Java Implementation

See `SubarraySumEqualsK.java`.

## Complexity

- Time: O(n)
- Space: O(n)

## Key Learning

Prefix Sum combined with HashMap can reduce many subarray-sum problems from O(n²) to O(n).
