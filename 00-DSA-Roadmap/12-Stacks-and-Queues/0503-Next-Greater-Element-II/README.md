# 503. Next Greater Element II

[Official problem](https://leetcode.com/problems/next-greater-element-ii/) · Medium

## Contract

For each element in a circular array, return the first strictly larger value
encountered moving forward, or -1 when none exists. The official input has
1–10,000 elements with values between -1,000,000,000 and 1,000,000,000.
The solution does not modify the input. It returns values, not distances.

## Intuition

Keep indices whose next greater value is still unknown. Their values are
non-increasing from the bottom of the stack to its top. A new larger value
resolves the smaller pending values immediately: every earlier candidate was
already examined, so this is their first greater value.

## Approach

1. Fill the answer with -1 for unresolved elements.
2. Scan the array twice, using the index modulo the array length.
3. Pop and resolve pending indices while the current value is strictly larger.
4. Push indices only in the first pass, so each index is handled once.

The second pass supplies candidates across the end of the array. An element
cannot resolve itself because the comparison is strict. Elements that survive
both passes have no greater value anywhere in the circle.

Example: `[1, 2, 1]` produces `[2, -1, 2]`; the final 1 finds 2 after wrapping.

## Complexity

- Time: O(n). There are two scans, and each index is pushed and popped at most once.
- Auxiliary space: O(n) for the stack, plus O(n) for the returned array.

## Important Edge Cases

- One element or all equal elements: every result is -1.
- Descending values: smaller elements find the first maximum after wrapping.
- Duplicate maxima: equal values never qualify as greater.
- Negative values: -1 may be either a valid next value or the required sentinel.
- Large magnitudes: compare values directly instead of subtracting them.

## Verification

`tests/cases/126-0503-Next-Greater-Element-II.java` checks examples, singleton,
equal, descending, negative and maximum-size arrays, input immutability, and
2,000 deterministic random arrays against an independent O(n²) circular scan.
Run `python scripts/verify_java.py` from the repository root.

This is a prepared, locally testable solution; no LeetCode acceptance is claimed.
