# Majority Element

## Problem Statement

Given an integer array, find the element that appears more than `n / 2` times.

A majority element is guaranteed to exist.

## Example

Input:

`[2, 2, 1, 1, 1, 2, 2]`

Output:

`2`

Because `2` appears more than `n / 2` times.

## HashMap Approach

We can use a HashMap to store the frequency of every element.

- Time: O(n)
- Space: O(n)

## Optimized Approach

Use the Boyer-Moore Voting Algorithm.

Maintain:

- `candidate`
- `count`

If `count` becomes zero, choose the current element as the new candidate.

Because a majority element is guaranteed to exist, the final candidate is the answer.

## Java Implementation

See `MajorityElement.java`.

## Complexity

- Time: O(n)
- Space: O(1)

## Key Learning

HashMap provides a simple frequency-based solution, while Boyer-Moore solves the problem using constant extra space.
