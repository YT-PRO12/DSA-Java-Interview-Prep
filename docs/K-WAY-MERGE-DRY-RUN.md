# Merge K Sorted Lists (LeetCode 23)

The heap stores **ListNode references**, not their integer values. Each entry represents the smallest not-yet-used node from one sorted list.

Example: `[1→4, 1→3, 2→6]`.

1. Offer heads 1, 1, 2.
2. Poll the first 1; append that node and offer its successor 4.
3. Poll the second 1; append it and offer its successor 3.
4. Poll 2, offer 6.
5. Poll 3, then 4, then 6.

Result: `1→1→2→3→4→6`.

## Key Java operations

```java
PriorityQueue<ListNode> heap =
    new PriorityQueue<>((a, b) -> Integer.compare(a.val, b.val));

for (ListNode head : lists) {
    if (head != null) heap.offer(head);
}
```

When removing a node, save its original `next` reference before reconnecting it into the answer. Use a dummy node and a tail pointer to build the merged list. The queued successor **already exists** in the original input: the algorithm does not invent a new answer node.

For N total nodes and K input lists: `O(N log K)` time, `O(K)` heap space. See [LeetCode 23 Java implementation](../00-DSA-Roadmap/14-Heaps-and-Priority-Queues/0023-Merge-k-Sorted-Lists/Solution.java).
