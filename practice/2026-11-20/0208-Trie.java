/** LeetCode 208: Implement Trie (Prefix Tree).
 * Input contract: lowercase English letters only.
 * Insert, search and prefix lookup are O(L) for word length L.
 */
class Trie {
    private static class Node {
        final Node[] next = new Node[26];
        boolean isWord;
    }
    private final Node root = new Node();

    public void insert(String word) {
        Node current = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (current.next[index] == null) current.next[index] = new Node();
            current = current.next[index];
        }
        current.isWord = true;
    }

    public boolean search(String word) {
        Node node = find(word);
        return node != null && node.isWord;
    }

    public boolean startsWith(String prefix) {
        return find(prefix) != null;
    }

    private Node find(String text) {
        Node current = root;
        for (int i = 0; i < text.length(); i++) {
            current = current.next[text.charAt(i) - 'a'];
            if (current == null) return null;
        }
        return current;
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        check(trie.search("apple"));
        check(!trie.search("app"));
        check(trie.startsWith("app"));
        trie.insert("app");
        check(trie.search("app"));
        check(!trie.startsWith("ape"));
        check(trie.startsWith(""));
        System.out.println("PASS");
    }
    private static void check(boolean pass) {
        if (!pass) throw new AssertionError("Trie regression");
    }
}
