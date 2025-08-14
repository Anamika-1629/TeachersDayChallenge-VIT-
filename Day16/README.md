# Beautiful Matrix Problem

## Problem Description

You are given a **5 × 5** matrix containing exactly **24 zeroes** and a single `1`.

A matrix is called **beautiful** if the single `1` is located in the center —  
that is, at the intersection of the **third row** and **third column** (1-based indexing).

In one move, you can:

- Swap two neighboring rows, i.e. rows with indices `i` and `i+1` (1 ≤ i < 5)
- Swap two neighboring columns, i.e. columns with indices `j` and `j+1` (1 ≤ j < 5)

Your task is to determine the **minimum number of moves** required to make the matrix beautiful.

---

### Input

- Five lines, each containing five integers (`0` or `1`).
- Exactly one of these integers is `1`, and the rest are `0`.

---

### Output

- A single integer — the minimum number of moves required.

---

## Approach

1. **Read** the matrix from input.
2. **Find** the coordinates `(i, j)` of the `1` (0-based indices).
3. The target (center) position is `(2, 2)` in 0-based indexing.
4. **Calculate the Manhattan distance** between the position of the `1` and center i.e, `(2, 2)`:

--