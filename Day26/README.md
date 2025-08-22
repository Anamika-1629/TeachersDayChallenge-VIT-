# A. Football

## Problem Description

Petya loves football very much. One day, while watching a match, he wrote down the players' positions as a string of zeros and ones, where '0' represents players from one team and '1' represents players from the other team. 

The situation is considered dangerous if there are at least 7 players of the same team standing consecutively in the queue. For example, "00100110111111101" is dangerous because it contains seven consecutive '1's, while "11110111011101" is not.

Given the current arrangement, determine whether the situation is dangerous.

---

## Input

- The input consists of a single non-empty string of characters '0' and '1', representing the positions of players.  
- The string length does not exceed 100 characters.  
- There is at least one player from each team.

---

## Output

- Print `"YES"` if the situation is dangerous (there is a sequence of at least 7 identical consecutive characters).  
- Otherwise, print `"NO"`.

---

## Approach

1. Initialize a counter to 1 to count consecutive identical characters.
2. Iterate through the string from the first to the second last character.
3. If the current character is the same as the next one, increment the counter.
4. If the counter reaches 7 or more, immediately return `"YES"`.
5. If the sequence breaks (current and next character differ), reset the counter to 1.
6. If the loop finishes without finding 7 consecutive identical characters, return `"NO"`.

This ensures an efficient single-pass check for dangerous situations.

---

## Complexity Analysis

- **Time Complexity:** `O(n)`, where `n` is the length of the string (maximum 100).  
- **Space Complexity:** `O(1)`, only counters and indices are used.

---

