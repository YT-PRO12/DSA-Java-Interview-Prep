# Verification Report

**Audit date:** 2026-10-09
**Environment:** Python 3.12; OpenJDK 17.0.20.1
**Scope:** The roadmap restructuring and 28 newly prepared Java examples.

## Commands

Run from the repository root:

```bash
python scripts/build_readmes.py --check
python scripts/validate_repository.py --preservation
python scripts/verify_java.py
```

## Results

| Check | Result |
|---|---|
| Original inventory | 349 original files accounted for |
| Original Java | All 151 source files byte-identical after relocation |
| Original outputs | Preserved byte-identically, including historical UTF-16 files |
| Topic structure | 16 nonempty topics in the requested order |
| Canonical problem directories | 132 distinct IDs; no duplicate canonical homes |
| Fundamentals | 40 runnable teaching exercises, counted separately |
| Java compilation | 179 / 179 source files compiled in isolation |
| New regression suites | 28 / 28 passed |
| Runnable demo smoke tests | 110 / 110 completed successfully |
| Navigation | Generated counts/indexes agree with metadata and actual files |
| Markdown | All checked relative file/directory links and local heading anchors resolve |
| Artifacts | No class files, archives, or generated build output tracked |
| History | New commits descend from baseline; original history retained |

## Regression Evidence

- Math: signed values, zero, `Integer.MIN_VALUE`, independent BigInteger GCD, divisor enumeration, and bit boundaries.
- Sorting: all six algorithms compared with `Arrays.sort`; exhaustive small ternary inputs for Sort Colors.
- Prefix/pointers: empty and large sums, all ranges, brute-force pair existence, partition invariants and element preservation.
- Recursion/backtracking: empty bases, output sets, factorial/Catalan counts, known N-Queens counts, diagonal validity, exact Sudoku result, combination enumeration, and exponent extremes.
- Greedy: exhaustive subset oracles for small interval and boat instances.
- Heaps: priority order, top K versus sorted arrays, merged list order, and task scheduling versus the independent frequency bound.

The automated GitHub workflow runs structural validation and the Java verifier on pushes and pull requests. Its current result is shown on GitHub; the local evidence above does not substitute for an observed remote check result.

## Limits

Compilation establishes syntactic/type compatibility with the supplied test node definitions. Running an existing main method is a smoke test, not exhaustive proof of the algorithm. Original algorithms were not rewritten or comprehensively regression-tested.

The original stateful Diameter, Mode, and Minimum Difference tree solutions retain state across method calls; use a new Solution object for each independent invocation. Some fundamentals intentionally assume small or nonempty inputs, as in their demos. Recursive examples can overflow the call stack on sufficiently deep inputs.

Official ID/title/difficulty data was checked against the public LeetCode catalog. Existing standalone adaptations can need platform signature changes. No code was submitted to LeetCode and no acceptance status was inferred.

The optional preservation check compares against this audit’s historical fingerprints. A later intentional code fix may change those fingerprints; keep the manifest as evidence and explain the change in that later PR.
