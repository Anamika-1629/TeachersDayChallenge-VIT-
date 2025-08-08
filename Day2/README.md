# Fizz Buzz

[Problem Link](https://leetcode.com/problems/fizz-buzz/)

## Problem Description

Given an integer `n`, return a **string array** `answer` (1-indexed) where:

- `answer[i] == "FizzBuzz"` if `i` is divisible by **both 3 and 5**.
- `answer[i] == "Fizz"` if `i` is divisible by **3** only.
- `answer[i] == "Buzz"` if `i` is divisible by **5** only.
- `answer[i] == i` (as a string) if none of the above conditions are true.

---

### Input

- An integer `n` (1 ≤ n ≤ 10⁴) representing the length of the list to generate.

---

### Output

- A list of strings of length `n`, where the `i`-th element corresponds to the rules described above for number `i+1`.

---

## Approach

To solve this problem, we iterate through the numbers from 1 to `n` (inclusive) and apply the following checks for each number `i`:

1. **Check if `i` is divisible by both 3 and 5 (i.e., `i % 15 == 0`):**
   - If yes, append `"FizzBuzz"` to the result list.

2. **Else, check if `i` is divisible by 3 alone (i.e., `i % 3 == 0`):**
   - If yes, append `"Fizz"` to the result list.

3. **Else, check if `i` is divisible by 5 alone (i.e., `i % 5 == 0`):**
   - If yes, append `"Buzz"` to the result list.

4. **Otherwise:**
   - Append the string representation of the number `i` to the result list.

After iterating through all numbers, return the result list containing the correct strings for each number according to the Fizz Buzz rules.

---
