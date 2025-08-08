# String Task Problem

## Problem Description

Petya started to attend programming lessons. On the first lesson his task was to write a simple program. The program was supposed to do the following: in the given string, consisting of uppercase and lowercase Latin letters, it:

- Deletes all the vowels.
- Inserts a character `"."` before each consonant.
- Replaces all uppercase consonants with corresponding lowercase ones.

Vowels are letters `"A"`, `"O"`, `"Y"`, `"E"`, `"U"`, `"I"` (both uppercase and lowercase), and the rest are consonants. The program's input is exactly one string, and it should return the output as a single string, resulting after processing the initial string.

Help Petya cope with this easy task.

---

### Input

- The first line contains the input string of Petya's program.  
- The string only consists of uppercase and lowercase Latin letters and its length is from 1 to 100, inclusive.

---

### Output

- Print the resulting string after processing.  
- It is guaranteed that this string is not empty.

---

## Approach

1. Read the input string.
2. Iterate through each character in the string:
   - If the character is a vowel (`A, O, Y, E, U, I` or lowercase variants), skip it.
   - Otherwise, convert the consonant to lowercase.
   - Insert a `"."` character before the consonant.
3. Build and print the resulting string.

This approach runs in **O(n)** time, where `n` is the length of the input string, and uses **O(n)** space for the output.

---
