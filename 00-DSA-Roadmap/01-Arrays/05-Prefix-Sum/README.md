#  Prefix Sum Pattern — DSA

The **Prefix Sum** pattern is one of the most important techniques for solving array and subarray problems efficiently.

Instead of repeatedly calculating the sum of elements for every range, we preprocess the array using a **prefix sum array**. This allows us to calculate range sums in **O(1)** time after **O(n)** preprocessing.

---

##  What is Prefix Sum?

For an array:

```text
arr = [2, 4, 1, 5, 3]
```

The prefix sum array is:

```text
prefix = [2, 6, 7, 12, 15]
```

Where:

```text
prefix[i] = arr[0] + arr[1] + ... + arr[i]
```

For example:

```text
prefix[2] = 2 + 4 + 1 = 7
```

---

##  Why Use Prefix Sum?

Suppose we need the sum of elements from index `L` to `R`.

### Without Prefix Sum

We calculate:

```text
arr[L] + arr[L+1] + ... + arr[R]
```

Time complexity:

```text
O(R - L + 1)
```

If many range queries are given, this can become **O(n × q)**.

### With Prefix Sum

We can calculate the range sum using:

```text
sum(L, R) = prefix[R] - prefix[L - 1]
```

If `L = 0`:

```text
sum(0, R) = prefix[R]
```

Each query becomes:

```text
O(1)
```

---

#  Core Formula

For `L > 0`:

```text
rangeSum(L, R) = prefix[R] - prefix[L - 1]
```

For `L = 0`:

```text
rangeSum(0, R) = prefix[R]
```

---

#  Basic Implementation

## Python

```python
def build_prefix_sum(arr):
    prefix = [0] * len(arr)

    prefix[0] = arr[0]

    for i in range(1, len(arr)):
        prefix[i] = prefix[i - 1] + arr[i]

    return prefix
```

### Example

```python
arr = [2, 4, 1, 5, 3]

prefix = build_prefix_sum(arr)

print(prefix)
```

Output:

```text
[2, 6, 7, 12, 15]
```

---

#  Better Implementation

A very common approach is to create a prefix array of size `n + 1`.

```python
def build_prefix_sum(arr):
    prefix = [0] * (len(arr) + 1)

    for i in range(len(arr)):
        prefix[i + 1] = prefix[i] + arr[i]

    return prefix
```

Now the range-sum formula becomes much simpler:

```python
sum(L, R) = prefix[R + 1] - prefix[L]
```

### Example

```python
arr = [2, 4, 1, 5, 3]

prefix = build_prefix_sum(arr)

L = 1
R = 3

answer = prefix[R + 1] - prefix[L]

print(answer)
```

Output:

```text
10
```

Because:

```text
4 + 1 + 5 = 10
```

---

#  Prefix Sum Pattern

The pattern can be recognized when a problem contains:

* Subarray sum
* Range sum queries
* Sum between two indices
* Number of subarrays satisfying a sum condition
* Subarray sum equal to `K`
* Count of subarrays with a given sum
* Running sum
* Cumulative frequency
* Difference between prefix states

---

# Important Prefix Sum Variations

## 1. Basic Prefix Sum

Used for:

```text
Range Sum Queries
Cumulative Sum
Running Sum
```

Time:

```text
Preprocessing: O(n)
Query: O(1)
```

---

## 2. Prefix Sum + HashMap

This is one of the most important interview patterns.

Common problems:

```text
Subarray Sum Equals K
Count Subarrays With Given Sum
Longest Subarray With Given Sum
```

The key idea is:

```text
current_sum - previous_sum = target
```

Therefore:

```text
previous_sum = current_sum - target
```

We store previous prefix sums in a hash map.

### Template

```python
def subarray_sum(arr, k):
    prefix_sum = 0
    count = 0

    freq = {0: 1}

    for num in arr:
        prefix_sum += num

        if prefix_sum - k in freq:
            count += freq[prefix_sum - k]

        freq[prefix_sum] = freq.get(prefix_sum, 0) + 1

    return count
```

### Complexity

```text
Time:  O(n)
Space: O(n)
```

---

# 3. Prefix Sum + Frequency Map

Useful when we need to count how many times a particular prefix state occurs.

General idea:

```text
prefix_sum → frequency
```

This allows us to count multiple valid subarrays efficiently.

---

# 4. Prefix Sum with Binary Array

