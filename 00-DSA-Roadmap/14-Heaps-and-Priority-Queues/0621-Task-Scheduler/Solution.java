import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] frequency = new int[26];
        for (char task : tasks) frequency[task - 'A']++;
        PriorityQueue<Integer> ready = new PriorityQueue<>(Comparator.reverseOrder());
        for (int count : frequency) if (count > 0) ready.offer(count);
        int time = 0;
        while (!ready.isEmpty()) {
            int[] deferred = new int[26];
            int used = 0;
            for (int slot = 0; slot <= n && !ready.isEmpty(); slot++) {
                int remaining = ready.remove() - 1;
                if (remaining > 0) deferred[used] = remaining;
                used++;
            }
            for (int i = 0; i < used; i++) if (deferred[i] > 0) ready.offer(deferred[i]);
            time += ready.isEmpty() ? used : n + 1;
        }
        return time;
    }
}
