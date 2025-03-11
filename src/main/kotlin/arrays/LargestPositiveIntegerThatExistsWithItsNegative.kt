package arrays

import kotlin.math.max

/**
 * Given an integer array nums that does not contain any zeros, find the largest positive integer k
 * such that -k also exists in the array.
 * Return the positive integer k. If there is no such integer, return -1.
 *
 * Example: Input: nums = [-1,2,-3,3]
 */
fun findMaxK(nums: IntArray): Int {
    val neg = mutableSetOf<Int>()

    for (num in nums) {
        if (num < 0) neg.add(num)
    }
    var maxPos = -1
    for (num in nums) {
        if (num > 0) {
            if (-num in neg) {
                maxPos = max(maxPos, num)
            }
        }
    }
    return maxPos
}