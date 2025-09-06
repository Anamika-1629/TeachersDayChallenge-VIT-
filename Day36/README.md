# Lucky Division


## Problem Description

A lucky number is a positive integer whose decimal representation contains only the digits '4' and '7'. For example, 4, 7, 47, and 744 are lucky numbers, while 5, 17, and 467 are not.

A number is called *almost lucky* if it is divisible by at least one lucky number.
Given an integer \( n \), determine if it is almost lucky.

--

## Input

- A single integer \( n \) (1 ≤ \( n \) ≤ 1000).

--

## Output

- Print `"YES"` if \( n \) is almost lucky (divisible by any lucky number).
- Otherwise, print `"NO"`.

--

## Approach

1. Define a function to check if a number is lucky by verifying each digit is either '4' or '7'.  
2. Iterate over all numbers from 1 to \( n \):  
   - For each number, check if it is lucky and divides \( n \) without remainder.  
   - If such a number is found, return `"YES"`.  
3. If no such lucky divisor is found, return `"NO"`.

--

## Complexity Analysis

- **Time Complexity:** \( O(n \times k) \), where \( n \) is the input number and \( k \) is the number of digits in the divisor (maximum 4 for \( n \leq 1000 \)), due to digit checks in each iteration.
- **Space Complexity:** \( O(k) \) for string representation of the divisor.

---
