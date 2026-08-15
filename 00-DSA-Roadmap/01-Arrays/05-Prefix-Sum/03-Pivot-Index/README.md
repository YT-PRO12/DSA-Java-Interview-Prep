# Range Sum Query

## Problem Statement

Given an integer array `nums`, answer queries asking for the sum of elements between indices `left` and `right`, inclusive.

## Example

Input:

`nums = [1, 2, 3, 4, 5]`

Query:

`left = 1`
`right = 3`

Output:

`9`

Because:

```text
2 + 3 + 4 = 9
```

## Approach

First create a Prefix Sum array.

For a range from `left` to `right`:

```text
sum = prefix[right] - prefix[left - 1]
```

If `left == 0`:

```text
sum = prefix[right]
```

## Java Implementation

See `RangeSumQuery.java`.

## Complexity

- Prefix Sum creation: O(n) time and O(n) space
- Each range query: O(1) time

## Key Learning

Prefix Sum allows range-sum queries to be answered in O(1) time after preprocessing.
