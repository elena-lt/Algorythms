package arrays

/**
 * You are given an integer array nums (0-indexed). In one operation, you can choose an element of the array and increment it by 1.
 *
 * For example, if nums = [1,2,3], you can choose to increment nums[1] to make nums = [1,3,3].
 * Return the minimum number of operations needed to make nums strictly increasing.
 *
 * An array nums is strictly increasing if nums[i] < nums[i+1] for all 0 <= i < nums.length - 1.
 * An array of length 1 is trivially strictly increasing.
 *
 * Example: Input: nums = [1,1,1]. Output: 3
 *
 * Constraints:
 * 1 <= nums.length <= 5000
 * 1 <= nums[i] <= 104
 *
 * Source: https://leetcode.com/problems/minimum-operations-to-make-the-array-increasing/description/?envType=problem-list-v2&envId=array
 */
fun minOperations(nums: IntArray): Int {
    if (nums.size == 1) return 0
    var count = 0
    var prefNum = 0

    for (i in 0 until nums.size - 1) {
        when {
            nums[i] + prefNum == nums[i + 1] -> {
                count++
                prefNum = 1
            }

            nums[i] + prefNum > nums[i + 1] -> {
                val diff = nums[i] + prefNum + 1
                prefNum = diff - nums[i + 1]
                count += diff - nums[i + 1]
            }

            else -> prefNum = 0
        }
    }
    return count
}

fun minOperationsV2(nums: IntArray): Int {
    var count = 0
    for (i in 1 until nums.size) {
        if (nums[i] <= nums[i - 1]) {
            val diff = nums[i - 1] + 1 - nums[i]
            count += diff
            nums[i] = nums[i] + diff
        }
    }

    return count
}
