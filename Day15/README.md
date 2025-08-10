# Boy or Girl Problem

## Problem Description

Many boys use pretty girls' photos as avatars in online forums, which makes it difficult to tell the real gender of a user from their profile picture.  

Our hero came up with a simple method to decide:
- Count the number of **distinct characters** in the given username.
- If the count is **odd**, then the user is **male**.
- If the count is **even**, then the user is **female**.

Given the username, determine the output using this method.

---

### Input

- The first line contains a non-empty string `s` — the username.
- The string consists only of lowercase English letters (`a`–`z`).
- The length of the string ≤ **100**.

---

### Output

- If the username corresponds to a female (even number of distinct characters), print: CHAT WITH HER
- If the username corresponds to a male (odd number of distinct characters), print: IGNORE HIM

---

## Approach

1. **Read the input string** `s`.
2. **Collect unique characters** from the string:
 - Can be done using:
   - A loop with an `ArrayList<Character>` checking duplicates, or
   - A `Set<Character>` for automatic uniqueness.
3. **Count the number of unique characters**.
4. **Check parity**:
 - If the count is even → `"CHAT WITH HER!"`
 - Else → `"IGNORE HIM!"`
5. Print the result.

---

### Complexity Analysis

- **Time Complexity:** `O(n)` on average using a `Set`, or `O(n²)` in worst case with an `ArrayList` (fine for `n ≤ 100`).
- **Space Complexity:** `O(1)` — at most 26 different lowercase English letters.

---


