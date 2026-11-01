# Longest Increasing Subsequence — LeetCode 300

Maintain an array `tails` where `tails[i]` is the minimum possible ending value of any increasing subsequence of length `i + 1` found so far. For every value, binary-search the first tail greater than or equal to it, then replace that tail. Append when the value exceeds every tail.

Example input: [10, 9, 2, 5, 3, 7, 101, 18].

- 10 → [10], 9 → [9], 2 → [2]
- 5 → [2, 5], 3 → [2, 3]
- 7 → [2, 3, 7]
- 101 → [2, 3, 7, 101]
- 18 → [2, 3, 7, 18]

The length is 4. The `tails` array is not necessarily an actual subsequence; it summarizes achievable lengths. Use lower_bound (`>=`) for strictly increasing sequences to avoid counting duplicates.

Complexity: O(n log n) time and O(n) auxiliary space.
