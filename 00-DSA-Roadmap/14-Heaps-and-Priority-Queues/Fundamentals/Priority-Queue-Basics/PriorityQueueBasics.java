import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueBasics {
    public static int[] drain(int[] values, boolean descending) {
        Comparator<Integer> order = descending ? Comparator.reverseOrder() : Comparator.naturalOrder();
        PriorityQueue<Integer> heap = new PriorityQueue<>(order);
        for (int value : values) heap.offer(value);
        int[] result = new int[values.length];
        for (int i = 0; i < result.length; i++) result[i] = heap.remove();
        return result;
    }
    public static void main(String[] args) {
        int[] values = {4, 1, 4, 2};
        System.out.println(Arrays.toString(drain(values, false)));
        System.out.println(Arrays.toString(drain(values, true)));
    }
}
