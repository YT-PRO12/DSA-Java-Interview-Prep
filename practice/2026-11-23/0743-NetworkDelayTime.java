import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

/** LeetCode 743: Network Delay Time.
 * Positive weighted edges permit Dijkstra; long distances avoid overflow
 * in path relaxation. Time O((V+E) log V), space O(V+E).
 */
class NetworkDelayTime {
    static int networkDelayTime(int[][] times, int n, int source) {
        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) graph.add(new ArrayList<>());
        for (int[] edge : times) graph.get(edge[0]).add(new int[]{edge[1], edge[2]});
        long[] distance = new long[n + 1];
        Arrays.fill(distance, Long.MAX_VALUE);
        distance[source] = 0;
        PriorityQueue<long[]> heap =
                new PriorityQueue<>((a, b) -> Long.compare(a[0], b[0]));
        heap.add(new long[]{0, source});
        while (!heap.isEmpty()) {
            long[] current = heap.remove();
            int node = (int) current[1];
            if (current[0] != distance[node]) continue;
            for (int[] edge : graph.get(node)) {
                long candidate = current[0] + edge[1];
                if (candidate < distance[edge[0]]) {
                    distance[edge[0]] = candidate;
                    heap.add(new long[]{candidate, edge[0]});
                }
            }
        }
        long worst = 0;
        for (int node = 1; node <= n; node++) {
            if (distance[node] == Long.MAX_VALUE) return -1;
            worst = Math.max(worst, distance[node]);
        }
        return (int) worst;
    }
    private static void check(boolean ok) {
        if (!ok) throw new AssertionError("Network propagation regression");
    }
    public static void main(String[] args) {
        check(networkDelayTime(new int[][]{{2,1,1},{2,3,1},{3,4,1}}, 4, 2) == 2);
        check(networkDelayTime(new int[][]{{1,2,1}}, 2, 1) == 1);
        check(networkDelayTime(new int[][]{{1,2,1}}, 2, 2) == -1);
        check(networkDelayTime(new int[][]{}, 1, 1) == 0);
        check(networkDelayTime(new int[][]{{1,2,1},{1,3,10},{2,3,2}}, 3, 1) == 3);
        System.out.println("PASS");
    }
}
