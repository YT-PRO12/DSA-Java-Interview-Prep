/** When a candidate's running balance becomes negative, no station
 * in that failed segment can be a valid start. O(n) time, O(1) space.
 */
class GasStation {
    static int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0;
        long total = 0, balance = 0;
        for (int i = 0; i < gas.length; i++) {
            long delta = (long) gas[i]-cost[i];
            total += delta;
            balance += delta;
            if (balance < 0) { start = i+1; balance = 0; }
        }
        return total < 0 ? -1 : start;
    }
    public static void main(String[] args) {
        if (canCompleteCircuit(new int[]{1,2,3,4,5},new int[]{3,4,5,1,2}) != 3
                || canCompleteCircuit(new int[]{2,3,4},new int[]{3,4,3}) != -1
                || canCompleteCircuit(new int[]{1},new int[]{1}) != 0)
            throw new AssertionError("Circuit regression");
        System.out.println("PASS");
    }
}
