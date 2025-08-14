# Bit++ Problem

## Problem Description

The programming language of **Bitland** is called **Bit++**.  
It is unusual because it contains exactly one variable, named `x`.

The language supports only two operations:

- **`++`** → increases the value of `x` by 1  
- **`--`** → decreases the value of `x` by 1  

A single **statement** in Bit++:
- Contains exactly one of these operations (`++` or `--`)
- Contains exactly one variable `x`
- Is written with no spaces — only characters `"+"`, `"-"`, and `"X"`
- Can be in any order, e.g. `++X`, `X++`, `--X`, or `X--`

Executing the statement means performing its operation on `x`.

You are given a program (a sequence of such statements).  
The initial value of `x` is **0**.  
Execute the program and find the **final value of `x`**.

---

### Input

- The first line contains an integer `n` (1 ≤ n ≤ 150) — the number of statements in the program.
- The next `n` lines each contain a single valid statement (`++X`, `X++`, `--X`, or `X--`).

---

### Output

- A single integer — the **final value** of `x` after executing all statements.

---

## Approach

1. **Read** the integer `n` (number of statements).
2. **Initialize** a variable `x = 0`.
3. For each statement:
   - If it contains `"++"` (either `++X` or `X++`), increment `x` by 1.
   - If it contains `"--"` (either `--X` or `X--`), decrement `x` by 1.
4. After processing all statements, **output** the value of `x`.

---

### Complexity Analysis

- **Time Complexity:** `O(n)` — each statement is checked once.
- **Space Complexity:** `O(1)` — only one variable (`x`) is maintained.

---
