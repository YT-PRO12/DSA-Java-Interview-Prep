// LeetCode 172: FactorialTrailingZeroes
// Standalone implementation with executable regression checks.
// Run: javac FactorialTrailingZeroes.java && java FactorialTrailingZeroes

class FactorialTrailingZeroes {
    static int trailingZeroes(int n) {
        int count = 0;
        while (n > 0) {
            n /= 5;
            count += n;
        }
        return count;
    }
    public static void main(String[] args) {
        if (trailingZeroes(0) != 0 || trailingZeroes(25) != 6 || trailingZeroes(100) != 24)
            throw new AssertionError("Trailing zeroes regression");
        System.out.println("PASS");
    }
}
