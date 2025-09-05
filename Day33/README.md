# Ultra-Fast Mathematician


## Problem Description

You are given two numbers consisting only of digits '0' and '1', both having the same length. The task is to produce a new number of the same length, where each digit is '1' if the corresponding digits of the two input numbers differ, and '0' if they are the same. Leading zeros must be preserved in the output.

--

## Input

- Two lines, each containing a binary number (string of '0' and '1').
- Both numbers have the same length, up to 100 digits.

--

## Output

- Print one line — the resulting binary number formed by digit-wise comparison:  
  '1' if the digits differ, '0' if they are the same.

--

## Approach

1. Read both input numbers as strings to preserve leading zeros.  
2. Iterate through each digit index:  
   - Append '1' to the result if digits differ.  
   - Else append '0'.  
3. Print the resulting string.

--

## Complexity Analysis

- **Time Complexity:** \( O(n) \), where \( n \) is the length of the input numbers.  
- **Space Complexity:** \( O(n) \) for the output string.

---
