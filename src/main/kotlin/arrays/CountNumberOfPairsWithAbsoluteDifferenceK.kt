package arrays

import kotlin.math.abs

/**
 * Given an integer array nums and an integer k, return the number of pairs (i, j) where i < j such that |nums[i] - nums[j]| == k.
 *
 * The value of |x| is defined as:
 *
 * x if x >= 0.
 * -x if x < 0.
 *
 * Example: Input: nums = [1,2,2,1], k = 1. Output: 4
 *
 * Constraints:
 * 1 <= nums.length <= 200
 * 1 <= nums[i] <= 100
 * 1 <= k <= 99
 *
 * Source: https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/description/?envType=problem-list-v2&envId=array
 */
fun countKDifference(nums: IntArray, k: Int): Int {
    var count = 0

    for (i in 0 until nums.size - 1) {
        for (j in i + 1 until nums.size) {
            if (abs(nums[i] - nums[j]) == k) count++
        }
    }
    return count
}

fun main() {
    println(countKDifference(intArrayOf(1, 3), 3))
}