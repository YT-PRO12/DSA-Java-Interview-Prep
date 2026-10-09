# Linked List

[Roadmap](../README.md) · [Repository guide](../../README.md)

Practice pointer changes with explicit ownership of next links, then build toward cycles, merges, and reordering.

## Concepts Covered

- Node creation and insertion/deletion
- Dummy nodes and head changes
- Fast/slow cycle and middle patterns
- Reversal, merging, copying and reordering

## Problem Index

| # | LeetCode | Problem | Difficulty | Pattern | Solution |
|---:|---:|---|---|---|---|
| 1 | 2 | [Add Two Numbers](https://leetcode.com/problems/add-two-numbers/) | Medium | Linked List + Carry Simulation | [Java](0002-Add-Two-Numbers/AddTwoNumbers.java) |
| 2 | 19 | [Remove Nth Node From End of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list/) | Medium | Two Pointers and Dummy Node | [Java](0019-Remove-Nth-Node-From-End-of-List/RemoveNthNodeFromEnd.java) |
| 3 | 21 | [Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/) | Easy | Two Pointers and Dummy Node | [Java](0021-Merge-Two-Sorted-Lists/MergeTwoSortedLinkedLists.java) |
| 4 | 24 | [Swap Nodes in Pairs](https://leetcode.com/problems/swap-nodes-in-pairs/) | Medium | Dummy Node + Pointer Manipulation | [Java](0024-Swap-Nodes-in-Pairs/SwapNodesInPairs.java) |
| 5 | 25 | [Reverse Nodes in k-Group](https://leetcode.com/problems/reverse-nodes-in-k-group/) | Hard | Linked List Reversal + Recursion | [Java](0025-Reverse-Nodes-in-k-Group/ReverseNodesInKGroup.java) |
| 6 | 61 | [Rotate List](https://leetcode.com/problems/rotate-list/) | Medium | Circular Linking + Pointer Manipulation | [Java](0061-Rotate-List/RotateLinkedList.java) |
| 7 | 138 | [Copy List with Random Pointer](https://leetcode.com/problems/copy-list-with-random-pointer/) | Medium | Node Interleaving + Pointer Manipulation | [Java](0138-Copy-List-with-Random-Pointer/CopyListWithRandomPointer.java) |
| 8 | 141 | [Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/) | Easy | Floyd's Cycle Detection / Slow and Fast Pointers | [Java](0141-Linked-List-Cycle/DetectCycleInLinkedList.java) |
| 9 | 142 | [Linked List Cycle II](https://leetcode.com/problems/linked-list-cycle-ii/) | Medium | Floyd's Cycle Detection | [Java](0142-Linked-List-Cycle-II/FindStartOfCycle.java) |
| 10 | 143 | [Reorder List](https://leetcode.com/problems/reorder-list/) | Medium | Slow/Fast Pointers + Reversal + Merge | [Java](0143-Reorder-List/ReorderLinkedList.java) |
| 11 | 148 | [Sort List](https://leetcode.com/problems/sort-list/) | Medium | Merge Sort / Divide and Conquer | [Java](0148-Sort-List/SortLinkedList.java) |
| 12 | 160 | [Intersection of Two Linked Lists](https://leetcode.com/problems/intersection-of-two-linked-lists/) | Easy | Two Pointers | [Java](0160-Intersection-of-Two-Linked-Lists/IntersectionOfTwoLinkedLists.java) |
| 13 | 206 | [Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/) | Easy | Linked List Pointer Reversal | [Java](0206-Reverse-Linked-List/ReverseLinkedList.java) |
| 14 | 234 | [Palindrome Linked List](https://leetcode.com/problems/palindrome-linked-list/) | Easy | Slow/Fast Pointers + Linked List Reversal | [Java](0234-Palindrome-Linked-List/CheckPalindromeLinkedList.java) |
| 15 | 237 | [Delete Node in a Linked List](https://leetcode.com/problems/delete-node-in-a-linked-list/) | Medium | Linked List In-Place Pointer Manipulation | [Java](0237-Delete-Node-in-a-Linked-List/DeleteNodeWithoutHead.java) |
| 16 | 328 | [Odd Even Linked List](https://leetcode.com/problems/odd-even-linked-list/) | Medium | Linked List Pointer Manipulation | [Java](0328-Odd-Even-Linked-List/OddEvenLinkedList.java) |
| 17 | 876 | [Middle of the Linked List](https://leetcode.com/problems/middle-of-the-linked-list/) | Easy | Slow and Fast Pointers | [Java](0876-Middle-of-the-Linked-List/FindMiddleOfLinkedList.java) |

## Fundamentals

| Exercise | Focus | Implementation |
|---|---|---|
| [Create and Traverse Linked List](Fundamentals/Create-and-Traverse-Linked-List/README.md) | Linked List Traversal | [Java](Fundamentals/Create-and-Traverse-Linked-List/CreateAndTraverseLinkedList.java) |
| [Delete First Node](Fundamentals/Delete-First-Node/README.md) | Linked List Head Manipulation | [Java](Fundamentals/Delete-First-Node/DeleteFirstNode.java) |
| [Delete Last Node](Fundamentals/Delete-Last-Node/README.md) | Linked List Traversal and Pointer Manipulation | [Java](Fundamentals/Delete-Last-Node/DeleteLastNode.java) |
| [Delete at Given Position](Fundamentals/Delete-at-Given-Position/README.md) | Linked List Pointer Manipulation | [Java](Fundamentals/Delete-at-Given-Position/DeleteAtGivenPosition.java) |
| [Find Length of Linked List](Fundamentals/Find-Length-of-Linked-List/README.md) | Linked List Traversal | [Java](Fundamentals/Find-Length-of-Linked-List/FindLengthOfLinkedList.java) |
| [Flatten Multilevel Singly Linked List](Fundamentals/Flatten-Multilevel-Singly-Linked-List/README.md) | Linked List + Recursion | [Java](Fundamentals/Flatten-Multilevel-Singly-Linked-List/FlattenMultilevelLinkedList.java) |
| [Insert at Beginning](Fundamentals/Insert-at-Beginning/README.md) | Linked List Pointer Manipulation | [Java](Fundamentals/Insert-at-Beginning/InsertAtBeginning.java) |
| [Insert at End](Fundamentals/Insert-at-End/README.md) | Linked List Traversal and Pointer Manipulation | [Java](Fundamentals/Insert-at-End/InsertAtEnd.java) |
| [Insert at Given Position](Fundamentals/Insert-at-Given-Position/README.md) | Linked List Pointer Manipulation | [Java](Fundamentals/Insert-at-Given-Position/InsertAtGivenPosition.java) |
| [Merge Sort on Linked List](Fundamentals/Merge-Sort-on-Linked-List/README.md) | Divide and Conquer / Merge Sort | [Java](Fundamentals/Merge-Sort-on-Linked-List/MergeSortOnLinkedList.java) |
| [Remove Cycle from Linked List](Fundamentals/Remove-Cycle-from-Linked-List/README.md) | Floyd's Cycle Detection and Pointer Manipulation | [Java](Fundamentals/Remove-Cycle-from-Linked-List/RemoveCycleFromLinkedList.java) |
| [Search in Linked List](Fundamentals/Search-in-Linked-List/README.md) | Linked List Traversal | [Java](Fundamentals/Search-in-Linked-List/SearchInLinkedList.java) |
| [Zig Zag Linked List](Fundamentals/Zig-Zag-Linked-List/README.md) | Midpoint + Reversal + Alternating Merge | [Java](Fundamentals/Zig-Zag-Linked-List/ZigZagLinkedList.java) |

## Learning Progression

1. Create and traverse
2. Insert and delete
3. Reverse and detect cycles
4. Merge and reorder

## Interview Essentials

- Save the next pointer before overwriting a link.
- Distinguish node identity from equal stored values.
- Test empty, singleton, even-length and odd-length structures where allowed.
- Original demos use local Node types; adapt to LeetCode’s node signature when submitting.

## Learning Outcomes

Draw pointer changes, handle head replacement, and explain O(1) pointer storage versus recursive stack costs.

## Related Practice

- [23. Merge k Sorted Lists](../14-Heaps-and-Priority-Queues/0023-Merge-k-Sorted-Lists)
- [109. Convert Sorted List to Binary Search Tree](../16-Binary-Search-Trees/0109-Convert-Sorted-List-to-Binary-Search-Tree)
- [141. Linked List Cycle](0141-Linked-List-Cycle)
- [142. Linked List Cycle II](0142-Linked-List-Cycle-II)

Counts reflect files in this repository, not verified LeetCode acceptances. See the [validation report](../../docs/VALIDATION.md) for the verification scope.
