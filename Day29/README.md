# A. Anton and Danik

## Problem Description

Anton and Danik are friends who like to play chess. They have played **n** games in a row, and for each game, it is known who won — either Anton or Danik. None of the games ended in a tie.

The task is to determine who won more games: Anton or Danik. If both won the same number of games, print "Friendship".

---

## Input

- The first line contains a single integer \( n \) \((1 \leq n \leq 100000)\) — the number of games played.
- The second line contains a string \( s \) of length \( n \), consisting of uppercase English letters 'A' and 'D'. The \( i \)-th character of \( s \) is 'A' if Anton won the \( i \)-th game, and 'D' if Danik won.

---

## Output

- If Anton won more games than Danik, print "Anton".
- If Danik won more games than Anton, print "Danik".
- If both won the same number of games, print "Friendship".

---

## Approach

1. Count the number of games won by Anton (count of 'A' characters).
2. Count the number of games won by Danik (count of 'D' characters).
3. Compare the counts:
   - Print "Anton" if Anton's count is higher.
   - Print "Danik" if Danik's count is higher.
   - Print "Friendship" if both counts are equal.

---

## Complexity Analysis

- **Time Complexity:** \( O(n) \) — counting through the string of length \( n \).
- **Space Complexity:** \( O(1) \) — only counters and input string space

---