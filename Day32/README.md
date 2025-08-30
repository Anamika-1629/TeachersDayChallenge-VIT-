# Lucky Number

## Problem Description

A number is called **lucky** if it contains only the digits '4' and '7'. Given an integer, determine whether it is a lucky number or not.

---

## Input

- A single integer \( n \) (usually within the range of a typical integer input).

---

## Output

- Print `"YES"` if the number is a lucky number (consists only of digits '4' and '7').
- Otherwise, print `"NO"`.

---

## Approach

1. Convert the integer to a string to examine each digit.
2. Iterate through each digit:
   - If any digit is not '4' or '7', return `"NO"`.
3. If all digits are '4' or '7', return `"YES"`.

---

## Complexity Analysis

- **Time Complexity:** \( O(k) \), where \( k \) is the number of digits in the number.
- **Space Complexity:** \( O(k) \) for the string representation of the number.

---
