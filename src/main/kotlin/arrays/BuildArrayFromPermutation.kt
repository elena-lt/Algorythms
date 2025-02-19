package arrays

/**
 * Given a zero-based permutation nums (0-indexed), build an array ans of the same length
 * where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
 * A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).
 *
 * Example: Input: nums = [0,2,1,5,3,4]
 * Source: https://leetcode.com/problems/build-array-from-permutation/?envType=problem-list-v2&envId=array
 */
fun buildArray(nums: IntArray): IntArray {
    val ans = IntArray(nums.size)
    for (i in nums.indices) {
        ans[i] = nums[nums[i]]
    }
    return ans
}