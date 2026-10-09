public class GcdLcm {
    public static long gcd(int a, int b) {
        long x = Math.abs((long) a);
        long y = Math.abs((long) b);
        while (y != 0) {
            long remainder = x % y;
            x = y;
            y = remainder;
        }
        return x;
    }
    public static long lcm(int a, int b) {
        if (a == 0 || b == 0) return 0;
        return Math.abs(((long) a / gcd(a, b)) * b);
    }
    public static void main(String[] args) {
        System.out.println(gcd(18, 24));
        System.out.println(lcm(18, 24));
    }
}
