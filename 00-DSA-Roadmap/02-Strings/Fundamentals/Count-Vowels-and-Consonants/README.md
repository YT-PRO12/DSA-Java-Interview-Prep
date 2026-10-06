# Count Vowels and Consonants

## Problem

Given a string, count the number of vowels and consonants present in it.

Ignore spaces, digits, and special characters.

## Approach

Traverse the string character by character.

Convert the string to lowercase so uppercase and lowercase letters can be handled in the same way.

For each character:

- Check whether it is a letter.
- If it is `a`, `e`, `i`, `o`, or `u`, increase the vowel count.
- Otherwise, increase the consonant count.

## Example

Input:

Hello World

Output:

Vowels: 3
Consonants: 7

## Complexity

- Time Complexity: O(n)
- Space Complexity: O(1)

## Interview Pattern

String Traversal / Character Processing
