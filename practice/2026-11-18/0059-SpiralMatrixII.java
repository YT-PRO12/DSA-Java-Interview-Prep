// LeetCode 59: SpiralMatrixII
// Standalone implementation with executable regression checks.
// Run: javac SpiralMatrixII.java && java SpiralMatrixII

import java.util.Arrays;

class SpiralMatrixII {
    static int[][] generateMatrix(int n) {
        int[][] a = new int[n][n];
        int top = 0, bottom = n - 1, left = 0, right = n - 1, value = 1;
        while (top <= bottom && left <= right) {
            for (int j = left; j <= right; j++) a[top][j] = value++;
            top++;
            for (int i = top; i <= bottom; i++) a[i][right] = value++;
            right--;
            if (top <= bottom) {
                for (int j = right; j >= left; j--) a[bottom][j] = value++;
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) a[i][left] = value++;
                left++;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        if (!Arrays.deepEquals(generateMatrix(1), new int[][]{{1}})
            || !Arrays.deepEquals(generateMatrix(3), new int[][]{{1,2,3},{8,9,4},{7,6,5}}))
            throw new AssertionError("Spiral ordering regression");
        System.out.println("PASS");
    }
}
