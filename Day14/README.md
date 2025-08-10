# Word Capitalization Problem

## Problem Description

Capitalization is writing a word with its first letter as a capital letter.  
Your task is: **Given a word, capitalize it**.

> **Note:**  
During capitalization, **all letters except the first one remain unchanged**.

---

### Input

- A single line containing a non-empty word.
- The word consists only of lowercase and uppercase English letters (`a-z`, `A-Z`).
- The length of the word will not exceed 10³ characters.

---

### Output

- Output the given word **after capitalization** (only the first letter becomes uppercase, all other letters remain unchanged).

---

## Approach

1. **Read the word**  
   - Input is taken as a string.

2. **Capitalize the first letter**  
   - Convert the first character of the string to uppercase.
   - The rest of the characters stay exactly as they are.

3. **Return or print the new word**

> **Example:**  
> - Input: `kojUNp`  
> - Output: `KojUNp`

This approach runs in **O(n)** time, where `n` is the length of the word,  
and uses **O(1)** additional space.

---
