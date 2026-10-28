# 713. Subarray Product Less Than K

[Official problem](https://leetcode.com/problems/subarray-product-less-than-k/) · **Medium**

## Intuition

After shrinking to a valid product, every suffix ending at the right edge is valid because all values are positive integers.

## Approach

Multiply the incoming value into a long accumulator. Divide departing left values until the product is strictly below k. Add the window length to the count. Return zero immediately for k <= 1.

## Dry run

For `[2,3,4]` and k = 10, the right-edge contributions are 1, 2 and 1. The total is 4; `[3,4]` must be excluded.

## Complexity

O(n) time and O(1) auxiliary space. Under the official bounds, the answer fits int; long holds the intermediate product.

## Important edge cases

k = 0 or 1; product exactly k; repeated ones; a single value at least k; the maximum count of all-one subarrays.

## Java solution and verification

[Solution.java](Solution.java) follows the LeetCode method signature. The [regression suite](../../../tests/cases/sprint-2026-10-28-0713.java) compares deterministic random inputs with an independent exhaustive reference and covers large inputs.

Run `python scripts/verify_java.py --new-only` from the repository root with JDK 17 or newer. No online acceptance is claimed.
