# B. Queue at the School

## Problem Description

A queue of boys and girls is formed in a canteen. Every second, if a boy stands immediately before a girl, they swap places. Given the initial queue and a time `t`, determine the order of the queue after `t` seconds.

---

## Input

- The first line contains two integers `n` and `t` (1 ≤ n, t ≤ 50) — the number of children in the queue and the number of seconds after which you need to find the arrangement.
- The second line contains a string `s` of length `n`. The `i`-th character of `s` is either:
  - `"B"` if the child at position `i` is a boy.
  - `"G"` if the child at position `i` is a girl.

---

## Output

- Print a single string representing the arrangement of the queue after `t` seconds.
- The `i`-th character should be `"B"` if a boy is at position `i` after `t` seconds, or `"G"` if a girl is there.

---

## Approach

1. Convert the string `s` to a list or character array to easily swap characters.
2. For each second from 0 to `t - 1`:
   - Traverse the queue from the beginning to the second last position.
   - Whenever you find a boy ('B') followed immediately by a girl ('G'), swap them.
   - After a swap, skip the next position to avoid double swaps in the same second.
3. After simulating all `t` seconds, convert the list back to a string.
4. Return or print the final string.

This approach simulates exactly what the problem describes, ensuring that the boys let the girls forward step-by-step for every second.

---

## Complexity Analysis

- **Time Complexity:** `O(n * t)` — For each of the `t` seconds, you scan the queue once (up to `n` elements).
- **Space Complexity:** `O(n)` — Lines to store and update the queue as a list or character array.

---

This solution efficiently simulates the queue transformation process in a straightforward manner without extra space or complex data structures.