For arrays containing `0` and `1`, prefix sums can be used to solve problems involving:

* Equal number of `0`s and `1`s
* Binary subarrays
* Target sum
* Longest balanced subarray

A common transformation is:

```text
0 → -1
1 → +1
```

Then prefix sum techniques can identify balanced subarrays.

---

# 5. 2D Prefix Sum

Prefix sums can also be extended to matrices.

For a matrix:

```text
A[i][j]
```

we can construct:

```text
prefix[i][j]
```

to answer rectangular region-sum queries in **O(1)**.

### Formula

```text
prefix[i][j] =
    matrix[i-1][j-1]
    + prefix[i-1][j]
    + prefix[i][j-1]
    - prefix[i-1][j-1]
```

This is useful for:

* Matrix range sums
* Submatrix problems
* Grid queries
* 2D cumulative sums

---

# 📚 Common Interview Problems

| Problem                   | Pattern              |
| ------------------------- | -------------------- |
| Running Sum of 1d Array   | Basic Prefix Sum     |
| Range Sum Query           | Prefix Sum           |
| Subarray Sum Equals K     | Prefix Sum + HashMap |
| Continuous Subarray Sum   | Prefix Sum + HashMap |
| Binary Subarrays With Sum | Prefix Sum + HashMap |
| Contiguous Array          | Prefix Sum + HashMap |
| Find Pivot Index          | Prefix Sum           |
| Product Except Self       | Prefix/Suffix        |
| Matrix Block Sum          | 2D Prefix Sum        |
| Range Sum Query 2D        | 2D Prefix Sum        |

---

# Interview Recognition

When you see:

> "Find the sum between index `L` and `R` multiple times."

Think:

```text
Prefix Sum
```

When you see:

> "Count subarrays whose sum is K."

Think:

```text
Prefix Sum + HashMap
```

When you see:

> "Find the longest subarray satisfying a sum condition."

Think:

```text
Prefix Sum + HashMap
```

When you see:

> "Multiple rectangle-sum queries in a matrix."

Think:

```text
2D Prefix Sum
```

---

#  Pattern Cheat Sheet

```text
Range Sum
    ↓
Prefix Sum

Subarray Sum = K
    ↓
Prefix Sum + HashMap

Count Subarrays
    ↓
Prefix Sum + Frequency Map

Longest Subarray
    ↓
Prefix Sum + HashMap

0/1 Balanced Subarray
    ↓
Convert 0 → -1
    ↓
Prefix Sum + HashMap

Matrix Range Sum
    ↓
2D Prefix Sum
```

---

# ⏱️ Complexity

| Technique             |                         Time |          Space |
| --------------------- | ---------------------------: | -------------: |
| Brute Force Range Sum |               O(n) per query |           O(1) |
| Prefix Sum            |           O(n) preprocessing |           O(n) |
| Prefix Sum Query      |                         O(1) |           O(n) |
| Prefix Sum + HashMap  |                         O(n) |           O(n) |
| 2D Prefix Sum         | O(rows × cols) preprocessing | O(rows × cols) |
| 2D Range Query        |                         O(1) | O(rows × cols) |

---

#  Key Takeaways

* Prefix Sum converts repeated range calculations into **O(1) queries**.
* Build the prefix array in **O(n)**.
* Use a `n + 1` sized prefix array for cleaner indexing.
* For **Subarray Sum = K**, combine Prefix Sum with a **HashMap**.
* For counting subarrays, store **frequencies of prefix sums**.
* For longest-subarray problems, store the **first occurrence** of a prefix state.
* For matrices, use **2D Prefix Sum**.



```text
Prefix-Sum/
│
├── README.md
│
├── 01_running_sum.py
├── 02_range_sum_query.py
├── 03_pivot_index.py
├── 04_subarray_sum_equals_k.py
├── 05_continuous_subarray_sum.py
├── 06_binary_subarrays_with_sum.py
├── 07_contiguous_array.py
│
└── 2D-Prefix-Sum/
    ├── 01_range_sum_query_2d.py
    └── 02_matrix_block_sum.py
```

---

##  Goal

Mastering the Prefix Sum pattern helps transform many seemingly **O(n²)** subarray problems into **O(n)** solutions.

> **Think in terms of prefix states, not individual subarrays.**

**Pattern → Prefix Sum → HashMap → O(n)**
