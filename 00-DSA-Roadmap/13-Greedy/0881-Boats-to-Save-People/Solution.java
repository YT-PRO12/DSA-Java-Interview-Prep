import java.util.Arrays;

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int light = 0, heavy = people.length - 1, boats = 0;
        while (light <= heavy) {
            if ((long) people[light] + people[heavy] <= limit) light++;
            heavy--;
            boats++;
        }
        return boats;
    }
}
