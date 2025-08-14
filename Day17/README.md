# Stones on the Table Problem

## Problem Description

There are *n* stones on the table placed in a row.  
Each stone can be **Red** (`R`), **Green** (`G`), or **Blue** (`B`).

Two stones are considered **neighboring** if there are no other stones between them.

You want to remove the **minimum number of stones** so that **no two neighboring stones have the same color**.

---

### Input

- The first line contains an integer `n` (1 ≤ n ≤ 50) — the number of stones on the table.
- The second line contains a string `s` of length `n`, where:
  - `s[i] = "R"` if the *i*-th stone is red
  - `s[i] = "G"` if it’s green
  - `s[i] = "B"` if it’s blue

---

### Output

- Print a single integer — the **minimum number of stones to remove** to ensure no two neighboring stones have the same color.

---

## Approach

1. **Read** the integer `n` and the string `s`.
2. **Initialize a counter** `count = 0` for the number of stones to remove.
3. **Iterate** through the string from index `1` to `n-1`:
   - If the current stone `s[i]` is the **same** as the previous stone `s[i-1]`, increment `count` (because one of them must be removed).
4. **Output `count`** — this is the minimum number of removals required.

---

### Complexity Analysis

- **Time Complexity:** `O(n)` — we check each stone once.
- **Space Complexity:** `O(1)` — only a counter variable is used.

---
