import java.util.Arrays;
import java.util.Collections;
class RegressionTest {
    private static void check(boolean ok) {
        if (!ok) throw new AssertionError("Intersection regression failed");
    }
    public static void main(String[] args) {
        check(IntersectionOfTwoArrays.findIntersection(new int[]{1,2,2,1}, new int[]{2,2,1})
            .equals(Arrays.asList(2,1)));
        check(IntersectionOfTwoArrays.findIntersection(new int[]{1,2,3}, new int[]{4,5})
            .equals(Collections.emptyList()));
        check(IntersectionOfTwoArrays.findIntersection(new int[]{-1,0,1}, new int[]{1,1,-1})
            .equals(Arrays.asList(1,-1)));
        check(IntersectionOfTwoArrays.findIntersection(new int[]{}, new int[]{1}).isEmpty());
    }
}