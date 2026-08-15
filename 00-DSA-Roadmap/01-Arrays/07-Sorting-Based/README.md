Sorting-Based Pattern
Overview

The Sorting-Based Pattern is used when sorting an array can simplify the problem and make it easier to identify relationships between elements.

Sorting helps organize elements so that problems involving duplicates, ordering, intervals, merging, and rearrangement can be solved efficiently.

Problems Covered
Sort 0s, 1s and 2s
Merge Sorted Arrays
Merge Intervals
Next Permutation
Pattern Recognition

Consider the Sorting-Based Pattern when:

The order of elements is important.
Sorting makes comparisons easier.
You need to find duplicates or consecutive elements.
You need to merge overlapping intervals.
The problem involves arranging elements in a specific order.
Common Techniques
1. Sorting

Use Java's sorting methods when appropriate:

Arrays.sort(nums);
2. Two Pointers

After sorting, two pointers can efficiently process elements from different positions.

3. Interval Sorting

For interval problems, sort intervals by their starting point before merging.

4. In-Place Rearrangement

Some problems can be solved without using extra arrays by rearranging elements directly.

Complexity

Typical sorting-based solutions:

Time: O(n log n)
Space: O(1) to O(n)

The exact complexity depends on the sorting algorithm and the problem.

Key Learning

Sorting can transform an unstructured array into an ordered structure where relationships between elements become easier to identify.

Language: Java
