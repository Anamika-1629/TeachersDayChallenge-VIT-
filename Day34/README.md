# Presents Problem


## Problem Description

Little Petya invited \( n \) friends to a New Year party. Each friend is numbered from 1 to \( n \). Petya remembers that friend number \( i \) gave a gift to friend number \( p_i \). Each friend received exactly one gift (possibly from themselves).

The task is to determine, for each friend \( i \), the number of the friend who gave a gift to them.

---

## Input

- The first line contains an integer \( n \) (1 ≤ \( n \) ≤ 100) — the number of friends.  
- The second line contains \( n \) integers \( p_1, p_2, \ldots, p_n \) — where \( p_i \) is the friend number to whom friend \( i \) gave a gift.

---

## Output

- Print \( n \) space-separated integers — the \( i \)-th number should be the number of the friend who gave a gift to friend \( i \).

---

## Approach

- For each friend \( i \), find the friend \( j \) such that \( p_j = i \).
- Store \( j \) in the result array at index \( i - 1 \).
- Print the final array.

---

## Complexity

- Time Complexity: \( O(n^2) \) due to nested loops.  
- Space Complexity: \( O(n) \) for storing results.

---
