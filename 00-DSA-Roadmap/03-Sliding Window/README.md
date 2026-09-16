# Sliding Window

This folder contains problems based on the **Sliding Window** technique.

I am using this pattern to improve my understanding of:
- Fixed-size windows
- Variable-size windows
- Two pointer movement
- Maintaining window conditions
- HashMap / frequency counting
- Optimizing nested loops

---

## What is Sliding Window?

Sliding Window is mainly used when we need to work with a **continuous part of an array or string**.

Instead of checking every possible subarray/substring again and again, we maintain a window using two pointers.

```text
left  →  [ elements inside window ]  ←  right
