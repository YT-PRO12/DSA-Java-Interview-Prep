import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrimesAndDivisors {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int divisor = 2; divisor <= n / divisor; divisor++) {
            if (n % divisor == 0) return false;
        }
        return true;
    }
    public static List<Integer> divisors(int n) {
        if (n <= 0) throw new IllegalArgumentException("n must be positive");
        List<Integer> small = new ArrayList<>();
        List<Integer> large = new ArrayList<>();
        for (int divisor = 1; divisor <= n / divisor; divisor++) {
            if (n % divisor == 0) {
                small.add(divisor);
                if (divisor != n / divisor) large.add(n / divisor);
            }
        }
        Collections.reverse(large);
        small.addAll(large);
        return small;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(29));
        System.out.println(divisors(36));
    }
}
