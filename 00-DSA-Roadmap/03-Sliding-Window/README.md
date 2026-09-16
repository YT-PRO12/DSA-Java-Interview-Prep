# Sliding Window

This folder contains problems based on the **Sliding Window** technique.

I am practicing this pattern to improve my understanding of:
- Fixed-size windows
- Variable-size windows
- Two pointer movement
- Maintaining conditions inside a window
- Frequency counting with HashMap
- Optimizing brute-force solutions

---

## What is Sliding Window?

Sliding Window is useful when we work with a **continuous part of an array or string**.

Instead of checking every possible subarray or substring again and again, we maintain a window using two pointers.

```text
left  ->  [ elements inside window ]  <-  right
```

As `right` moves, the window grows.

When the required condition is not satisfied, we move `left` forward.

---

## Types of Sliding Window

### 1. Fixed Size Window

The window size stays constant.

Example:

```text
Array = [2, 1, 5, 1, 3, 2]
k = 3

[2, 1, 5]
   [1, 5, 1]
      [5, 1, 3]
         [1, 3, 2]
```

### 2. Variable Size Window

The window size changes according to a condition.

```text
left
  |
[ 2  3  1  2  4  3 ]
                |
               right
```

We expand using `right` and shrink using `left` when necessary.

---

## General Approach

```text
1. Start left = 0
2. Move right through the array/string
3. Add the current element to the window
4. Check the required condition
5. Move left when the condition is violated
6. Update the answer
```

---

## Problems

| # | Problem | Type | Difficulty |
|---|---|---|---|
| 01 | Maximum Sum Subarray of Size K | Fixed | Easy |
| 02 | Maximum Average Subarray I | Fixed | Easy |
| 03 | Minimum Size Subarray Sum | Variable | Medium |
| 04 | Longest Substring Without Repeating Characters | Variable | Medium |
| 05 | Fruit Into Baskets | Variable | Medium |
| 06 | Max Consecutive Ones III | Variable | Medium |
| 07 | Longest Repeating Character Replacement | Variable | Medium |
| 08 | Sliding Window Maximum | Fixed | Hard |

---

## Pattern to Remember

```text
Expand -> Check -> Shrink -> Update Answer
```

The main goal is to recognize when a problem can be solved by maintaining a moving window instead of repeatedly checking every possible subarray or substring.

---

## Complexity

Most standard Sliding Window solutions can be optimized to:

```text
Time:  O(n)
Space: O(1) or O(k)
```

depending on whether extra data structures such as a HashMap are required.
