# A. Elephant

## Problem Description

An elephant wants to visit his friend. The elephant's house is at position 0 on a coordinate line, and his friend's house is at position `x` (where `x > 0`). 

In one step, the elephant can move forward by 1, 2, 3, 4, or 5 positions. Your task is to determine the minimum number of steps the elephant needs to take to reach his friend's house exactly at position `x`.

---

## Input

- A single integer `x` (1 ≤ x ≤ 1,000,000) — the coordinate of the friend's house.

---

## Output

- Print a single integer — the minimum number of steps the elephant needs to reach position `x` from 0.

---

## Approach

1. The elephant should take the largest possible steps of length 5 whenever possible to minimize the number of steps.
2. Calculate how many complete 5-step moves the elephant can make: `steps = x // 5`.
3. If there is any remaining distance after those steps (`x % 5 != 0`), then the elephant needs one more step to cover the remainder.
4. Return the total number of steps as the result.

---

## Complexity Analysis

- **Time Complexity:** `O(1)` — the calculation involves only integer division and modulus.
- **Space Complexity:** `O(1)` — only a few variables are used.

---

