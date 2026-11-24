# Java algorithm practice — 24 November 2026

Ten standalone Java implementations with executable regression checks. Each
solution uses the input constraints of its corresponding LeetCode problem.

| Problem | Approach | Time | Auxiliary space |
| --- | --- | --- | --- |
| [124 — Binary Tree Maximum Path Sum](0124-BinaryTreeMaximumPathSum.java) | Postorder traversal | O(n) | O(h) |
| [735 — Asteroid Collision](0735-AsteroidCollision.java) | Stack | O(n) | O(n) |
| [402 — Remove K Digits](0402-RemoveKDigits.java) | Monotonic stack | O(n) | O(n) |
| [518 — Coin Change II](0518-CoinChangeII.java) | Combination-counting DP | O(amount × coins) | O(amount) |
| [213 — House Robber II](0213-HouseRobberII.java) | Two linear DP ranges | O(n) | O(1) |
| [287 — Find the Duplicate Number](0287-FindDuplicateNumber.java) | Floyd cycle detection | O(n) | O(1) |
| [152 — Maximum Product Subarray](0152-MaximumProductSubarray.java) | Rolling maximum/minimum | O(n) | O(1) |
| [684 — Redundant Connection](0684-RedundantConnection.java) | Union-find | O(n α(n)) | O(n) |
| [787 — Cheapest Flights Within K Stops](0787-CheapestFlightsWithinKStops.java) | Layered Bellman-Ford | O((k+1)(V+E)) | O(V) |
| [134 — Gas Station](0134-GasStation.java) | Greedy balance | O(n) | O(1) |

## Run locally

Use JDK 17 or newer. From this directory:

```sh
javac 0402-RemoveKDigits.java
java RemoveKDigits
```

A successful check prints `PASS`. Run the repository-wide verifier from
the root with `python scripts/verify_java.py`.

## Implementation notes

- A tree path must contain at least one node; all-negative inputs must not
  incorrectly produce zero.
- Coin-first iteration counts combinations rather than permutations.
- The duplicate-number algorithm neither sorts nor mutates its input.
- Flight relaxation uses a previous-layer snapshot to preserve the
  number-of-stops constraint.
- Asteroid magnitude comparison widens to long before negation.

The executable checks cover selected examples and edge cases, not every
possible online-judge input.
