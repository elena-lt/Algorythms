package arrays

/**
 * Given an integer array nums containing distinct positive integers, find and return any number
 * from the array that is neither the minimum nor the maximum value in the array, or -1 if there is no such number.
 * Return the selected integer.
 *
 * Example: Input: nums = [3,2,1,4]. Output: 2
 *
 * Constraints:
 * 1 <= nums.length <= 100
 * 1 <= nums[i] <= 100
 * All values in nums are distinct
 *
 * Source: https://leetcode.com/problems/neither-minimum-nor-maximum/description/?envType=problem-list-v2&envId=array
 */
fun findNonMinOrMax(nums: IntArray): Int {
    if (nums.size <= 2) return -1

    var minInd = 0
    var maxInd = 0

    for (i in nums.indices) {
        if (nums[i] < nums[minInd]) {
            minInd = i
        } else if (nums[i] > nums[maxInd]) {
            maxInd = i
        }
    }

    for (i in nums.indices) {
        if (i != minInd && i != maxInd) return i
    }
    return -1
}