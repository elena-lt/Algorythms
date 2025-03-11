package arrays

/**
 * You are given a 0-indexed array nums of size n consisting of non-negative integers.
 *
 * You need to apply n - 1 operations to this array where, in the ith operation (0-indexed),
 * you will apply the following on the ith element of nums:
 *
 * If nums[i] == nums[i + 1], then multiply nums[i] by 2 and set nums[i + 1] to 0. Otherwise, you skip this operation.
 * After performing all the operations, shift all the 0's to the end of the array.
 *
 * For example, the array [1,0,2,0,0,1] after shifting all its 0's to the end, is [1,2,1,0,0,0].
 * Return the resulting array.
 *
 * Note that the operations are applied sequentially, not all at once.
 *
 * Example: Input: nums = [1,2,2,1,1,0]. Output: [1,4,2,0,0,0]
 *
 * Constraints:
 * 2 <= nums.length <= 2000
 * 0 <= nums[i] <= 1000
 *
 * Source: https://leetcode.com/problems/apply-operations-to-an-array/description/?envType=problem-list-v2&envId=array
 */
fun applyOperations(nums: IntArray): IntArray {

    for (i in 0 until nums.size - 1) {
        if (nums[i] == nums[i + 1]) {
            nums[i] = nums[i] * 2
            nums[i + 1] = 0
        }
    }
    val ans = IntArray(nums.size)

    var right = nums.size - 1
    var left = 0
    for (i in nums.indices) {
        if (nums[i] > 0) {
            ans[left] = nums[i]
            left++
        } else {
            ans[right] = nums[i]
            right--
        }
    }
    return ans
}

fun main() {
    applyOperations(intArrayOf(1, 2, 2, 1, 1, 0))
}