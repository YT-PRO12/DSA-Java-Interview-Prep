# Matrix Traversal Pattern Review

## Spiral traversal

Maintain four inclusive boundaries around the unvisited rectangle: `top`, `bottom`, `left`, and `right`.

1. Traverse the top row left to right; increment `top`.
2. Traverse the right column top to bottom; decrement `right`.
3. If rows remain, traverse the bottom row right to left; decrement `bottom`.
4. If columns remain, traverse the left column bottom to top; increment `left`.

Guard the reverse traversals: the remaining rectangle can collapse to one row or one column, and without the checks cells may be visited twice.

## Complexity

For an m-by-n matrix, time is O(mn), since every cell is visited once. Auxiliary space is O(1) beyond the returned output list.

## Boundary checklist

- [ ] Single cell, single row, and single column
- [ ] Two rows and several columns
- [ ] Several rows and two columns
- [ ] Rectangular matrix with unequal dimensions
- [ ] Output contains exactly m × n elements

## Interview explanation

“I keep four boundaries around the unvisited rectangle. After traversing each side, I move that boundary inward. I guard the bottom and left traversals because the remaining rectangle may have collapsed to a single row or column.”

Use this as a learning aid alongside the official problem implementation; it does not replace testing the Java solution.