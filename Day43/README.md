# cAPS lOCK


## Problem Description

The problem simulates the accidental usage of Caps Lock while typing a word. A word is considered typed with Caps Lock accidentally if:

- The entire word is in uppercase;  
- Or all letters except the first one are uppercase.

If either condition is met, the case of all letters should be reversed accordingly:
- All letters converted to lowercase if the whole word is uppercase.
- The first letter converted to uppercase and the remaining letters to lowercase if all letters except the first one are uppercase.

If neither is true, the word remains unchanged.

Given a word, transform it according to the rules outlined.

---

## Input

- A single word containing uppercase and lowercase Latin letters (1 to 100 characters).

---

## Output

- Print the transformed word after applying the rules, or the original word if the rules don't apply.

---

## Approach

- Check if the entire string is uppercase and convert to lowercase if true.  
- Else check if all letters except the first are uppercase, in which case change the first letter to uppercase and the rest to lowercase.  
- Otherwise, print the string unchanged.

---

## Complexity

- Time: \( O(n) \) for length \( n \) of the input string.  
- Space: \( O(n) \) for the transformed string.

---
