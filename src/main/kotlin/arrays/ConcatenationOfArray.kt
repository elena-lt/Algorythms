package arrays

/**
 * Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
 * Specifically, ans is the concatenation of two nums arrays.
 * Return the array ans.
 *
 * Example: Input: nums = [1,2,1]. Output: [1,2,1,1,2,1]
 *
 * Constraints:
 * n == nums.length
 * 1 <= n <= 1000
 * 1 <= nums[i] <= 1000
 *
 * Source: https://leetcode.com/problems/concatenation-of-array/description/?envType=problem-list-v2&envId=array
 */
fun getConcatenation(nums: IntArray): IntArray {
    val ans = IntArray(nums.size * 2)

    for (i in nums.indices) {
        ans[i] = nums[i]
        ans[i + nums.size] = nums[i]
    }
    return ans
}