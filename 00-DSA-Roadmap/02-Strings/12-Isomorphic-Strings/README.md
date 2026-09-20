# Isomorphic Strings

## Problem

Determine whether two strings are isomorphic.

Characters from the first string must map consistently and uniquely to characters in the second string.

## Approach

Use two HashMaps.

One stores mappings from `s` to `t`.

The second stores mappings from `t` to `s`.

This ensures a one-to-one mapping.

## Example

egg
add

Output:

true

## Complexity

- Time Complexity: O(n)
- Space Complexity: O(k)

## Interview Pattern

HashMap / Character Mapping
