# HashMap internals in Java

A HashMap stores key-value pairs in an array of buckets. The key's `hashCode()` is mixed and mapped to a bucket index; the index is not the value itself.

## Collisions

Different keys can land in the same bucket. Java resolves their equality using `equals()`, not hash codes alone. Modern Java HashMap implementations use linked nodes, potentially treeifying sufficiently crowded buckets subject to capacity and implementation thresholds.

## Insertion trace

Suppose a simplified teaching map has 8 buckets and indexes with `hash & 7`. Hash values 2 and 10 both map to bucket 2. Adding `(A, 1)` and `(B, 2)` keeps both entries; a lookup checks key equality within that bucket.

This simplified indexing example is not a claim that every Java release implements hashing identically.

## Performance

Expected `put`, `get`, and `remove` are O(1) with a good hash distribution. Collisions and resizing introduce costs; do not claim guaranteed constant time. The map may grow when its entry count exceeds its load-factor threshold.

Never mutate fields used by a key's `hashCode` or `equals` while the key is stored in a HashMap.
