import java.util.Arrays;

/** Use one Bellman-Ford layer per permitted flight edge, not in-place updates.
 * O((k+1)*(V+E)) time, O(V) auxiliary space.
 */
class CheapestFlightsWithinKStops {
    static int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        long inf = Long.MAX_VALUE/4;
        long[] distance = new long[n];
        Arrays.fill(distance,inf);
        distance[src] = 0;
        for (int step = 0; step <= k; step++) {
            long[] next = distance.clone();
            for (int[] flight : flights)
                if (distance[flight[0]] != inf)
                    next[flight[1]] = Math.min(next[flight[1]],distance[flight[0]]+flight[2]);
            distance = next;
        }
        return distance[dst] == inf ? -1 : (int) distance[dst];
    }
    public static void main(String[] args) {
        int[][] flights = {{0,1,100},{1,2,100},{0,2,500}};
        if (findCheapestPrice(3,flights,0,2,1) != 200
                || findCheapestPrice(3,flights,0,2,0) != 500
                || findCheapestPrice(3,flights,2,0,2) != -1
                || findCheapestPrice(3,new int[][]{{0,1,1},{1,2,1}},0,2,0) != -1)
            throw new AssertionError("Flight edge budget regression");
        System.out.println("PASS");
    }
}
