# 125. Valid Palindrome

[Problem Link](https://leetcode.com/problems/valid-palindrome/)

## Problem Description

A phrase is a **palindrome** if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string `s`, return **true** if it is a palindrome, or **false** otherwise.

---

## Approach

To solve this problem, we perform the following steps:

1. **Normalize the input string:**
   - Convert all uppercase letters in the string to lowercase.
   - Remove all characters that are not alphanumeric (letters or digits).

2. **Check if the normalized string is a palindrome:**
   - Compare the normalized string with its reversed counterpart.
   - If both are equal, the string is a palindrome; otherwise, it is not.

This approach ensures that case and non-alphanumeric characters do not affect the palindrome check.

---
