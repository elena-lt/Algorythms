package arrays

/**
 * You are given an integer array nums of length n.
 * A partition is defined as an index i where 0 <= i < n - 1, splitting the array into two non-empty subarrays such that:
 *
 * Left subarray contains indices [0, i].
 * Right subarray contains indices [i + 1, n - 1].
 * Return the number of partitions where the difference between the sum of the left and right subarrays is even.
 *
 * Example: Input: nums = [10,10,3,7,6]. Output: 4
 *
 * Constraints:
 * 2 <= n == nums.length <= 100
 * 1 <= nums[i] <= 100
 *
 * Source: https://leetcode.com/problems/count-partitions-with-even-sum-difference/description/?envType=problem-list-v2&envId=array
 */
fun countPartitions(nums: IntArray): Int {
    var count = 0
    var totalSum = nums.sum()

    for (i in 0 until nums.size) {
        totalSum += nums[i]
    }

    var left = 0
    var right = totalSum
    for (i in 0 until nums.size - 1) {
        left += nums[i]
        right -= nums[i]
        if ((left - right) % 2 == 0) {
            count++
        }
    }

    return count
}

fun main() {
    println(countPartitions(intArrayOf(10, 10, 3, 7, 6)))
}