# Contributing

Keep the roadmap useful for learning and technical interviews. A small, tested example with a clear explanation is more valuable than a large unverified upload.

## Before Editing

1. Start a working branch from the latest `main`.
2. Read the topic index and the existing implementation before replacing anything.
3. Keep one canonical folder per official LeetCode ID. Cross-link other patterns.
4. Preserve existing notes, outputs, and useful alternate implementations.

## Problem and File Standards

- Use Java and a four-digit official ID: `0001-Two-Sum/`.
- Verify the ID, title, difficulty, and contract against the official problem.
- General exercises belong in `Fundamentals/Descriptive-Name/`.
- New platform solutions should use the required class and method signatures.
- Give a fundamental a runnable `main`, examples, contract, and accurate complexity.
- Explain assumptions, mutations, overflow handling, and recursion stack costs.
- Use UTF-8 for new text. Keep generated `.class` files out of Git.
- Label prepared implementations honestly; only claim acceptance with actual submission evidence.

## Documentation and Checks

For a new official problem, update `docs/catalog.json` with verified metadata and its real source path. Add related practice links or concepts through `docs/topics.json`. Then regenerate navigation:

```bash
python scripts/build_readmes.py
python scripts/validate_repository.py
python scripts/verify_java.py
```

Python 3.10+ and JDK 17+ are required for verification. On Windows, `py` can replace `python` if that is the configured launcher. The test runner honors `JAVA_HOME` and compiles each implementation in a temporary directory.

Add a focused Java regression suite under `tests/cases/` and register it in `tests/cases.json`. Use known results, invariants, or an independent brute-force oracle. Include meaningful boundary cases. Do not treat a demo printing output as an assertion-based correctness test.

`python scripts/validate_repository.py --preservation` additionally checks this restructuring’s original source/output fingerprints. It is a historical audit; future intentional algorithm fixes may change those bytes and should explain that difference in their PR. Keep the baseline manifest intact.

## Commits and Pull Requests

Use meaningful conventional commits, for example:

- `feat(backtracking): add a tested combination search`
- `fix(trees): reset traversal state between calls`
- `docs(hashing): explain repeated prefix counts`
- `test(dsa): cover duplicate and boundary cases`

Keep bulk relocations together. Separate substantive features, documentation, and validation where useful. Preserve published history and its real timestamps; never backdate or manufacture commits for the contribution chart.

A PR should explain the problem, resulting behavior, preserved content, new examples, commands actually run, and remaining limitations. Merge after available checks pass. Do not force-push or rewrite `main`.
