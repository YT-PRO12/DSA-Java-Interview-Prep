# Interview Solution Review Checklist

Use this checklist after solving a problem and before marking the solution as reviewed. It complements the topic READMEs; it does not imply that a LeetCode submission was accepted.

## Problem understanding
- [ ] Restate the input, output, constraints, and required behavior.
- [ ] Identify edge cases before coding.
- [ ] Explain the brute-force approach and its complexity.
- [ ] Explain why the selected pattern improves on the baseline.

## Correctness
- [ ] Handle empty and minimum-size inputs where permitted.
- [ ] Check duplicates, negative values, and boundary values when relevant.
- [ ] Confirm loop bounds and index access.
- [ ] Check integer overflow risks and use wider types where required.
- [ ] Verify the solution against representative examples and adversarial cases.

## Complexity and Java
- [ ] State time complexity and auxiliary space complexity separately.
- [ ] Explain the role of each collection or data structure.
- [ ] Use the exact method signature expected by the problem.
- [ ] Remove debug output and unnecessary code.
- [ ] Keep the implementation readable enough to explain aloud.

## Review record
Record the following in personal notes or a PR description:

| Field | Record |
|---|---|
| Problem and pattern | |
| Key invariant or insight | |
| Edge case that caught a bug | |
| Time complexity | |
| Auxiliary space | |
| Follow-up question | |

## Evidence standard

Use distinct labels for **implemented**, **compiled/tested locally**, and **accepted on LeetCode**. Only claim acceptance when the actual submission result confirms it. A passing local example is not proof that every judge case passes.
