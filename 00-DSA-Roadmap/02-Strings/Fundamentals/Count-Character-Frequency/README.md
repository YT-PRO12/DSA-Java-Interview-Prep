# Count Character Frequency

## Problem

Given a string, calculate the frequency of every character.

## Approach

Use a HashMap-style frequency table.

For every character:

`map.put(ch, map.getOrDefault(ch, 0) + 1)`

This increases the frequency whenever the character appears.

LinkedHashMap is used so the characters are displayed in their original insertion order.

## Example

Input:

banana

Output:

b -> 1
a -> 3
n -> 2

## Complexity

- Time Complexity: O(n)
- Space Complexity: O(k)

Where `k` is the number of unique characters.

## Interview Pattern

HashMap / Frequency Counting
