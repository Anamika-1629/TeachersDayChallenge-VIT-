# Find Numbers with Even Number of Digits

[Problem Link](https://leetcode.com/problems/find-numbers-with-even-number-of-digits/)

## Problem Description

Given an array `nums` of integers, return how many of them contain an **even number of digits**.

---

## Approach

To solve this problem, we iterate through each number in the input array and check whether it has an even number of digits.

1. **Iterate through each number** in the input array `nums`.

2. For each number:
    - Convert the number to a **string** using `Integer.toString()`.
    - Get the length of the string, which corresponds to the **number of digits** in the number.
    > **Note:** This method counts all characters including the negative sign if the number is negative. To avoid counting the minus sign, use `Math.abs()` to get the absolute value before conversion.
    - Check if the digit count is **even** by using the modulo operation `% 2 == 0`.

3. Maintain a **counter** to keep track of how many numbers have an even number of digits.

4. After processing all numbers, **return the count**.

---
