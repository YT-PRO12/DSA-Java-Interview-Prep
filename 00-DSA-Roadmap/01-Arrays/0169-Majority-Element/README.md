# Majority Element

## Problem

Given an array of size `n`, find the element that appears more than `n / 2` times.

The majority element is guaranteed to exist.

## Approach

Use Moore's Voting Algorithm.

Maintain:

- `candidate` ? possible majority element.
- `count` ? voting count.

When `count` becomes `0`, choose the current element as the new candidate.

If the current element equals the candidate, increase the count.

Otherwise, decrease the count.

Because the majority element appears more than all other elements combined, it remains as the final candidate.

## Example

Input:

[2, 2, 1, 1, 1, 2, 2]

Output:

2

## Complexity

- Time Complexity: O(n)
- Space Complexity: O(1)

## Interview Pattern

Moore's Voting Algorithm
