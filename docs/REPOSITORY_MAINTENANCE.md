# Repository Maintenance Standards

## Folder and file conventions

- Keep each problem in one canonical folder named with its zero-padded LeetCode ID and readable title, for example `0020-Valid-Parentheses`.
- Keep LeetCode submissions in `Solution.java` unless the platform requires a named design class.
- Use `README.md` for problem-specific intuition and complexity; use the shared solution template for consistency.
- Keep fundamental Java exercises clearly labeled as fundamentals rather than assigning them fabricated LeetCode IDs.
- Do not commit `.class`, build output, local IDE state, credentials, or environment files.

## Documentation quality

- Use consistent heading levels, relative links, and accurate problem counts.
- Link to the canonical problem page rather than copying the full problem statement.
- Record only implementations and tests that actually exist.
- Keep topic indexes ordered by the learning roadmap and ensure every listed path exists.

## Change review

- Make a focused branch for a cohesive improvement.
- Use Conventional Commit messages with an accurate scope.
- Run repository validation and Java checks before requesting review.
- Review the diff for accidental moves, duplicates, encoding damage, and generated files.
- State which checks actually ran; do not claim unexecuted checks passed.

## Contribution integrity

A meaningful commit should improve code, tests, documentation, or repository usability. Do not split one edit into trivial commits or rewrite historical dates to change the contribution graph.
