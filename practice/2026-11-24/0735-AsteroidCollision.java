import java.util.ArrayDeque;
import java.util.Arrays;

/** Stack of surviving asteroids. Each asteroid is inserted and removed at most once.
 * O(n) time and O(n) space.
 */
class AsteroidCollision {
    static int[] asteroidCollision(int[] asteroids) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int asteroid : asteroids) {
            boolean alive = true;
            while (alive && asteroid < 0 && !stack.isEmpty() && stack.peek() > 0) {
                int right = stack.peek();
                if (right < -(long) asteroid) stack.pop();
                else {
                    if (right == -(long) asteroid) stack.pop();
                    alive = false;
                }
            }
            if (alive) stack.push(asteroid);
        }
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) result[i] = stack.pop();
        return result;
    }
    public static void main(String[] args) {
        if (!Arrays.equals(asteroidCollision(new int[]{5,10,-5}), new int[]{5,10})
                || !Arrays.equals(asteroidCollision(new int[]{8,-8}), new int[0])
                || !Arrays.equals(asteroidCollision(new int[]{10,2,-5}), new int[]{10})
                || !Arrays.equals(asteroidCollision(new int[]{1,Integer.MIN_VALUE}), new int[]{Integer.MIN_VALUE}))
            throw new AssertionError("Collision regression");
        System.out.println("PASS");
    }
}
