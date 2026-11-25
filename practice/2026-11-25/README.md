# Java algorithm practice — 25 November 2026

Nine standalone Java implementations with executable regression checks.

| Problem | Approach | Time | Auxiliary space |
| --- | --- | --- | --- |
| [62 — Unique Paths](0062-UniquePaths.java) | One-dimensional grid DP | O(mn) | O(n) |
| [118 — Pascal's Triangle](0118-PascalsTriangle.java) | Build each row from the previous row | O(r²) | O(r²) output |
| [221 — Maximal Square](0221-MaximalSquare.java) | Rolling-row DP | O(rc) | O(c) |
| [57 — Insert Interval](0057-InsertInterval.java) | Single-pass interval merge | O(n) | O(n) output |
| [253 — Meeting Rooms II](0253-MeetingRoomsII.java) | Min-heap of active meeting end times | O(n log n) | O(n) |
| [337 — House Robber III](0337-HouseRobberIII.java) | Postorder take/skip tree states | O(n) | O(h) |
| [406 — Queue Reconstruction by Height](0406-QueueReconstructionByHeight.java) | Deterministic sort and indexed insertion | O(n²) | O(n) |
| [647 — Palindromic Substrings](0647-PalindromicSubstrings.java) | Expand around odd/even centers | O(n²) | O(1) |
| [918 — Maximum Sum Circular Subarray](0918-MaximumSumCircularSubarray.java) | Maximum and minimum Kadane passes | O(n) | O(1) |

## Reproduce a check

Use JDK 17 or newer. For example:

```sh
javac 0918-MaximumSumCircularSubarray.java
java MaximumSumCircularSubarray
```

Each class prints `PASS` if its included regression examples succeed.
Run the complete repository verifier from the root:

```sh
python scripts/verify_java.py
```

## Important implementation details

- **Maximal Square** stores only the current DP row and preserves the previous diagonal.
- **Insert Interval** clones source intervals and never mutates caller-owned arrays.
- **Meeting Rooms II** releases rooms whose end time is less than or equal to the next start.
- **House Robber III** returns both take and skip states for every node.
- **Maximum Sum Circular Subarray** returns ordinary Kadane's result for all-negative inputs instead of selecting an empty wraparound range.

The embedded checks cover representative boundaries; they are not a substitute for exhaustive verification on arbitrary inputs.
