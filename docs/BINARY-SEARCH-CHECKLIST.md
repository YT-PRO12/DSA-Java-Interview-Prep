# Binary search checklist

For a sorted array, identify whether the target can still be within the inclusive range `[left, right]`. When the range is empty, return not found.

- Choose a midpoint with `left + (right - left) / 2` to avoid addition overflow.
- If `a[mid] < target`, discard the left half with `left = mid + 1`.
- If `a[mid] > target`, discard the right half with `right = mid - 1`.
- If equal, return the index; for first occurrence, continue looking left.
- Carefully define whether `right` is inclusive or exclusive; do not mix conventions.

Complexity: `O(log n)` comparisons and `O(1)` extra space for iterative search.

For binary search on an answer, prove the feasibility predicate is monotone before coding.
