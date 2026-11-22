import java.util.List;

/** LeetCode 139: Word Break.
 * dp[i] is true iff the first i characters can be segmented into words.
 * Time O(n * dictionary size * max word length), space O(n).
 */
class WordBreak {
    static boolean wordBreak(String text, List<String> dictionary) {
        boolean[] reachable = new boolean[text.length() + 1];
        reachable[0] = true;
        for (int i = 0; i < text.length(); i++) {
            if (!reachable[i]) continue;
            for (String word : dictionary) {
                if (!word.isEmpty() && i + word.length() <= text.length()
                        && text.startsWith(word, i))
                    reachable[i + word.length()] = true;
            }
        }
        return reachable[text.length()];
    }
    private static void check(boolean condition) {
        if (!condition) throw new AssertionError("Word Break regression");
    }
    public static void main(String[] args) {
        check(wordBreak("leetcode", List.of("leet", "code")));
        check(wordBreak("applepenapple", List.of("apple", "pen")));
        check(!wordBreak("catsandog", List.of("cats", "dog", "sand", "and", "cat")));
        check(wordBreak("", List.of("a")));
        check(!wordBreak("a", List.of("")));
        check(wordBreak("aaaaaaa", List.of("aaa", "aaaa")));
        System.out.println("PASS");
    }
}
