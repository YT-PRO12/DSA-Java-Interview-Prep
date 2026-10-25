import java.util.Arrays;
import java.util.Random;

class RegressionTest {
    private static void check(int[] input, int[] expected) {
        int[] original = input.clone();
        int[] actual = new Solution().nextGreaterElements(input);
        if (!Arrays.equals(expected, actual)) {
            throw new AssertionError("Expected " + Arrays.toString(expected)
                + " but got " + Arrays.toString(actual));
        }
        if (!Arrays.equals(input, original)) {
            throw new AssertionError("Input was modified");
        }
    }

    private static int[] bruteForce(int[] input) {
        int[] result = new int[input.length];
        Arrays.fill(result, -1);
        for (int i = 0; i < input.length; i++) {
            for (int distance = 1; distance < input.length; distance++) {
                int value = input[(i + distance) % input.length];
                if (value > input[i]) {
                    result[i] = value;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        check(new int[]{1, 2, 1}, new int[]{2, -1, 2});
        check(new int[]{1, 2, 3, 4, 3}, new int[]{2, 3, 4, -1, 4});
        check(new int[]{7}, new int[]{-1});
        check(new int[]{2, 2, 2}, new int[]{-1, -1, -1});
        check(new int[]{5, 4, 3, 2, 1}, new int[]{-1, 5, 5, 5, 5});
        check(new int[]{-3, -1, -2}, new int[]{-1, -1, -1});
        check(new int[]{1_000_000_000, -1_000_000_000, 1_000_000_000},
              new int[]{-1, 1_000_000_000, -1});
        int[] increasing = new int[10_000];
        int[] expected = new int[10_000];
        for (int i = 0; i < increasing.length; i++) {
            increasing[i] = i;
            expected[i] = i + 1;
        }
        expected[expected.length - 1] = -1;
        check(increasing, expected);
        Random random = new Random(503);
        for (int trial = 0; trial < 2_000; trial++) {
            int[] input = new int[1 + random.nextInt(40)];
            for (int i = 0; i < input.length; i++) input[i] = random.nextInt(21) - 10;
            check(input, bruteForce(input));
        }
    }
}
