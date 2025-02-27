package arrays

/**
 * Given an array nums of integers, return how many of them contain an even number of digits.
 *
 * Example: Input: nums = [12,345,2,6,7896]. Output: 2
 *
 * Constraints:
 * 1 <= nums.length <= 500
 * 1 <= nums[i] <= 105
 *
 * Source: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/?envType=problem-list-v2&envId=array
 */
fun findNumbers(nums: IntArray): Int {
    var count = 0

    for (num in nums) {
        if (num.toString().length % 2 == 0) count++
    }
    return count
}