# A. Domino piling

## Problem Description

You are given a rectangular board of size **M × N** squares.  
You also have an unlimited number of standard domino pieces, each covering exactly **2 × 1** squares.

You can place the dominoes either vertically or horizontally on the board.  
Your goal is to place as many dominoes as possible without overlapping and while remaining inside the board.

---

## Input

- A single line containing two integers `M` and `N` (1 ≤ M ≤ N ≤ 16) — the dimensions of the board.

---

## Output

- Output a single integer — the maximum number of dominoes that can be placed on the board.

---

## Approach

1. Compute the total number of squares on the board: `total = M × N`.
2. Each domino covers exactly 2 squares.
3. The answer is the maximum number of dominoes that can fit without overlap:
    answer = total // 2
(Integer division floors automatically.)

---

## Complexity Analysis

- **Time Complexity:** `O(1)` — only arithmetic operations involved.
- **Space Complexity:** `O(1)` — no extra space needed.

---

