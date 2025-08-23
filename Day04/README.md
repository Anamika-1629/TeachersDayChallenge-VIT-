# Two Sum

[Problem Link](https://leetcode.com/problems/two-sum/)

## Problem Description

Given an array of integers `nums` and an integer `target`, return the indices of the two numbers such that they add up to `target`.

You may assume that each input would have **exactly one solution**, and you may not use the **same element twice**.

You can return the answer in **any order**.

--

## Approach

To solve this problem efficiently, we use a hash map to store the numbers we have seen so far and their indices while iterating through the array.

1. **Initialize a hash map** to store number-to-index mappings.

2. **Iterate over each element** in the array:
   - Calculate `complement = target - current_number`.
   - Check if `complement` exists in the map:
     - If yes, return the indices of `complement` and the current number.
     - If no, store the current number and its index in the map.

--

