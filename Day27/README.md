# B. Drinks

## Problem Description

Little Vasya loves orange juice very much. In his kitchen, all food and drinks contain orange juice. Vasya has `n` drinks in his fridge, where the percentage of orange juice in the `i`-th drink is `p_i` percent.

He decided to make an orange cocktail by mixing equal amounts of each drink. You need to find the volume fraction of orange juice in this cocktail.

---

## Input

- The first line contains an integer `n` (1 ≤ n ≤ 100) — the number of drinks.
- The second line contains `n` integers `p_i` (0 ≤ p_i ≤ 100) — the percentage of orange juice in each drink, separated by spaces.

---

## Output

- Print the volume fraction (in percent) of orange juice in the cocktail.
- Your answer will be considered correct if the absolute or relative error does not exceed 10⁻⁴.

---

## Approach

1. Read the number of drinks `n`.
2. Read the list of orange juice percentages for each drink.
3. Since the cocktail is made from equal parts of each drink, the final percentage is the average of all percentages.
4. Calculate the average by summing all percentages and dividing by `n`.
5. Output the result.

---

## Complexity Analysis

- **Time Complexity:** `O(n)` — for summing the input percentages.
- **Space Complexity:** `O(n)` — to store the input percentages.

---
