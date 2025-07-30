# 13. Roman to Integer

[Problem Link](https://leetcode.com/problems/roman-to-integer/)

## Problem Description

Roman numerals are represented by seven different symbols: `I`, `V`, `X`, `L`, `C`, `D`, and `M`.

| Symbol | Value |
|--------|--------|
| I      | 1      |
| V      | 5      |
| X      | 10     |
| L      | 50     |
| C      | 100    |
| D      | 500    |
| M      | 1000   |

For example, 
- 2 is written as `II` in Roman numeral, just two ones added together.  
- 12 is written as `XII`, which is simply `X` + `II`.  
- 27 is written as `XXVII`, which is `XX` + `V` + `II`.

**Given a Roman numeral, convert it to an integer.**

--

## Approach

To convert a Roman numeral to an integer, the following steps are performed:

1. **Map each Roman symbol to its integer value** using a hash map.

2. **Traverse the Roman numeral string from left to right**:
   - For each character, get its integer value.
   - Look ahead to the next character's value (if any).
   - If the next value is larger than the current, subtract the current value (to handle cases like IV, IX).
   - Otherwise, add the current value.

3. **Sum up all the adjusted values** to get the final integer.

This approach handles both normal addition and subtraction logic in one pass through the string.

--