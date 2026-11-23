import java.util.HashMap;
import java.util.Map;

/** LeetCode 146: LRU Cache.
 * A hashmap locates nodes; a doubly linked list maintains recency.
 * Both get and put are O(1) average time.
 */
class LRUCache {
    private static final class Node {
        int key, value;
        Node previous, next;
        Node(int key, int value) { this.key = key; this.value = value; }
    }

    private final int capacity;
    private final Map<Integer, Node> entries = new HashMap<>();
    private final Node first = new Node(0, 0), last = new Node(0, 0);

    LRUCache(int capacity) {
        if (capacity <= 0) throw new IllegalArgumentException("Capacity must be positive");
        this.capacity = capacity;
        first.next = last;
        last.previous = first;
    }

    int get(int key) {
        Node node = entries.get(key);
        if (node == null) return -1;
        detach(node);
        append(node);
        return node.value;
    }

    void put(int key, int value) {
        Node existing = entries.get(key);
        if (existing != null) {
            existing.value = value;
            detach(existing);
            append(existing);
            return;
        }
        if (entries.size() == capacity) {
            Node lru = first.next;
            detach(lru);
            entries.remove(lru.key);
        }
        Node node = new Node(key, value);
        entries.put(key, node);
        append(node);
    }

    private void detach(Node node) {
        node.previous.next = node.next;
        node.next.previous = node.previous;
    }

    private void append(Node node) {
        node.previous = last.previous;
        node.next = last;
        last.previous.next = node;
        last.previous = node;
    }

    private static void check(boolean ok) {
        if (!ok) throw new AssertionError("LRU cache regression");
    }
    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        check(cache.get(1) == 1);
        cache.put(3, 3);
        check(cache.get(2) == -1);
        cache.put(4, 4);
        check(cache.get(1) == -1);
        check(cache.get(3) == 3 && cache.get(4) == 4);
        cache.put(3, 30);
        check(cache.get(3) == 30);
        LRUCache single = new LRUCache(1);
        single.put(5, 5);
        single.put(5, 50);
        check(single.get(5) == 50);
        single.put(6, 6);
        check(single.get(5) == -1 && single.get(6) == 6);
        System.out.println("PASS");
    }
}
