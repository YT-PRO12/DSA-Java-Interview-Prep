import java.util.Arrays;

public class CountingSort {
    public static void sort(int[] values, int maximum) {
        if (maximum < 0 || maximum > 1_000_000) {
            throw new IllegalArgumentException("maximum must be from 0 to 1,000,000");
        }
        for (int value : values) {
            if (value < 0 || value > maximum) throw new IllegalArgumentException("value outside range");
        }
        int[] counts = new int[maximum + 1];
        for (int value : values) counts[value]++;
        int write = 0;
        for (int value = 0; value <= maximum; value++) {
            for (int count = counts[value]; count > 0; count--) values[write++] = value;
        }
    }
    public static void main(String[] args) {
        int[] values = {4, 2, 2, 0, 1};
        sort(values, 4);
        System.out.println(Arrays.toString(values));
    }
}
