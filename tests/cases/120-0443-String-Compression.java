import java.util.Arrays;
class RegressionTest {
    private static void check(boolean ok) {
        if (!ok) throw new AssertionError("String compression regression failed");
    }
    private static void expect(char[] input, String prefix) {
        int length = StringCompression.compress(input);
        check(length == prefix.length());
        check(new String(Arrays.copyOf(input, length)).equals(prefix));
    }
    public static void main(String[] args) {
        expect(new char[]{'a'}, "a");
        expect(new char[]{'a','a','b','b','c','c','c'}, "a2b2c3");
        expect(new char[]{'a','b','c'}, "abc");
        char[] ten = new char[10];
        Arrays.fill(ten, 'z');
        expect(ten, "z10");
        expect(new char[]{}, "");
    }
}