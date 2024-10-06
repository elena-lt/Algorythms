package arrays

/**
 * Given an array of integers `nums` and an integer `target`,
 * return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 * Example:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 *
 * Source: https://leetcode.com/problems/two-sum/description/?envType=problem-list-v2&envId=array&
 */
fun main() {
    val inputs = listOf(
        Pair(intArrayOf(2, 7, 11, 15), 9),
        Pair(intArrayOf(11, 15, 7, 2), 9),
        Pair(intArrayOf(3, 2, 3), 6),
        Pair(intArrayOf(3, 2, 4), 6),
    )

    inputs.forEach { println(twoSumV2(it.first, it.second).toList()) }
}

private fun twoSum(nums: IntArray, target: Int): IntArray {
    for (i in nums.indices) {
        for (n in i + 1 until nums.size) {
            if (nums[i] + nums[n] == target) {
                return intArrayOf(i, n)
            }
        }
    }

    return intArrayOf()
}

private fun twoSumV2(nums: IntArray, target: Int): IntArray {
    val map = mutableMapOf<Int, Int>()

    for (i in nums.indices) {
        val complement = target - nums[i]
        if (map.contains(complement)) {
            return intArrayOf(map[complement]!!, i)
        } else {
            map[nums[i]] = i
        }
    }

    return intArrayOf()
}
