# A. Magnets

## Problem Description

Mad scientist Mike entertains himself by arranging rows of dominoes, but he uses magnets instead. Each magnet has two poles, positive ("plus") and negative ("minus"). When two magnets are put together, like poles repel each other and opposite poles attract each other.

Mike places magnets in a row, one at a time. Each magnet can be oriented as either "01" (plus-minus) or "10" (minus-plus). If a new magnet is oriented the same way as the previous magnet, it sticks and forms a group. If the orientation changes, a new group begins.

**Task:**  
Given the series of magnet orientations, determine **how many groups** are formed.

---

## Input

- The first line contains an integer \( n \) \((1 \leq n \leq 100000)\): the number of magnets.
- The following \( n \) lines each contain a string, either `"01"` or `"10"`, representing the orientation of each magnet.

---

## Output

Output a single integer — the number of groups of magnets formed.

---

## Approach

- Start with 1 group (the first magnet).
- For each subsequent magnet, compare its orientation to the previous one:
  - If the orientation is different, increment the group count.
  - If it is the same, continue the current group.
- Output the total number of groups.

---

## Complexity Analysis

- **Time Complexity:** \( O(n) \) — Scans the list once.
- **Space Complexity:** \( O(1) \) extra space (apart from input).

---

