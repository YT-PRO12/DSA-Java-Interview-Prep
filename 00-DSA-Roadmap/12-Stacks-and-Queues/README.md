# Stacks and Queues

[Roadmap](../README.md) · [Repository guide](../../README.md)

Use LIFO and FIFO state for parsing, simulation, circular buffers, and monotonic structures.

## Concepts Covered

- Stack matching and expression evaluation
- Queue simulation and amortized transfers
- Circular queue and deque design
- Monotonic stack and deque patterns

## Problem Index

| # | LeetCode | Problem | Difficulty | Pattern | Solution |
|---:|---:|---|---|---|---|
| 1 | 20 | [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/) | Easy | Stack matching | [Java](0020-Valid-Parentheses/Solution.java) |
| 2 | 71 | [Simplify Path](https://leetcode.com/problems/simplify-path/) | Medium | Path component stack | [Java](0071-Simplify-Path/Solution.java) |
| 3 | 84 | [Largest Rectangle in Histogram](https://leetcode.com/problems/largest-rectangle-in-histogram/) | Hard | Monotonic histogram stack | [Java](0084-Largest-Rectangle-in-Histogram/Solution.java) |
| 4 | 150 | [Evaluate Reverse Polish Notation](https://leetcode.com/problems/evaluate-reverse-polish-notation/) | Medium | Postfix expression evaluation | [Java](0150-Evaluate-Reverse-Polish-Notation/Solution.java) |
| 5 | 155 | [Min Stack](https://leetcode.com/problems/min-stack/) | Medium | Two-stack minimum | [Java](0155-Min-Stack/Solution.java) |
| 6 | 225 | [Implement Stack using Queues](https://leetcode.com/problems/implement-stack-using-queues/) | Easy | Queue rotation | [Java](0225-Implement-Stack-using-Queues/Solution.java) |
| 7 | 232 | [Implement Queue using Stacks](https://leetcode.com/problems/implement-queue-using-stacks/) | Easy | Amortized two-stack queue | [Java](0232-Implement-Queue-using-Stacks/Solution.java) |
| 8 | 394 | [Decode String](https://leetcode.com/problems/decode-string/) | Medium | Nested stack parsing | [Java](0394-Decode-String/Solution.java) |
| 9 | 496 | [Next Greater Element I](https://leetcode.com/problems/next-greater-element-i/) | Easy | Monotonic stack | [Java](0496-Next-Greater-Element-I/Solution.java) |
| 10 | 622 | [Design Circular Queue](https://leetcode.com/problems/design-circular-queue/) | Medium | Circular queue buffer | [Java](0622-Design-Circular-Queue/Solution.java) |
| 11 | 641 | [Design Circular Deque](https://leetcode.com/problems/design-circular-deque/) | Medium | Circular deque buffer | [Java](0641-Design-Circular-Deque/Solution.java) |
| 12 | 739 | [Daily Temperatures](https://leetcode.com/problems/daily-temperatures/) | Medium | Monotonic stack | [Java](0739-Daily-Temperatures/Solution.java) |
| 13 | 901 | [Online Stock Span](https://leetcode.com/problems/online-stock-span/) | Medium | Aggregated monotonic spans | [Java](0901-Online-Stock-Span/Solution.java) |

## Preserved Local Variants

These are original alternatives or runnable demos of an indexed problem. They count as source files, not additional problems.

| LeetCode | Original implementation |
|---:|---|
| 20 | [ValidParentheses.java](0020-Valid-Parentheses/ValidParentheses.java) |
| 394 | [DecodeString.java](0394-Decode-String/DecodeString.java) |

## Pattern Groups

| Group | Start here |
|---|---|
| Matching and parsing | [20](0020-Valid-Parentheses), [71](0071-Simplify-Path), [150](0150-Evaluate-Reverse-Polish-Notation), [394](0394-Decode-String) |
| Stack and queue simulation | [155](0155-Min-Stack), [225](0225-Implement-Stack-using-Queues), [232](0232-Implement-Queue-using-Stacks) |
| Circular buffers | [622](0622-Design-Circular-Queue), [641](0641-Design-Circular-Deque) |
| Monotonic structures | [496](0496-Next-Greater-Element-I), [739](0739-Daily-Temperatures), [901](0901-Online-Stock-Span), [84](0084-Largest-Rectangle-in-Histogram), [239](../07-Sliding-Window/0239-Sliding-Window-Maximum) |

## Learning Progression

1. Matching and parsing
2. Stack/queue simulation
3. Circular buffers
4. Monotonic structures

## Interview Essentials

- For RPN, the first popped operand is the right operand of subtraction or division.
- Distinguish values from indices in monotonic stacks.
- A two-stack queue has amortized O(1) operations, not O(1) for every transfer.
- Each index enters and leaves a monotonic structure at most once, giving O(n) total work.

## Learning Outcomes

Select the right end for each operation, reason about empty/full states, and derive monotonic invariants.

## Related Practice

- [239. Sliding Window Maximum](../07-Sliding-Window/0239-Sliding-Window-Maximum)
- [22. Generate Parentheses](../09-Recursion/0022-Generate-Parentheses)

Counts reflect files in this repository, not verified LeetCode acceptances. See the [validation report](../../docs/VALIDATION.md) for the verification scope.
