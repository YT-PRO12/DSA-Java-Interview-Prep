public class ArrayRecursion {
    public static long sum(int[] values) { return sum(values, 0); }
    private static long sum(int[] values, int index) {
        if (index == values.length) return 0;
        return values[index] + sum(values, index + 1);
    }
    public static int firstIndex(int[] values, int target) { return firstIndex(values, target, 0); }
    private static int firstIndex(int[] values, int target, int index) {
        if (index == values.length) return -1;
        if (values[index] == target) return index;
        return firstIndex(values, target, index + 1);
    }
    public static void main(String[] args) {
        int[] values = {4, 2, 4, 7};
        System.out.println(sum(values));
        System.out.println(firstIndex(values, 4));
    }
}
