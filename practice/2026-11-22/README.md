# Algorithm practice — 22 November 2026

Seven standalone Java 17 implementations, each with a runnable `main` regression suite.
They are verified by the repository's Java CI alongside existing roadmap solutions.

| Problem | Technique | Time | Auxiliary space |
| --- | --- | --- | --- |
| [139 — Word Break](0139-WordBreak.java) | Reachable-prefix DP | O(n × dictionary size × max word length) | O(n) |
| [198 — House Robber](0198-HouseRobber.java) | Rolling two-state DP | O(n) | O(1) |
| [309 — Stock With Cooldown](0309-StockWithCooldown.java) | Held / sold / resting states | O(n) | O(1) |
| [347 — Top K Frequent Elements](0347-TopKFrequentElements.java) | Frequency map with deterministic sorting | O(n + u log u) | O(u) |
| [417 — Pacific Atlantic Water Flow](0417-PacificAtlanticWaterFlow.java) | Reverse multi-source BFS from both oceans | O(rows × cols) | O(rows × cols) |
| [494 — Target Sum](0494-TargetSum.java) | Signed-sum counting DP | O(n × reachable sums) | O(reachable sums) |
| [907 — Sum of Subarray Minimums](0907-SumSubarrayMinimums.java) | Monotonic stack with tie handling | O(n) | O(n) |

## Run a single solution

Each file uses a Java class name without the numerical problem prefix.
For example, from this directory:

```sh
javac 0139-WordBreak.java
java WordBreak
```

A successful run prints `PASS`; regressions throw an `AssertionError`.
For repository-wide verification from the root, run:

```sh
python scripts/verify_java.py
```

## Implementation notes

- *Word Break* does not construct or copy candidate substrings.
- *Stock With Cooldown* transitions only from the previous day's state.
- *Pacific Atlantic* searches uphill from the oceans instead of re-running DFS from every cell.
- *Target Sum* counts `+0` and `-0` as separate valid assignments.
- *Subarray Minimums* pops equal stack values consistently so ties contribute exactly once.

The examples are educational solutions, not proof of correctness on every hidden online-judge case.
