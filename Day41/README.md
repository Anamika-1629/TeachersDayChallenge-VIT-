# Young Physicist


## Problem Description

Vasya is given \( n \) force vectors acting on a body at coordinates (0, 0, 0) in space. The body is in equilibrium if the sum of all force vectors is a zero vector. That means the sum of all \( x \)-coordinates, all \( y \)-coordinates, and all \( z \)-coordinates of the forces are zero.

Given the force vectors, determine if the body is in equilibrium.

---

## Input

- The first line contains an integer \( n \) (1 ≤ \( n \) ≤ 100) — the number of force vectors.
- Each of the next \( n \) lines contains three integers \( x_i, y_i, z_i \) (−100 ≤ \( x_i, y_i, z_i \) ≤ 100) representing the components of each force vector.

---

## Output

- Print `"YES"` if the body is in equilibrium.
- Otherwise, print `"NO"`.

---

## Approach

- Initialize sums of \( x, y, z \) components to zero.
- Sum the components of all vectors.
- Check if all sums are zero simultaneously.
- Return `"YES"` if true, otherwise `"NO"`.

---

## Complexity

- Time Complexity: \( O(n) \)  
- Space Complexity: \( O(n) \) for input storage

---
