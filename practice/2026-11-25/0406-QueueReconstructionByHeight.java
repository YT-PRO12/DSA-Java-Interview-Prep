import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** LeetCode 406: Queue Reconstruction by Height. O(n^2) time and O(n) space. */
class QueueReconstructionByHeight {
    static int[][] reconstructQueue(int[][] people) {
        int[][] ordered = new int[people.length][];
        for (int i = 0; i < people.length; i++) {
            if (people[i] == null || people[i].length != 2 || people[i][0] < 0 || people[i][1] < 0)
                throw new IllegalArgumentException("Invalid person");
            ordered[i] = people[i].clone();
        }
        Arrays.sort(ordered, (a, b) -> {
            int heightOrder = Integer.compare(b[0], a[0]);
            return heightOrder != 0 ? heightOrder : Integer.compare(a[1], b[1]);
        });
        List<int[]> queue = new ArrayList<>();
        for (int[] person : ordered) {
            if (person[1] > queue.size()) throw new IllegalArgumentException("Inconsistent queue constraints");
            queue.add(person[1], person);
        }
        return queue.toArray(new int[0][]);
    }
    private static void check(boolean ok) {
        if (!ok) throw new AssertionError("Queue reconstruction regression");
    }
    public static void main(String[] args) {
        check(Arrays.deepEquals(reconstructQueue(new int[][]{
            {7,0},{4,4},{7,1},{5,0},{6,1},{5,2}}),
            new int[][]{{5,0},{7,0},{5,2},{6,1},{4,4},{7,1}}));
        check(Arrays.deepEquals(reconstructQueue(new int[][]{{6,0}}), new int[][]{{6,0}}));
        check(reconstructQueue(new int[0][2]).length == 0);
        System.out.println("PASS");
    }
}
