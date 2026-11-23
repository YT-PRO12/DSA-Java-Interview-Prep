# Java algorithm practice — 23 November 2026

Eight standalone algorithm implementations with executable edge-case checks.
Each source file uses a package-private Java class and a `main` method that
throws `AssertionError` if a regression fails. The repository's existing
Java verifier includes the `practice/` directory.

| LeetCode | Problem | Approach | Time | Auxiliary space |
| --- | --- | --- | --- | --- |
| [330](0330-PatchingArray.java) | Patching Array | Greedy contiguous coverage using `long` | O(n + patches) | O(1) |
| [154](0154-MinimumRotatedSortedArrayII.java) | Rotated Minimum II | Binary search with duplicate shrinking | O(log n) average, O(n) worst | O(1) |
| [146](0146-LRUCache.java) | LRU Cache | Hash map + doubly linked list | O(1) average per operation | O(capacity) |
| [862](0862-ShortestSubarrayAtLeastK.java) | Shortest Subarray ≥ K | Monotonic deque of prefix sums | O(n) | O(n) |
| [93](0093-RestoreIpAddresses.java) | Restore IP Addresses | Bounded four-octet backtracking | Constant bounded search | O(1), excluding output |
| [227](0227-BasicCalculatorII.java) | Basic Calculator II | Accumulated terms, operator precedence | O(n) | O(1) |
| [875](0875-KokoEatingBananas.java) | Koko Eating Bananas | Binary search on feasible speed | O(n log maxPile) | O(1) |
| [743](0743-NetworkDelayTime.java) | Network Delay Time | Dijkstra with a min-heap | O((V + E) log V) | O(V + E) |

## Reproduce the checks

Compile and run a particular solution from this directory using JDK 17+:

```sh
javac 0330-PatchingArray.java
java PatchingArray
```

A passing run prints `PASS`. From the repository root, execute all
roadmap and practice checks with:

```sh
python scripts/verify_java.py
```

## Correctness notes

- **Patching Array:** `missing` is the first uncovered positive sum;
  doubling it uses `long` to avoid overflow near the integer limit.
- **Rotated Minimum II:** equal endpoints can force linear worst-case time.
- **LRU Cache:** reading or updating a key refreshes its recency; evictions
  remove both the map entry and the list node.
- **Shortest Subarray:** negative numbers require prefix sums; a normal
  positive-only sliding window is not correct.
- **Restore IP Addresses:** leading zeros are allowed only for the octet `0`.
- **Calculator II:** division truncates toward zero, and multiplication or
  division is evaluated before addition or subtraction.
- **Koko:** summing hours in `long` avoids overflow across large piles.
- **Network Delay:** `long` path sums prevent intermediate overflow, and
  unreachable nodes yield `-1`.

These checks demonstrate selected examples and boundaries, not exhaustive
proof against every online-judge input.
