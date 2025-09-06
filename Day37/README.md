# HQ9+


## Problem Description

HQ9+ is a joke programming language with four possible instructions:
- **'H'**: prints "Hello, World!"
- **'Q'**: prints the program's source code
- **'9'**: prints the lyrics of "99 Bottles of Beer"
- **'+'**: increments an internal accumulator (does not produce output)

Given a string representing an HQ9+ program, determine whether executing the program will produce any output.

---

## Input

- A single string \( p \) containing between 1 and 100 characters (ASCII 33 to 126).

---

## Output

- Print `"YES"` if the program will produce output.
- Otherwise, print `"NO"`.

---

## Approach

Scan the string for the characters `'H'`, `'Q'`, or `'9'`.  
If any of these appear, the program produces output; print `"YES"`.  
If none appear, print `"NO"`.

---

## Complexity

- **Time:** \( O(n) \), where \( n \) is the length of the input string.
- **Space:** \( O(1) \).

---
