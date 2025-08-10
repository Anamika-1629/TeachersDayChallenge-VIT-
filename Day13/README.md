# Helpful Maths Problem

## Problem Description

Xenia is a beginner mathematician at elementary school. She is learning the addition operation.  

Her teacher writes down a sum of multiple numbers on the board.  
The sum only contains the numbers **1**, **2**, and **3**, separated by `"+"` signs.  

However, Xenia can only calculate the sum if the numbers (summands) appear in **non-decreasing order**.  
For example:
- She **cannot** calculate `1+3+2+1`
- She **can** calculate `1+1+2` or `3+3`

You are given the sum written on the board.  
Rearrange the numbers so that Xenia can calculate it (i.e., numbers appear in non-decreasing order).

---

### Input

- The first line contains a non-empty string `s` — the sum Xenia needs to count.
- `s` contains only digits (`1`, `2`, `3`) and `"+"` characters.
- `s` is a correct sum of numbers 1, 2, and 3.
- Length of `s` ≤ 100 characters.

---

### Output

- Print the new sum where the numbers are in **non-decreasing order** and separated by `"+"`.

---

## Approach

1. **Extract the numbers**  
   - Traverse through the string, picking out only the digit characters (`1`, `2`, `3`).

2. **Sort the numbers**  
   - Sort the extracted digits in ascending order (character `'1'` before `'2'` before `'3'`).

3. **Rebuild the sum**  
   - Join the sorted digits back into a string, inserting `"+"` between each number.

4. **Print the result**  
   - Output the rearranged sum.

---

### Complexity Analysis
- **Time Complexity:** `O(n log n)` for sorting, where `n` is the number of digits.
- **Space Complexity:** `O(n)` for storing the digits before joining them.

---
