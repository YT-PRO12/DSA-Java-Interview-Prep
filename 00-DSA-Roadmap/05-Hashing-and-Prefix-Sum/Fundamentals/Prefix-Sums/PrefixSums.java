public class PrefixSums {
    public static long[] build(int[] values) {
        long[] prefix = new long[values.length + 1];
        for (int i = 0; i < values.length; i++) prefix[i + 1] = prefix[i] + values[i];
        return prefix;
    }
    public static long rangeSum(long[] prefix, int from, int to) {
        if (from < 0 || to < from || to >= prefix.length) {
            throw new IllegalArgumentException("require 0 <= from <= to <= array length");
        }
        return prefix[to] - prefix[from];
    }
    public static void main(String[] args) {
        long[] prefix = build(new int[]{2, -1, 4, 3});
        System.out.println(rangeSum(prefix, 1, 4));
    }
}
