# Calculating Function


## Problem Description

Given a positive integer \( n \), define the function \( f(n) \) as:  
\[
f(n) = -1 + 2 - 3 + 4 - 5 + \cdots + (-1)^n n
\]
Your task is to calculate \( f(n) \) efficiently for a given \( n \).

---

## Input

- A single positive integer \( n \) (1 ≤ \( n \) ≤ \( 10^{15} \)).

---

## Output

- Print the value of \( f(n) \).

---

## Approach

- Notice the pattern of the sum:
  - For even \( n \), \( f(n) = \frac{n}{2} \).
  - For odd \( n \), \( f(n) = -\frac{n+1}{2} \).
- Use this direct mathematical formula to calculate \( f(n) \) without looping, which is efficient for very large \( n \).

---

## Complexity

- Time Complexity: \( O(1) \)  
- Space Complexity: \( O(1) \)

---
