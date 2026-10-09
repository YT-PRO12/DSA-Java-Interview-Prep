import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate(n, 0, 0, new StringBuilder(), result);
        return result;
    }
    private void generate(int n, int opened, int closed, StringBuilder path, List<String> result) {
        if (closed == n) {
            result.add(path.toString());
            return;
        }
        if (opened < n) {
            path.append('(');
            generate(n, opened + 1, closed, path, result);
            path.deleteCharAt(path.length() - 1);
        }
        if (closed < opened) {
            path.append(')');
            generate(n, opened, closed + 1, path, result);
            path.deleteCharAt(path.length() - 1);
        }
    }
}
