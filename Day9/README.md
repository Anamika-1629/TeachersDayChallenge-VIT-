# Team Problem

## Problem Description

One day three best friends Petya, Vasya, and Tonya decided to form a team and take part in programming contests. Participants are usually offered several problems during programming contests.

Long before the start, the friends decided that they will implement a problem if **at least two** of them are sure about the solution. Otherwise, the friends won't write the problem's solution.

This contest offers `n` problems to the participants. For each problem, we know which friend is sure about the solution.

Help the friends find the number of problems for which they will write a solution.

---

### Input

- The first input line contains a single integer `n` (1 ≤ n ≤ 1000) — the number of problems in the contest.

- Then `n` lines follow, each containing three integers separated by spaces: each is either `0` or `1`.  
  - The first number indicates whether Petya is sure about the solution.  
  - The second number indicates Vasya's view.  
  - The third number indicates Tonya's view.

---

### Output

- Print a single integer — the number of problems the friends will implement in the contest.

---

## Approach

1. Read the integer `n`.

2. For each of the `n` problems:  
   - Read three integers representing Petya's, Vasya's, and Tonya's confidence (0 or 1).  
   - Count how many of them are sure (`1`s).  
   - If at least two friends are sure (count ≥ 2), increment the count of implementable problems.

3. After processing all problems, print the total count.

This approach runs in **O(n)** time and uses **O(n)** space, as you only need to read and process each problem once.

---
