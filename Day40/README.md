# George and Accommodation


## Problem Description

George needs to find a room for himself and his friend Alex in a dormitory. Each room has a certain number of people and a fixed capacity. George and Alex want to move into the same room, so they need at least two free spots.

Given the number of rooms and their current occupancy and capacities, determine how many rooms can accommodate both of them.

---

## Input

- The first line contains an integer \( n \) — the number of rooms (1 ≤ \( n \) ≤ 100).  
- Next \( n \) lines each contain two integers \( p_i \) and \( q_i \) (0 ≤ \( p_i \) ≤ \( q_i \) ≤ 100), the current number of occupants and the capacity of the \( i \)-th room.

---

## Output

- Print the number of rooms where George and Alex can both live (rooms with at least two free spots).

---

## Approach

- For each room, calculate available spots as \( q_i - p_i \).
- If available spots ≥ 2, increment count.
- Output the total count after checking all rooms.

---

## Complexity

- Time: \( O(n) \)  
- Space: \( O(n) \) for input storage

---
