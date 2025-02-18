package arrays

import kotlin.math.abs

/**
 * You are given a positive integer array nums.
 *
 * The element sum is the sum of all the elements in nums.
 * The digit sum is the sum of all the digits (not necessarily distinct) that appear in nums.
 * Return the absolute difference between the element sum and digit sum of nums.
 *
 * Note that the absolute difference between two integers x and y is defined as |x - y|.
 *
 * Example: Input: nums = [1,15,6,3]. Output: 9
 *
 * Constraints:
 * 1 <= nums.length <= 2000
 * 1 <= nums[i] <= 2000
 *
 * Source: https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/description/?envType=problem-list-v2&envId=array
 */
//Time complexity: O(nm), where n = nums.size, m = max length of nums[i]
fun differenceOfSum(nums: IntArray): Int {
    var elemSum = 0
    var digitsSum = 0

    for (i in 0 until nums.size) {
        elemSum += nums[i]

        if (nums[i].toString().length > 1) {
            for (n in 0 until nums[i].toString().length) {
                digitsSum += nums[i].toString()[n].digitToInt()
            }
        } else {
            digitsSum += nums[i]
        }
    }

    return abs(elemSum - digitsSum)
}