# Next Round Problem

## Problem Description

"Contestants who earn a score equal to or greater than the k-th place finisher's score will advance to the next round, as long as the contestant earns a positive score..." — an excerpt from contest rules.

A total of `n` participants took part in the contest (`n ≥ k`), and you already know their scores.

Your task is to calculate how many participants will advance to the next round.

---

### Input

- The first line contains two integers `n` and `k` (1 ≤ k ≤ n ≤ 50) separated by a single space.
- The second line contains `n` space-separated integers `a1, a2, ..., an` (0 ≤ ai ≤ 100), where `ai` is the score earned by the participant who got the i-th place.
- The sequence is non-increasing (`ai ≥ ai+1` for all valid i).

---

### Output

- Output a single integer — the number of participants who advance to the next round.

---

## Approach

1. Read integers `n` and `k`.
2. Read the list of scores of length `n`.
3. Determine the score of the participant in the k-th place: `threshold = a[k-1]`.
4. Count how many participants have a score greater than or equal to `threshold` and greater than 0.
5. Print the count.

This approach runs in **O(n)** time and uses **O(n)** space.

---
