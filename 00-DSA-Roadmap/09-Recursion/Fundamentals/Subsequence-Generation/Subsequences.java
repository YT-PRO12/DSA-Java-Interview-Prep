import java.util.ArrayList;
import java.util.List;

public class Subsequences {
    public static List<String> generate(String text) {
        List<String> result = new ArrayList<>();
        generate(text, 0, new StringBuilder(), result);
        return result;
    }
    private static void generate(String text, int index, StringBuilder path, List<String> result) {
        if (index == text.length()) {
            result.add(path.toString());
            return;
        }
        generate(text, index + 1, path, result);
        path.append(text.charAt(index));
        generate(text, index + 1, path, result);
        path.deleteCharAt(path.length() - 1);
    }
    public static void main(String[] args) {
        System.out.println(generate("ab"));
    }
}
