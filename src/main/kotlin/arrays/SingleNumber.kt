package arrays

/**
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 *
 * Example: Input: nums = [2,2,1]. Output: 1
 *
 * Constraints:
 * 1 <= nums.length <= 3 * 104
 * -3 * 104 <= nums[i] <= 3 * 104
 * Each element in the array appears twice except for one element which appears only once.
 *
 * Source: https://leetcode.com/problems/single-number/description/?envType=problem-list-v2&envId=array
 */
fun singleNumber(nums: IntArray): Int {
    val freq = HashMap<Int, Int>()
    for (num in nums) {
        freq[num] = (freq[num] ?: 0) + 1
    }

    for ((value, count) in freq) {
        if (count == 1) return value
    }

    return -1
}