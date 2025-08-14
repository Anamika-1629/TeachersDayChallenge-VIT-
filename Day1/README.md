# Find Numbers with Even Number of Digits

[Problem Link](https://leetcode.com/problems/find-numbers-with-even-number-of-digits/)

## Problem Description

Given an array `nums` of integers, return how many of them contain an **even number of digits**.

---

## Approach

To determine how many numbers have an even number of digits:

1. **Initialize a counter** to store the count of numbers with an even digit length.
2. **Loop through each element** in the array `nums`.
3. For each number:
   - Convert it to its **absolute value** using `Math.abs()` to avoid counting a minus sign as a digit.
   - Convert the result to a string using `Integer.toString()`.
   - Determine its **digit count** by checking the string's `.length()`.
   - If the digit count is **even** (`length % 2 == 0`), increment the counter.
4. **After checking all elements**, return the counter as the result.

This method ensures all elements are processed exactly once and handles negative numbers correctly.

---

### Complexity Analysis

- **Time Complexity:** `O(n * k)`, where `n` is the number of elements in `nums` and `k` is the average number of digits per number (very small in practical cases).
- **Space Complexity:** `O(1)` — only a counter variable is used, aside from temporary variables during iteration.

---