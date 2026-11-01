# Bulls and Cows — LeetCode 299

A bull is a digit that matches at the same index. A cow is a non-bull digit in the guess that can match a remaining non-bull digit in the secret at a different position.

Use two passes:

1. Count bulls where `secret.charAt(i) == guess.charAt(i)`.
2. At unequal positions, count each digit (0–9) separately in `secretCount` and `guessCount`; sum the minimum count for each digit.

Example: secret = 1807, guess = 7810.

Position 1 has the digit 8 in both strings, so bulls = 1. Remaining unmatched secret digits are 1, 0, 7; unmatched guess digits are 7, 1, 0. Thus cows = 3 and the hint is `1A3B`.

Complexity: O(n) time and O(1) auxiliary space, as there are exactly 10 possible digits. Never include bulls in the frequency counts or duplicates will be double-counted.
