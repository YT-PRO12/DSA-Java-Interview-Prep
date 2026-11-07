# Implement Trie (Prefix Tree) — LeetCode 208

[Official problem](https://leetcode.com/problems/implement-trie-prefix-tree/)

A **trie** stores one character per edge. The path from the root describes a prefix; a boolean `end` marks where a *complete word* ends.

```java
class Trie {
    private static class Node {
        Node[] next = new Node[26];
        boolean end;
    }

    private final Node root = new Node();

    public Trie() {}

    public void insert(String word) {
        Node node = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (node.next[index] == null) {
                node.next[index] = new Node();
            }
            node = node.next[index];
        }
        node.end = true;
    }

    public boolean search(String word) {
        Node node = walk(word);
        return node != null && node.end;
    }

    public boolean startsWith(String prefix) {
        return walk(prefix) != null;
    }

    private Node walk(String text) {
        Node node = root;
        for (int i = 0; i < text.length(); i++) {
            int index = text.charAt(i) - 'a';
            if (node.next[index] == null) return null;
            node = node.next[index];
        }
        return node;
    }
}
```

## Dry run

Insert `"apple"`. Each letter creates or traverses an edge and the last node becomes terminal.

- `search("apple")` → true (node exists and `end = true`).
- `search("app")` → false (prefix exists, but isn't a complete stored word).
- `startsWith("app")` → true.
- Insert `"app"`; now `search("app")` → true.

Each operation takes O(L) time for a string of length L. Space is O(total distinct trie nodes), bounded by O(sum of inserted word lengths), with 26 child references per node. This implementation assumes lowercase English letters, as guaranteed by the problem.
