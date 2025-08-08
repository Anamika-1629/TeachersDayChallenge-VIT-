# Way Too Long Words Problem

## Problem Description

Sometimes some words like `"localization"` or `"internationalization"` are so long that writing them many times becomes tiresome.  
We call a word **too long** if its length is **strictly more than 10 characters**.

For **too long words**, we replace them with a special abbreviation:

- Keep the **first letter** of the word.
- Write the **number of letters** between the first and last letter.
- Keep the **last letter** of the word.

This number is in decimal and has no leading zeroes.  
Words of length **10 or less** remain unchanged.

**Examples:**
- `"localization"` → `"l10n"`
- `"internationalization"` → `"i18n"`

---

### Input

- The first line contains an integer `n` (1 ≤ n ≤ 100) — the number of words.
- The next `n` lines each contain a single lowercase Latin word (1 ≤ word length ≤ 100).

### Output

- Print `n` lines.
- The `i`‑th output line should contain the transformed version of the `i`‑th input word.

---

## Approach

1. Read the number of words `n`.
2. Iterate over each word:
   - If `length(word) > 10`:
     - Abbreviate it as:  
       `first_letter + (length - 2) + last_letter`
   - Else, keep the original word.
3. Output the processed words in the same order.

This approach runs in **O(n)** time, where `n` is the number of words,  
and uses **O(n)** space for storing results.

---
