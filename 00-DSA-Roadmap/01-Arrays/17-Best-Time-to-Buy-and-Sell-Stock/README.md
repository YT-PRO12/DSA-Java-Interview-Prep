# Best Time to Buy and Sell Stock

## Problem

Given an array where `prices[i]` represents the stock price on day `i`, find the maximum profit that can be achieved by buying on one day and selling on a later day.

Only one transaction is allowed.

## Approach

Maintain:

- `minPrice` ? lowest price seen so far.
- `maxProfit` ? maximum profit found so far.

For every price, calculate:

`profit = current price - minPrice`

Update the maximum profit whenever a larger profit is found.

## Example

Input:

[7, 1, 5, 3, 6, 4]

Output:

5

Buy at `1` and sell at `6`.

Profit:

`6 - 1 = 5`

## Complexity

- Time Complexity: O(n)
- Space Complexity: O(1)

## Interview Pattern

Greedy / Array Traversal
