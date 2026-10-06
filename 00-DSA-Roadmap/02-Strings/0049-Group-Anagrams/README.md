# Group Anagrams

## Problem

Given an array of strings, group all anagrams together.

## Approach

For every word:

1. Convert the word into a character array.
2. Sort the characters.
3. Use the sorted string as a HashMap key.

Anagrams produce the same sorted key.

For example:

`eat -> aet`

`tea -> aet`

`ate -> aet`

Therefore, they are stored in the same group.

## Example

Input:

["eat", "tea", "tan", "ate", "nat", "bat"]

Output:

[[eat, tea, ate], [tan, nat], [bat]]

## Complexity

For `n` strings of average length `k`:

- Time Complexity: O(n * k log k)
- Space Complexity: O(n * k)

## Interview Pattern

HashMap + Sorting
