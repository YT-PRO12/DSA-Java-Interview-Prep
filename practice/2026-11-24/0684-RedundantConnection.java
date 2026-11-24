import java.util.Arrays;

/** Union by size and iterative path compression detect the cycle-closing edge.
 * O(n alpha(n)) amortized time and O(n) space.
 */
class RedundantConnection {
    static int[] findRedundantConnection(int[][] edges) {
        int[] parent = new int[edges.length+1], size = new int[parent.length];
        for (int i = 0; i < parent.length; i++) { parent[i] = i; size[i] = 1; }
        for (int[] edge : edges) {
            int a = root(parent,edge[0]), b = root(parent,edge[1]);
            if (a == b) return edge.clone();
            if (size[a] < size[b]) { int tmp = a; a = b; b = tmp; }
            parent[b] = a;
            size[a] += size[b];
        }
        return new int[0];
    }
    private static int root(int[] parent, int x) {
        while (x != parent[x]) {
            parent[x] = parent[parent[x]];
            x = parent[x];
        }
        return x;
    }
    public static void main(String[] args) {
        if (!Arrays.equals(findRedundantConnection(new int[][]{{1,2},{1,3},{2,3}}),new int[]{2,3})
                || !Arrays.equals(findRedundantConnection(new int[][]{{1,2},{2,3},{3,4},{1,4},{1,5}}),new int[]{1,4}))
            throw new AssertionError("Union-find regression");
        System.out.println("PASS");
    }
}
