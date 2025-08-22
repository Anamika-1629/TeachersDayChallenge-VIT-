# A. Word

## Problem Description

Vasya is upset that many people mix uppercase and lowercase letters in one word on the internet. He invented a browser extension that fixes this by converting the entire word to either all lowercase or all uppercase letters, changing as few letters as possible.

Given a word `s` consisting of uppercase and lowercase Latin letters, if the number of uppercase letters is strictly greater than the number of lowercase letters, convert the entire word to uppercase. Otherwise (including when counts are equal), convert the entire word to lowercase.

---

## Input

- A single word `s`, consisting of uppercase and lowercase Latin letters, with length from 1 to 100.

---

## Output

- Print the corrected word according to the rule described above.

---

## Approach

1. Count the number of uppercase letters (`uc`) and lowercase letters (`lc`) in the word.
2. If `uc` > `lc`, convert the word to uppercase.
3. Otherwise, convert the word to lowercase.

This ensures that the minimal number of letters are changed to achieve a consistent case for the whole word.

---

## Complexity Analysis

- **Time Complexity:** `O(n)` — Where `n` is the length of the string, due to iterating through the string once.
- **Space Complexity:** `O(n)` — For creating the final converted string.

---
