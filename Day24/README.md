# A. Soldier and Bananas

## Problem Description

A soldier wants to buy `w` bananas in a shop. The price of the bananas increases linearly: the first banana costs `k` dollars, the second costs `2k` dollars, the third costs `3k` dollars, and so on. In other words, the `i`-th banana costs `i * k` dollars.

The soldier currently has `n` dollars. Your task is to determine how many dollars he needs to borrow from his friend to buy all `w` bananas. If he already has enough money, then he does not need to borrow anything.

---

## Input

- The first line contains three integers `k`, `n`, and `w`:
  - `k` (1 ≤ k ≤ 1000) — the cost of the first banana.
  - `n` (0 ≤ n ≤ 10^9) — the number of dollars the soldier currently has.
  - `w` (1 ≤ w ≤ 1000) — the number of bananas the soldier wants to buy.

---

## Output

- Output a single integer — the number of dollars the soldier must borrow.  
- If the soldier has enough money, output `0`.

---

## Approach

1. Calculate the total cost of bananas using the formula for the sum of the first `w` natural numbers multiplied by `k`:
   \[
   \text{total cost} = k \times \frac{w \times (w + 1)}{2}
   \]

2. Determine how much more money the soldier needs by subtracting the current amount `n` from the total cost.

3. If the result is negative or zero, return `0` since no borrowing is needed.

---

## Complexity Analysis

- **Time Complexity:** `O(1)` — The calculation involves only arithmetic operations.
- **Space Complexity:** `O(1)` — Uses a constant amount of memory.

---
