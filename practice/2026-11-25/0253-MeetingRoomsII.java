import java.util.Arrays;
import java.util.PriorityQueue;

/** LeetCode 253: Meeting Rooms II. O(n log n) time and O(n) space. */
class MeetingRoomsII {
    static int minMeetingRooms(int[][] intervals) {
        if (intervals.length == 0) return 0;
        int[][] ordered = new int[intervals.length][];
        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i] == null || intervals[i].length != 2 || intervals[i][0] > intervals[i][1])
                throw new IllegalArgumentException("Invalid meeting interval");
            ordered[i] = intervals[i].clone();
        }
        Arrays.sort(ordered, (a, b) -> Integer.compare(a[0], b[0]));
        PriorityQueue<Integer> endTimes = new PriorityQueue<>();
        int maximum = 0;
        for (int[] meeting : ordered) {
            while (!endTimes.isEmpty() && endTimes.peek() <= meeting[0]) endTimes.remove();
            endTimes.add(meeting[1]);
            maximum = Math.max(maximum, endTimes.size());
        }
        return maximum;
    }
    private static void check(boolean ok) {
        if (!ok) throw new AssertionError("Meeting Rooms II regression");
    }
    public static void main(String[] args) {
        check(minMeetingRooms(new int[][]{{0,30},{5,10},{15,20}}) == 2);
        check(minMeetingRooms(new int[][]{{7,10},{2,4}}) == 1);
        check(minMeetingRooms(new int[][]{{1,5},{5,8}}) == 1);
        check(minMeetingRooms(new int[0][2]) == 0);
        check(minMeetingRooms(new int[][]{{1,10},{2,9},{3,8},{4,7}}) == 4);
        System.out.println("PASS");
    }
}
