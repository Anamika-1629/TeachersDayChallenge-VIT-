# Boy or Girl Problem

## Problem Description

On many online forums, boys sometimes use attractive girls’ pictures as their profile photos, making it hard to figure out the actual gender of a user just from their avatar.

Our protagonist has come up with a simple trick to make this decision:
- Count the total number of **unique characters** in the given username.
- If this number is **odd**, the user is considered **male**.
- If this number is **even**, the user is considered **female**.

Based on this rule, determine the gender category from the given username.

---

### Input

- The first and only line contains a non-empty string `s` — the username.
- The string consists solely of lowercase English letters (`a`–`z`).
- The length of the string is at most **100**.

---

### Output

- If the username corresponds to a female user (even number of unique characters), print: `CHAT WITH HER`
- If the username corresponds to a male user (odd number of unique characters), print: `IGNORE HIM`

---

## Approach

1. **Read the input** string `s`.
2. **Identify all unique characters** present in the string:
   - This can be achieved by:
     - Looping through characters and storing them in an `ArrayList` while avoiding duplicates, or
     - Using a `Set<Character>` which automatically ensures uniqueness.
3. **Count** the number of unique characters.
4. **Check the parity** of this count:
   - If even → print `"CHAT WITH HER"`
   - If odd → print `"IGNORE HIM"`
5. Output the result.

---

### Complexity Analysis

- **Time Complexity:** `O(n)` on average when using a `Set`, or `O(n²)` in the worst case with an `ArrayList` (acceptable for `n ≤ 100`).
- **Space Complexity:** `O(1)` — at most 26 unique lowercase letters can be stored.

---
