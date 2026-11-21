import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** LeetCode 210: Course Schedule II.
 * Indegree-zero courses are available without prerequisites.
 * Time O(V+E), auxiliary space O(V+E).
 */
class CourseScheduleII {
    static int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) graph.add(new ArrayList<>());
        int[] degree = new int[numCourses];
        for (int[] pair : prerequisites) {
            graph.get(pair[1]).add(pair[0]);
            degree[pair[0]]++;
        }
        ArrayDeque<Integer> ready = new ArrayDeque<>();
        for (int i = 0; i < numCourses; i++)
            if (degree[i] == 0) ready.add(i);
        int[] result = new int[numCourses];
        int used = 0;
        while (!ready.isEmpty()) {
            int course = ready.remove();
            result[used++] = course;
            for (int dependent : graph.get(course))
                if (--degree[dependent] == 0) ready.add(dependent);
        }
        return used == numCourses ? result : new int[0];
    }
    private static void check(boolean good) {
        if (!good) throw new AssertionError("Course order regression");
    }
    public static void main(String[] args) {
        check(Arrays.equals(findOrder(4, new int[][]{{1,0},{2,0},{3,1},{3,2}}),
                           new int[]{0,1,2,3}));
        check(findOrder(2, new int[][]{{0,1},{1,0}}).length == 0);
        check(Arrays.equals(findOrder(1, new int[0][]), new int[]{0}));
        check(findOrder(0, new int[0][]).length == 0);
        System.out.println("PASS");
    }
}
