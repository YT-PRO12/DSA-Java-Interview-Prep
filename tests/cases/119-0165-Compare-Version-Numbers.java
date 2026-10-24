class RegressionTest {
    private static void check(boolean ok) {
        if (!ok) throw new AssertionError("Version comparison regression failed");
    }
    public static void main(String[] args) {
        check(CompareVersionNumbers.compareVersion("1.01", "1.001") == 0);
        check(CompareVersionNumbers.compareVersion("1.0", "1.0.0") == 0);
        check(CompareVersionNumbers.compareVersion("1.2", "1.10") < 0);
        check(CompareVersionNumbers.compareVersion("2.0", "1.99") > 0);
        check(CompareVersionNumbers.compareVersion("0.1", "1.1") < 0);
    }
}