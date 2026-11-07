# Count Distinct Substrings Using a Trie

**Goal:** Count the number of *non-empty distinct substrings* of a lowercase string. A substring is contiguous; a subsequence need not be.

A naive approach generates every substring and inserts it into a `HashSet<String>`. It materializes many intermediate strings. A trie lets us share common prefixes and count new substrings as new edges/nodes are created.

## Java implementation

```java
class DistinctSubstrings {
    static class Node {
        Node[] next = new Node[26];
    }

    static int countDistinctSubstrings(String text) {
        Node root = new Node();
        int distinct = 0;

        for (int start = 0; start < text.length(); start++) {
            Node node = root;
            for (int end = start; end < text.length(); end++) {
                int index = text.charAt(end) - 'a';
                if (node.next[index] == null) {
                    node.next[index] = new Node();
                    distinct++;
                }
                node = node.next[index];
            }
        }
        return distinct;
    }
}
```

## Why counting new nodes works

For each starting index, follow consecutive characters to form every suffix of that start. A path from the trie root corresponds to exactly one substring text. When the next edge does not exist, the current substring has never been inserted, so create a node and increment the answer **once**. An already existing edge corresponds to a substring already counted.

## Dry run

For `"aba"`: start at 0 inserts `a`, `ab`, and `aba` (three). Start at 1 inserts `b` and `ba` (two). Start at 2 follows the existing `a` path (zero). The five distinct non-empty substrings are `a`, `ab`, `aba`, `b`, and `ba`.

## Complexity

The two loops traverse at most `n(n+1)/2` character transitions, giving **O(n²) time** and up to **O(n²) trie nodes** in the worst case (26 references per node). For very large strings, consider suffix automata or suffix arrays. Some problem statements also count the **empty substring**, in which case add one to this method's result. This implementation assumes `a-z`.
