# A. Translation

## Problem Description

In Berlandish and Birlandish languages, words that have the same meaning are written as reverses of each other.  
For example, the Berlandish word `code` corresponds to the Birlandish word `edoc`.

You are given:
- A Berlandish word `s`  
- A word `t` that Vasya claims is its translation to Birlandish

Your task is to determine whether `t` is exactly the **reverse** of `s`.

---

## Input

- The first line contains string `s` — the Berlandish word.
- The second line contains string `t` — the Birlandish translation.
- Both strings consist only of lowercase Latin letters.
- Length of each string ≤ 100.

---

## Output

- Print `"YES"` if `t` is exactly the reverse of `s`.
- Otherwise, print `"NO"`.


---

## Approach

1. **Read** strings `s` and `t`.
2. **Reverse** string `t` (or string `s`).
3. Compare the reversed string with the other:
   - If they match → `"YES"`
   - Otherwise → `"NO"`

---

## Complexity Analysis

- **Time Complexity:** `O(n)` — need to reverse and compare strings of length `n`.
- **Space Complexity:** `O(1)` — only a small amount of extra memory for the reversed string.

---

