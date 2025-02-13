package arrays

import kotlin.math.log

/**
 * You are given a 0-indexed integer array nums, and an integer k.
 * In one operation, you can remove one occurrence of the smallest element of nums.
 * Return the minimum number of operations needed so that all elements of the array are greater than or equal to k.
 *
 * Example: Input: nums = [2,11,10,1,3], k = 10. Output: 3
 *
 * Constraints:
 * 1 <= nums.length <= 50
 * 1 <= nums[i] <= 109
 * 1 <= k <= 109
 * The input is generated such that there is at least one index i such that nums[i] >= k.
 *
 * Source: https://leetcode.com/problems/minimum-operations-to-exceed-threshold-value-i/description/?envType=problem-list-v2&envId=array
 */
fun minOperations(nums: IntArray, k: Int): Int {
    nums.sort()
    var res = 0
    for (num in nums) {
        if (num >= k) break
        res++
    }
    return res
}