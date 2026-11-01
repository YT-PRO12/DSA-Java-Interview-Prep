# LRU Cache — LeetCode 146

Use a HashMap<Integer, Node> for direct lookup and a doubly linked list to maintain recency. Place the **most recently used** item immediately after a dummy head; the **least recently used** immediately before a dummy tail.

On `get(key)`, return -1 if missing. Otherwise detach the node, insert it after the head and return its value. On `put(key, value)`, update and move an existing node to the front; otherwise insert a new node, then remove the node before the tail if size exceeds capacity.

## Dry run (capacity 2)

- put(1, 10): MRU → 1
- put(2, 20): MRU → 2, 1
- get(1) returns 10: MRU → 1, 2
- put(3, 30): evict 2; MRU → 3, 1
- get(2) returns -1

Both operations take O(1) average time with a hash table and O(capacity) space. Never redeclare head and tail as local variables inside the constructor: initialize instance fields so helper methods can use them.
