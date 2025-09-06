# I_love_%username%


## Problem Description

Vasya tracks the scores of his favorite coder in multiple contests. A performance is called *amazing* if the coder scores strictly more than all previous contests (breaks the maximum record) or strictly less than all previous contests (breaks the minimum record). The first contest is not considered amazing.

Given the scores in chronological order, count the number of amazing performances.

---

## Input

- The first line contains an integer \( n \) — the number of contests (1 ≤ \( n \) ≤ 1000).  
- The second line contains \( n \) space-separated integers — the scores of the coder in each contest (0 ≤ score ≤ 10000).

---

## Output

- Print a single integer — the count of amazing performances.

---

## Approach

1. Initialize `min` and `max` with the first contest score.  
2. Iterate over the remaining scores:  
   - If the current score is greater than `max`, increment count and update `max`.  
   - If the current score is less than `min`, increment count and update `min`.  
3. Return the total count.

---

## Complexity

- Time: \( O(n) \)  
- Space: \( O(n) \) for input storage

---
