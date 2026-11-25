import java.util.ArrayList;
import java.util.List;

/** LeetCode 118: Pascal's Triangle. O(rows^2) time and O(rows^2) output space. */
class PascalsTriangle {
    static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int row = 0; row < numRows; row++) {
            List<Integer> values = new ArrayList<>();
            values.add(1);
            for (int col = 1; col < row; col++)
                values.add(result.get(row - 1).get(col - 1) + result.get(row - 1).get(col));
            if (row > 0) values.add(1);
            result.add(values);
        }
        return result;
    }
    private static void check(boolean ok) {
        if (!ok) throw new AssertionError("Pascal Triangle regression");
    }
    public static void main(String[] args) {
        check(generate(0).isEmpty());
        check(generate(1).equals(List.of(List.of(1))));
        check(generate(5).equals(List.of(
            List.of(1), List.of(1,1), List.of(1,2,1),
            List.of(1,3,3,1), List.of(1,4,6,4,1))));
        System.out.println("PASS");
    }
}
