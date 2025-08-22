# B. Petya and Countryside

## Problem Description

Little Petya often travels to his grandmother in the countryside. The grandmother's garden can be represented as a rectangle 1 × n, and each section has its own fixed height. If you create artificial rain above one section, the water will flow to left and right as long as the neighbouring sections do not exceed the height of the previous (closer to rain) section.

Your task: find the maximal number of contiguous sections that can be watered if rain is created above exactly one section.

---

## Input

- The first line contains a positive integer `n` (1 ≤ n ≤ 1000): the number of sections.
- The second line contains `n` positive integers: the height of each section (all in [1, 1000]).

---

## Output

- Print the maximal number of contiguous watered sections for the optimal choice of rain's starting section.

---

## Approach

1. For each section, simulate watering:
   - Count contiguous sections to the left where each is not higher than the previous (closer to rain).
   - Count contiguous sections to the right similarly.
   - Add 1 for the section where rain is created.
2. Repeat for every section and keep the maximal result.
3. Print the maximum found.

---

## Complexity Analysis

- **Time Complexity:** O(n²) — each section may scan the whole array left/right.
- **Space Complexity:** O(1) — just indices and counters needed.

---
