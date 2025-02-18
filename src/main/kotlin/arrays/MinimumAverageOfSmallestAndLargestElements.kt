package arrays

/**
 * You have an array of floating point numbers averages which is initially empty.
 * You are given an array nums of n integers where n is even.
 * You repeat the following procedure n / 2 times:
 *
 * Remove the smallest element, minElement, and the largest element maxElement, from nums.
 * Add (minElement + maxElement) / 2 to averages.
 * Return the minimum element in averages.
 *
 * Example: Input: nums = [7,8,3,4,15,13,4,1]. Output: 5.5
 *
 * Constraints:
 * 2 <= n == nums.length <= 50
 * n is even
 * 1 <= nums[i] <= 50
 *
 * Source: https://leetcode.com/problems/minimum-average-of-smallest-and-largest-elements/description/?envType=problem-list-v2&envId=array
 */
fun minimumAverage(nums: IntArray): Double {
    val sortedNums = nums.sorted()

    var left = 0
    var right = sortedNums.size - 1

    var min = sortedNums[right] * 1.0

    while (left < right) {
        val res = (sortedNums[left] + sortedNums[right]) / 2.0
        left++
        right--

        min = minOf(min, res)
    }

    return min
}