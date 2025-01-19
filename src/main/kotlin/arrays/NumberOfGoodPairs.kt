package arrays

/**
 * Given an array of integers nums, return the number of good pairs.
 *
 * A pair (i, j) is called good if nums[i] == nums[j] and i < j.
 *
 * Example:
 * Input: [2, 3, 2] Output: 2 [(2, 2)]
 * Input: [1,2,3,1,1,3], Output: 4
 *
 * Constraints:
 * 1 <= nums.length <= 100
 * 1 <= nums[i] <= 100
 *
 * Source: https://leetcode.com/problems/number-of-good-pairs/description/?envType=problem-list-v2&envId=array
 */
fun main() {
    val inputs = listOf(
        intArrayOf(1, 2, 3, 1, 1, 3), //4
        intArrayOf(1, 1, 1, 1), //6
        intArrayOf(1, 2, 3), //0
    )
    inputs.forEach { println(numIdenticalPairsV2(it)) }
}

/**
 * Time complexity: O(n)
 */
fun numIdenticalPairsV2(nums: IntArray): Int {
    val map = mutableMapOf<Int, Int>()
    var res = 0
    for (i in nums.indices) {
        val num = nums[i]
        val currValue = map[num] ?: 0
        map[num] = currValue + 1
    }
    map.forEach { res += (it.value * (it.value - 1)) / 2 }
    return res
}

/**
 * Time complexity: O(n^2)
 * Space complexity: O(1)
 */
fun numIdenticalPairs(nums: IntArray): Int {
    var result = 0
    for (i in 0 until nums.size - 1) {
        for (j in i + 1 until nums.size) {
            if (nums[i] == nums[j]) result++
        }
    }
    return result
}