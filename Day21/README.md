# A. Twins

## Problem Description

You have `n` coins with certain values. You want to take a subset of these coins so that:

1. The sum of your coins is **strictly greater** than the sum of the coins left for your twin.
2. You take the **minimum number of coins** possible to achieve condition (1).

You need to determine **the minimum number of coins** you need to take.

---

## Input

- The first line contains an integer `n` (1 ≤ n ≤ 100) — the number of coins.
- The second line contains `n` integers `a1, a2, ..., an` (1 ≤ ai ≤ 100) — the coin values.

---

## Output

- A single integer — the **minimum number of coins** you need to take.

---

## Approach

1. Sort the coins in **descending order** (largest first).
2. Calculate the **total sum** of all coins.
3. Keep taking coins from largest to smallest, adding up your total.
4. Stop when your sum is **greater than** the sum of the remaining coins.
5. The number of coins you’ve taken is the answer.

This works because taking the largest coins first ensures you reach the target sum with the fewest coins.

---

## Complexity Analysis

- **Time Complexity:** `O(n log n)` — due to sorting `n` coins.
- **Space Complexity:** `O(1)` — only a few extra variables used.

---
