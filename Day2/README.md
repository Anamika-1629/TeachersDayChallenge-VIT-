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

To solve the problem, follow these steps:

1. **Initialize an empty result list** to store the output strings.
2. **Iterate** through the integers from `1` to `n` (inclusive).
3. For each integer `i`:
   - **Check divisibility by both 3 and 5** (`i % 15 == 0`):  
     Append `"FizzBuzz"` to the list.
   - **Else, check divisibility by 3** (`i % 3 == 0`):  
     Append `"Fizz"` to the list.
   - **Else, check divisibility by 5** (`i % 5 == 0`):  
     Append `"Buzz"` to the list.
   - **Otherwise**:  
     Append the string form of `i` to the list.
4. **Return the result list** after the loop completes.

This approach ensures each number is checked exactly once, producing the correct sequence in a single pass.

---

### Complexity Analysis

- **Time Complexity:** `O(n)` – each number is evaluated once.
- **Space Complexity:** `O(n)` – for storing the output list of length `n`.

---