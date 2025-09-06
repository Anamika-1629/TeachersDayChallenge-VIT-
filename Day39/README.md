# Arrival of the General


## Problem Description

A general inspects a lineup of soldiers. The lineup is considered correct if the tallest soldier is at the front and the shortest soldier is at the end. Soldiers can be swapped only with adjacent soldiers, and each swap takes one second.

Given the soldiers' heights, determine the minimum time (number of swaps) needed to achieve the correct lineup.

---

## Input

- The first line contains an integer \( n \) (2 ≤ \( n \) ≤ 100) — the number of soldiers.
- The second line contains \( n \) integers — the heights of soldiers in the order they stand initially.

---

## Output

- Print a single integer — the minimum number of seconds (swaps) required.

---

## Approach

1. Find the first occurrence of the maximum height (tallest soldier).  
2. Find the last occurrence of the minimum height (shortest soldier).  
3. Calculate the swaps needed:  
   - Swaps to bring tallest soldier to the front = max index.  
   - Swaps to bring shortest soldier to the end = (n - 1) - min index.  
4. If shortest soldier is before tallest soldier in line, subtract one swap (overlap).  
5. Return total swaps.

---

## Complexity

- Time Complexity: \( O(n) \)  
- Space Complexity: \( O(n) \)

---
