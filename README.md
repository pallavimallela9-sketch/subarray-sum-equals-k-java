# Subarray Sum Equals K

## LeetCode Problem

**Problem Number:** 560 - Subarray Sum Equals K

## Problem Description

Given an integer array `nums` and an integer `k`, find the total number of continuous subarrays whose sum is equal to `k`.

## Example

### Input

```text
nums = [1, 1, 1]
k = 2
```

### Output

```text
2
```

## Explanation

There are two continuous subarrays whose sum is equal to `2`:

```text
[1, 1]
[1, 1]
```

Therefore, the answer is `2`.

## Approach

The solution uses **Prefix Sum and HashMap**.

For every element, calculate the current prefix sum.

If:

```text
currentPrefixSum - k
```

already exists in the HashMap, then a subarray with sum `k` has been found.

The HashMap stores each prefix sum and the number of times it has appeared.

## Concepts Used

* Arrays
* HashMap
* Prefix Sum
* Subarrays
* Frequency Counting

## Time Complexity

`O(n)`

## Space Complexity

`O(n)`

## Language

Java

## File Name

`SubarraySumEqualsK.java`

## Author

**M. Pallavi**
