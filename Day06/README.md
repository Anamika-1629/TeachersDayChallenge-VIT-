# 20. Valid Parentheses

[Problem Link](https://leetcode.com/problems/valid-parentheses/)

## Problem Description

Given a string `s` containing just the characters `'('`, `')'`, `'{'`, `'}'`, `'['` and `']'`, determine if the input string is valid.

An input string is valid if:

- Open brackets must be closed by the **same type** of brackets.
- Open brackets must be closed in the **correct order**.
- Every close bracket has a corresponding open bracket of the same type.

--

## Approach

To solve this problem, we use a stack data structure to keep track of the opening brackets:

1. **Iterate through each character** in the string:
   - If it's an opening bracket `(`, `{`, or `[`, push it onto the stack.
   - If it's a closing bracket `)`, `}`, or `]`:
     - If the stack is empty, return `false` (no matching opening bracket).
     - Otherwise, check the top of the stack:
       - If the top is the matching opening bracket, pop it from the stack.
       - If it does not match, return `false`.

2. After processing all characters, the string is valid if the stack is empty (all brackets matched correctly).

This approach runs in **O(n)** time, where n is the length of the string, and uses **O(n)** space in the worst case for the stack.

--