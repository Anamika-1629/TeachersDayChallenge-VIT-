# A. Bear and Big Brother

## Problem Description

Bear Limak wants to become the largest bear, or at least larger than his brother Bob. Initially, Limak weighs \( a \) and Bob weighs \( b \), with the guarantee that \( a \leq b \).

Every year, Limak’s weight triples, and Bob’s weight doubles. The task is to find out after how many full years Limak will become strictly heavier than Bob.

---

## Input

- A single line with two integers \( a \) and \( b \) \((1 \leq a \leq b \leq 10)\) — the initial weights of Limak and Bob respectively.

---

## Output

- Print one integer — the number of full years after which Limak’s weight becomes strictly greater than Bob’s weight.

---

## Explanation

- In the first sample, initially Limak weighs 4 and Bob 7.
- After 1 year: Limak = \(4 \times 3 = 12\), Bob = \(7 \times 2 = 14\) (Limak not heavier yet).
- After 2 years: Limak = \(12 \times 3 = 36\), Bob = \(14 \times 2 = 28\) (Limak heavier).
- So, answer is 2 years.

---

## Approach

1. Initialize a counter for years to 0.
2. While Limak’s weight is less than or equal to Bob’s:
   - Multiply Limak’s weight by 3.
   - Multiply Bob’s weight by 2.
   - Increment the years counter.
3. Return the years counter.

---

## Complexity Analysis

- **Time Complexity:** \(O(y)\), where \(y\) is the number of years taken for Limak to exceed Bob. Since \(a, b \leq 10\), this is very efficient.
- **Space Complexity:** \(O(1)\), only variables for weights and counter are used.

---

