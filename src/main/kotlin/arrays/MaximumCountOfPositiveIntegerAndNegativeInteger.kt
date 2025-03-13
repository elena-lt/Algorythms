package arrays

import kotlin.math.max

/**
 * Given an array nums sorted in non-decreasing order, return the maximum between the number
 * of positive integers and the number of negative integers.
 * In other words, if the number of positive integers in nums is pos and the number of negative integers is neg,
 * then return the maximum of pos and neg. Note that 0 is neither positive nor negative.
 *
 * Example: Input: nums = [-2,-1,-1,1,2,3]. Output: 3
 *
 * Constraints:
 * 1 <= nums.length <= 2000
 * -2000 <= nums[i] <= 2000
 * nums is sorted in a non-decreasing order.
 *
 * Source: https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/description/?envType=problem-list-v2&envId=array
 */
fun maximumCount(nums: IntArray): Int {
    var neg = 0
    for (i in nums.indices) {
        if (nums[i] > 0) {
            return max(nums.size - i, neg)
        } else if (nums[i] < 0) {
            neg++
        }
    }

    return neg
}