# Java Regression Testing Guide

The roadmap contains independent LeetCode-style classes, so regression cases are compiled in isolated temporary directories. This avoids conflicts between repeated class names such as `Solution` and prevents generated `.class` files from polluting problem folders.

## Prerequisites

- JDK 17 or newer
- Python 3.12 or newer

## Run checks locally

From the repository root:

```bash
python scripts/validate_repository.py
python scripts/verify_java.py
```

The repository validator checks structural conventions and links. The Java verifier compiles solutions independently, executes registered assertions, and runs supported demos. Tests are registered in `tests/cases.json`, with one source path paired to one standalone test harness under `tests/cases/`.

## Adding a regression case

1. Add a test file with a unique filename under `tests/cases/`.
2. Test expected results with explicit assertions; include edge cases relevant to the algorithm.
3. Register the source and test paths in `tests/cases.json`.
4. Run the repository validator and Java verifier.
5. Review the diff and report the actual command results in the PR.

Good boundary candidates include empty or singleton inputs where the contract permits them, duplicate values, sorted and reverse-sorted arrays, and lower/upper bounds. Do not change the original LeetCode method signature merely to simplify a test.

## Commit and PR conventions

Use focused Conventional Commit messages such as:

```text
test(binary-search): cover insertion boundaries
test(stack): verify duplicate minimum lifecycle
docs(testing): clarify isolated Java regression workflow
```

Keep one coherent purpose per commit. Do not split a single edit into artificial commits to inflate contribution counts.

## Evidence and limitations

A passing local test demonstrates only the cases executed. CI results should be reported as passed only after the workflow completes successfully. A repository with strong tests still needs human review for algorithmic correctness, readability, and problem constraints.
