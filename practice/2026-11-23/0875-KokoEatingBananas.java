/** LeetCode 875: Koko Eating Bananas.
 * Speeds are monotonic: if speed s finishes in time, any larger speed does.
 * O(piles.length * log(maxPile)) time; O(1) auxiliary space.
 */
class KokoEatingBananas {
    static int minEatingSpeed(int[] piles, int h) {
        int left = 1, right = 0;
        for (int pile : piles) right = Math.max(right, pile);
        while (left < right) {
            int speed = left + (right - left) / 2;
            long hours = 0;
            for (int pile : piles) hours += (pile + (long) speed - 1) / speed;
            if (hours <= h) right = speed;
            else left = speed + 1;
        }
        return left;
    }
    private static void check(boolean ok) {
        if (!ok) throw new AssertionError("Koko speed regression");
    }
    public static void main(String[] args) {
        check(minEatingSpeed(new int[]{3,6,7,11}, 8) == 4);
        check(minEatingSpeed(new int[]{30,11,23,4,20}, 5) == 30);
        check(minEatingSpeed(new int[]{30,11,23,4,20}, 6) == 23);
        check(minEatingSpeed(new int[]{1}, 1) == 1);
        check(minEatingSpeed(new int[]{Integer.MAX_VALUE}, 1) == Integer.MAX_VALUE);
        System.out.println("PASS");
    }
}
