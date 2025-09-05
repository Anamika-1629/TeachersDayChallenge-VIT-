# Panoramix's Prediction


## Problem Description

A prime number is a number that has exactly two distinct divisors: 1 and itself. For example, 2, 3, and 7 are prime, while 1, 4, and 6 are not. The *next prime number* after a number \( x \) is the smallest prime number greater than \( x \).

Panoramix predicts that if the Gauls beat exactly \( n \) Roman soldiers on one day, where \( n \) is prime, and then beat \( m \) Roman soldiers the next day, where \( m \) is the *next prime* after \( n \), then a great event is about to happen.

Given \( n \) and \( m \), determine if \( m \) is indeed the next prime after \( n \).

--

## Input

- Two integers \( n \) and \( m \) such that \( 2 \leq n < m \leq 50 \).
- It is guaranteed that \( n \) is prime.

--

## Output

- Print `"YES"` if \( m \) is the next prime number after \( n \).
- Otherwise, print `"NO"`.

--

## Approach

1. Check if \( m \) is a prime number.  
2. Check all numbers between \( n+1 \) and \( m-1 \):
   - If any number in this range is prime, \( m \) is not the immediate next prime; print `"NO"`.
3. If \( m \) is prime and no primes lie between \( n \) and \( m \), print `"YES"`.

--

## Complexity Analysis

- **Time Complexity:** \( O(\sqrt{m}) \) for primality checks times the number of checks between \( n \) and \( m \). Since \( n \) and \( m \leq 50 \), this is very efficient.
- **Space Complexity:** \( O(1) \).

---
