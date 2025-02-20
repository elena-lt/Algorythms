package arrays

import kotlin.math.abs

/**
 * Given a 0-indexed integer array nums, find a 0-indexed integer array answer where:
 *
 * answer.length == nums.length.
 * answer[i] = |leftSum[i] - rightSum[i]|.
 * Where:
 *
 * leftSum[i] is the sum of elements to the left of the index i in the array nums. If there is no such element, leftSum[i] = 0.
 * rightSum[i] is the sum of elements to the right of the index i in the array nums. If there is no such element, rightSum[i] = 0.
 * Return the array answer.
 *
 * Example: Input: nums = [10,4,8,3]. Output: [15,1,11,22]
 *
 * Constraints:
 * 1 <= nums.length <= 1000
 * 1 <= nums[i] <= 105
 */
fun leftRightDifference(nums: IntArray): IntArray {
    val answer = IntArray(nums.size)

    var leftSum = 0
    var rightSum = 0
    for (i in 0 until nums.size) {
        rightSum += nums[i]
    }

    for (j in nums.indices) {
        rightSum -= nums[j]
        answer[j] = abs(leftSum - rightSum)
        leftSum += nums[j]
    }

    return answer
}

fun main() {
    println(leftRightDifference(intArrayOf(10)).toList())
}