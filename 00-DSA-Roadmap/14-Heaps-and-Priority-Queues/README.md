# Heaps and Priority Queues

[Roadmap](../README.md) · [Repository guide](../../README.md)

Use a heap when the next smallest or largest item changes as work arrives or is consumed.

## Concepts Covered

- Java min-heaps and max-heaps
- Bounded heaps for top K
- Merging sorted streams
- Scheduling frequent tasks with cooldowns

## Problem Index

| # | LeetCode | Problem | Difficulty | Pattern | Solution |
|---:|---:|---|---|---|---|
| 1 | 23 | [Merge k Sorted Lists](https://leetcode.com/problems/merge-k-sorted-lists/) | Hard | K-way merge | [Java](0023-Merge-k-Sorted-Lists/Solution.java) |
| 2 | 215 | [Kth Largest Element in an Array](https://leetcode.com/problems/kth-largest-element-in-an-array/) | Medium | Bounded min-heap | [Java](0215-Kth-Largest-Element-in-an-Array/Solution.java) |
| 3 | 621 | [Task Scheduler](https://leetcode.com/problems/task-scheduler/) | Medium | Priority scheduling with cooldown | [Java](0621-Task-Scheduler/Solution.java) |

## Fundamentals

| Exercise | Focus | Implementation |
|---|---|---|
| [Priority Queue Basics](Fundamentals/Priority-Queue-Basics/README.md) | Priority Queue Basics | [Java](Fundamentals/Priority-Queue-Basics/PriorityQueueBasics.java) |

## Learning Progression

1. PriorityQueue operations
2. Top K
3. K-way merging
4. Priority scheduling

## Interview Essentials

- PriorityQueue iteration is not sorted; repeatedly poll for priority order.
- A min-heap of size k retains the k largest values.
- Use comparator helpers to avoid subtraction overflow.
- For cooldown scheduling, do not reinsert a task until its current cycle ends.

## Learning Outcomes

Select heap direction, bound heap size, and express the cost in terms of the active frontier.

## Related Practice

- [23. Merge k Sorted Lists](0023-Merge-k-Sorted-Lists)
- [215. Kth Largest Element in an Array](0215-Kth-Largest-Element-in-an-Array)
- [621. Task Scheduler](0621-Task-Scheduler)
- [239. Sliding Window Maximum](../07-Sliding-Window/0239-Sliding-Window-Maximum)

Counts reflect files in this repository, not verified LeetCode acceptances. See the [validation report](../../docs/VALIDATION.md) for the verification scope.
