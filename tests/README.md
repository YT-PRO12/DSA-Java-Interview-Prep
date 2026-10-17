# Java Verification

From the repository root:

```bash
python scripts/verify_java.py
```

Requires Python 3.10+ and JDK 17+. Set `JAVA_HOME` or put `javac` and `java` on PATH. Each roadmap source is copied into a temporary directory and compiled alone, avoiding collisions among classes named `Solution` and among preserved demo variants. Temporary classes are automatically removed.

- All roadmap Java files are compiled.
- Sources registered in [cases.json](cases.json) run their Java assertion harness.
- Any source with `public static void main` also runs as a smoke test; successful execution alone does not prove correctness.
- [TreeNode.java](support/TreeNode.java) and [ListNode.java](support/ListNode.java) are local equivalents of platform-provided types, used only when needed.

Run the newly prepared examples only with `python scripts/verify_java.py --new-only`. Use `--jobs 2` to reduce simultaneous compiler processes.

The 28 regression suites cover arithmetic boundaries, bit positions, sorting versus `Arrays.sort`, prefix-range sums, pointer partitions, recursion outputs, combinatorial invariants, a known Sudoku solution, exhaustive small interval/boat oracles, heap order, top K, merge order, and an independent scheduler bound.

These tests do not submit to LeetCode or establish online acceptance. Existing algorithms are preserved; their compilation and demo checks are not exhaustive regression coverage. Stateful preserved tree examples should be instantiated afresh for each independent invocation.


## Regression test design standards

- Cover normal behavior and important boundaries: empty and singleton inputs, duplicate values, and lower/upper insertion positions where applicable.
- Keep assertions deterministic and independent of console output.
- Keep each harness isolated to its matching source; avoid shared mutable state.
- Preserve the original LeetCode method signature and put assertions in `tests/cases/`.
- Register new cases in `cases.json` with repository-relative paths.

GitHub Actions runs repository validation and Java compilation/regression checks on pushes and pull requests.
