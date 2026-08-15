# Two Sum

## Problem

Given an array of integers and a target value, find two indices whose
corresponding values add up to the target.

### Example

**Input**

```text
nums = [2, 7, 11, 15]
target = 9
```

**Output**

```text
[0, 1]
```

## Approach

Use a `HashMap` to store previously visited values and their indices.

For every element:

1. Calculate the required value:
   `required = target - nums[i]`
2. Check whether `required` already exists in the HashMap.
3. If it exists, the two indices have been found.
4. Otherwise, store the current value and its index.

## Complexity

* Time Complexity: `O(n)`
* Space Complexity: `O(n)`

## Key Learning

The HashMap allows constant-time average lookup and reduces the
brute-force `O(n²)` approach to `O(n)`.
