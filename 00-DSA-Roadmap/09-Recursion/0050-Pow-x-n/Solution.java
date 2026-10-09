class Solution {
    public double myPow(double x, int n) {
        long exponent = n;
        if (exponent < 0) {
            x = 1.0 / x;
            exponent = -exponent;
        }
        return power(x, exponent);
    }
    private double power(double base, long exponent) {
        if (exponent == 0) return 1.0;
        double half = power(base, exponent / 2);
        double square = half * half;
        return exponent % 2 == 0 ? square : square * base;
    }
}
