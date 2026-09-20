# Compare Version Numbers

## Problem

Compare two version number strings.

Return:

- `-1` if version1 is smaller.
- `1` if version1 is greater.
- `0` if both are equal.

## Approach

Split both versions using the dot separator.

Convert every revision into an integer.

Compare corresponding revisions.

If one version has fewer revisions, treat the missing revisions as zero.

Leading zeroes are automatically ignored when converting to integers.

## Example

version1:

1.01

version2:

1.001

Output:

0

## Complexity

- Time Complexity: O(n + m)
- Space Complexity: O(n + m)

## Interview Pattern

String Parsing / Simulation
