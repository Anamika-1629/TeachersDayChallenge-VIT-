# Petya and Strings Problem

## Problem Description

Little Petya loves presents. His mum bought him two strings of the same size for his birthday.  
The strings consist of uppercase and lowercase Latin letters.  

Petya wants to compare those two strings **lexicographically**.  
The letters' case does **not** matter — an uppercase letter is considered equivalent to the corresponding lowercase letter.

Your task is to help Petya perform this comparison.

---

### Input

- The first line contains the first string.
- The second line contains the second string.
- Both strings are of the same length (1 ≤ length ≤ 100).
- Strings consist only of uppercase and lowercase Latin letters.

---

### Output

- Output `-1` if the first string is lexicographically **less** than the second string.
- Output `1` if the first string is lexicographically **greater** than the second string.
- Output `0` if the two strings are **equal** (ignoring case).

---

## Approach

1. Read the two strings `a` and `b`.
2. Convert both strings to lowercase (or uppercase) to make the comparison **case-insensitive**.
3. Use lexicographical comparison:
   - If `a < b`, print `-1`.
   - If `a > b`, print `1`.
   - Otherwise, print `0`.
4. This ensures correct case-insensitive dictionary order comparison.

This approach runs in **O(n)** time, where `n` is the length of the strings,  
and uses **O(1)** additional space.

---
