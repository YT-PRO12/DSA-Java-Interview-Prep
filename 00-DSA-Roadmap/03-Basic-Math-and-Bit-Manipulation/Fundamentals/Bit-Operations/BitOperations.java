public class BitOperations {
    private static int mask(int position) {
        if (position < 0 || position >= Integer.SIZE) {
            throw new IllegalArgumentException("position must be from 0 to 31");
        }
        return 1 << position;
    }
    public static boolean isSet(int value, int position) { return (value & mask(position)) != 0; }
    public static int set(int value, int position) { return value | mask(position); }
    public static int clear(int value, int position) { return value & ~mask(position); }
    public static int toggle(int value, int position) { return value ^ mask(position); }
    public static void main(String[] args) {
        int permissions = set(set(0, 1), 3);
        System.out.println(Integer.toBinaryString(permissions));
        System.out.println(isSet(permissions, 3));
        System.out.println(clear(permissions, 1));
        System.out.println(toggle(permissions, 3));
    }
}
