import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int[] sorted = candidates.clone();
        Arrays.sort(sorted);
        List<List<Integer>> result = new ArrayList<>();
        search(sorted, target, 0, new ArrayList<>(), result);
        return result;
    }
    private void search(int[] values, int remaining, int start, List<Integer> path, List<List<Integer>> result) {
        if (remaining == 0) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i < values.length && values[i] <= remaining; i++) {
            path.add(values[i]);
            search(values, remaining - values[i], i, path, result);
            path.remove(path.size() - 1);
        }
    }
}
