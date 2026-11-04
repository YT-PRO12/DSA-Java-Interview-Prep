# Divide Two Integers — LeetCode 29

[Problem](https://leetcode.com/problems/divide-two-integers/)

The 32-bit minimum integer cannot be negated safely as an `int` because its magnitude is one greater than `Integer.MAX_VALUE`. Promote to `long` first. Handle the single overflowing quotient `MIN_VALUE / -1` by returning `MAX_VALUE`.

## Doubling approach

Use positive `long` magnitudes for dividend and divisor. Repeatedly subtract the largest doubled divisor that fits the remaining dividend and add the same power of two to the quotient. Doubling uses left shifts, not multiplication.

```java
class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        long remaining = Math.abs((long) dividend);
        long divisorAbs = Math.abs((long) divisor);
        long quotient = 0;

        while (remaining >= divisorAbs) {
            long part = divisorAbs;
            long count = 1;
            while ((part << 1) <= remaining) {
                part <<= 1;
                count <<= 1;
            }
            remaining -= part;
            quotient += count;
        }

        if ((dividend < 0) ^ (divisor < 0)) quotient = -quotient;
        return (int) quotient;
    }
}
```

Example: `10 / 3`: subtract 6 (count 2), then 3 (count 1), remainder 1, quotient 3. For `7 / -3`, the result is -2, truncated toward zero.

Time O(log² |dividend|) with the nested doubling loops; extra space O(1). The LeetCode problem guarantees a nonzero divisor.
