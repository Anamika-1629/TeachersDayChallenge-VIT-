# Watermelon Division Problem

## Problem Description

Pete and his friend Billy bought a watermelon weighing `w` kilos. They want to divide the watermelon into two parts such that:

- Each part weighs an **even** number of kilos.
- Both parts are of **positive weight**.
- The parts do **not** have to be equal.

Your task is to determine if such a division is possible given the weight `w`.

### Input

- An integer `w` (1 ≤ w ≤ 100) — the weight of the watermelon.

### Output

- Print `"YES"` if the watermelon can be divided into two even parts with positive weight.
- Otherwise, print `"NO"`.

--

## Approach

To solve this problem, we check if the total weight `w` satisfies:

1. **Weight `w` should be even** — because the sum of two even numbers is always even.
2. **Weight `w` should be greater than 2** — the smallest two even positive integers are 2 and 2, so the minimum `w` to split is 4.

If both conditions hold, print `"YES"`. Otherwise, print `"NO"`.

This approach runs in **O(1)** time and uses no extra space.

--