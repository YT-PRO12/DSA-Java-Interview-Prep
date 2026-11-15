# 621. Task Scheduler — Count-Based Greedy

[LeetCode 621](https://leetcode.com/problems/task-scheduler/)

Given tasks represented by uppercase letters and a cooldown `n`, find the minimum number of CPU intervals to execute all tasks. Idle intervals are allowed, but each pair of identical tasks must be separated by at least `n` intervals.

## Deriving the formula

Let `maxFrequency` be the largest occurrence count among all task types and `tiedMax` the number of distinct task types reaching that count.

Place one task with the maximum count in each of `maxFrequency - 1` full groups of width `n + 1`. The final group needs `tiedMax` positions for all equally frequent task types.

The resulting lower bound is

```
(maxFrequency - 1) * (n + 1) + tiedMax
```

Other tasks may fill idle slots; when there are enough of them, every interval performs useful work. Therefore the answer is the maximum of this bound and the total number of tasks.

```java
class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] count = new int[26];
        for (char task : tasks) {
            count[task - 'A']++;
        }

        int maxFrequency = 0;
        int tiedMax = 0;

        for (int frequency : count) {
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                tiedMax = 1;
            } else if (frequency == maxFrequency && frequency > 0) {
                tiedMax++;
            }
        }

        int lowerBound = (maxFrequency - 1) * (n + 1) + tiedMax;
        return Math.max(tasks.length, lowerBound);
    }
}
```

## Worked traces

- `tasks = [A,A,A,B,B,B]`, `n = 2`: `maxFrequency=3`, `tiedMax=2`. The bound is `(3-1)×3+2=8`. One optimal schedule is `A B idle A B idle A B`, so **8** intervals.
- `tasks = [A,A,A,B,B,B]`, `n = 0`: all six tasks can run consecutively; result **6**.
- `tasks = [A,A,A,B,B,B,C,C,D,D]`, `n = 2`: bound is 8 but ten tasks exist. A schedule without idle intervals is possible, so the answer is **10**.

**Invariant:** Idle time is forced only when the most frequent task groups cannot be filled by other tasks. A priority queue simulation is also possible but unnecessary when only the minimum total interval count is required.

**Complexity:** O(m + 26) time for `m` tasks; O(26) auxiliary space. The problem guarantees nonempty tasks, uppercase A–Z, and `n >= 0`.
