package arrays

/**
 * An array is considered special if the parity of every pair of adjacent elements is different.
 * In other words, one element in each pair must be even, and the other must be odd.
 * You are given an array of integers nums. Return true if nums is a special array, otherwise, return false.
 *
 * Example: Input: nums = [2,1,4]. Output: true
 *
 * Constraints:
 * 1 <= nums.length <= 100
 * 1 <= nums[i] <= 100
 *
 * Source: https://leetcode.com/problems/special-array-i/description/?envType=problem-list-v2&envId=array
 */
fun isArraySpecial(nums: IntArray): Boolean {
    for (i in 0 until nums.size - 1) {
        if (nums[i] % 2 == 0) {
            if (nums[i + 1] % 2 == 0) return false
        } else {
            if (nums[i + 1] % 2 != 0) return false
        }
    }

    return true
}