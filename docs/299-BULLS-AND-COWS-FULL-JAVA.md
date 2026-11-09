# 299. Bulls and Cows — Java Frequency Counting

[LeetCode 299](https://leetcode.com/problems/bulls-and-cows/)

A **bull** matches both digit and position. A **cow** is a matching digit at a different position, after removing bulls. Duplicates must not be counted more than their available occurrences.

## Algorithm

First count every exact positional match as a bull. For the remaining mismatched positions, store digit frequencies in two arrays of length ten. The cows equal the sum of `min(secretCount[d], guessCount[d])` across all digits.

```java
class Solution {
    public String getHint(String secret, String guess) {
        int bulls = 0;
        int[] secretCount = new int[10];
        int[] guessCount = new int[10];

        for (int i = 0; i < secret.length(); i++) {
            char a = secret.charAt(i);
            char b = guess.charAt(i);
            if (a == b) {
                bulls++;
            } else {
                secretCount[a - '0']++;
                guessCount[b - '0']++;
            }
        }

        int cows = 0;
        for (int d = 0; d < 10; d++) {
            cows += Math.min(secretCount[d], guessCount[d]);
        }
        return bulls + "A" + cows + "B";
    }
}
```

## Dry run

Secret `"1123"`, guess `"0111"`: at index 1, both contain `1`, giving one bull. The mismatched digits in the secret are `1, 2, 3`; in the guess they are `0, 1, 1`. Only one unmatched `1` is available in the secret, so the answer is **`1A1B`**, not `1A2B`.

Secret `"1807"`, guess `"7810"`: one bull at digit `8`, three cows among the unmatched digits → `1A3B`.

**Complexity:** O(n) time, O(1) space (two arrays of length 10). The problem guarantees equal-length strings consisting of decimal digits.
