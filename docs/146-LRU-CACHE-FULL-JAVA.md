# 146. LRU Cache — Java (HashMap + Doubly Linked List)

[LeetCode 146](https://leetcode.com/problems/lru-cache/)

The cache must support `get(key)` and `put(key, value)` in **O(1) average time**. The HashMap locates nodes directly; a doubly linked list orders entries by recency.

The most recently used (MRU) node sits immediately after the dummy head, and the least recently used (LRU) node sits immediately before the dummy tail. The sentinels eliminate special cases when inserting/removing the first or last real node.

```java
import java.util.HashMap;
import java.util.Map;

class LRUCache {
    private static class Node {
        int key, value;
        Node prev, next;
        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final Map<Integer, Node> cache = new HashMap<>();
    private final Node head = new Node(-1, -1);
    private final Node tail = new Node(-1, -1);
    private final int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        Node node = cache.get(key);
        if (node == null) return -1;
        moveToFront(node);
        return node.value;
    }

    public void put(int key, int value) {
        Node existing = cache.get(key);
        if (existing != null) {
            existing.value = value;
            moveToFront(existing);
            return;
        }

        Node added = new Node(key, value);
        cache.put(key, added);
        addAfterHead(added);

        if (cache.size() > capacity) {
            Node victim = tail.prev;
            detach(victim);
            cache.remove(victim.key);
        }
    }

    private void moveToFront(Node node) {
        detach(node);
        addAfterHead(node);
    }

    private void detach(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void addAfterHead(Node node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }
}
```

## Dry run: capacity = 2

| Operation | Result | MRU → LRU |
| --- | --- | --- |
| put(1, 10) | — | 1 |
| put(2, 20) | — | 2, 1 |
| get(1) | 10 | 1, 2 |
| put(3, 30) | evicts 2 | 3, 1 |
| get(2) | -1 | 3, 1 |
| put(1, 15) | updates 1 | 1, 3 |

The dictionary contains only real nodes. Both sentinels remain linked even when the cache is empty.

**Complexity:** `get` and `put` are O(1) expected time with hashing. Space O(capacity). LeetCode guarantees a positive capacity. If no entry exists, `get` returns -1.
