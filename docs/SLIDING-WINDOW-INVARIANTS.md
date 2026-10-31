# Sliding window invariants

## Fixed-size windows

For a window of length `k`, when advancing right by one element, add the new element and subtract the element leaving from the left. The first complete window ends at index `k - 1`. For `n` items, a fixed-size linear scan costs `O(n)` time.

## Variable-size windows

Expand right; while a clearly stated constraint is violated, move left until the window becomes valid. This works in linear time when both pointers only move forward and the predicate has suitable monotonicity.

For sums with negative numbers, shrinking based solely on `sum > target` may fail; prefix sums with a map or deque can be necessary.

## Questions to ask

- What property of the current interval is maintained?
- When exactly does a window become valid?
- Can left or right ever move backward?
- What happens when `k = 0` or `k > n`?
- Is the objective the number of windows, the longest interval, or the maximum score?
