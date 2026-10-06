# Majority Element II

## Problem

Given an integer array of size `n`, find all elements that appear more than `n / 3` times.

## Approach

Use the extended Moore's Voting Algorithm.

For the `n / 3` condition, there can be at most **two** majority candidates.

Maintain:

- `candidate1` and `candidate2`
- `count1` and `count2`

First pass finds the possible candidates.

Second pass counts their actual frequencies and verifies whether they appear more than `n / 3` times.

## Example

Input:

[3, 2, 3, 2, 2, 1, 1, 1]

Output:

[2, 1]

## Complexity

- Time Complexity: O(n)
- Space Complexity: O(1) auxiliary space

## Interview Pattern

Extended Moore's Voting Algorithm
