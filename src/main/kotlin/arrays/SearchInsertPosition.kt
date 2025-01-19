package arrays

/**
 * Given a sorted array of distinct integers and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 * Example:
 * Input: nums = [1,3,5,6], target = 5, Output 2
 * Input: nums = [1,3,5,6], target = 2, Output: 1
 * Input: nums = [1,3,5,6], target = 7, Output: 4
 *
 * Constraints:
 *
 * 1 <= nums.length <= 104
 * -104 <= nums[i] <= 104
 * -nums contains distinct values sorted in ascending order.
 * -104 <= target <= 104
 *
 * Source: https://leetcode.com/problems/search-insert-position/description/?envType=problem-list-v2&envId=array
 */
fun main() {
    val inputs = listOf(
        Pair(intArrayOf(1, 3, 5, 6), 5), //2
        Pair(intArrayOf(1, 3, 5, 6), 2), //1
        Pair(intArrayOf(1, 3, 5, 6), 7), //4,
        Pair(intArrayOf(1), 0) // 0
    )
    inputs.forEach { println(searchInsert(it.first, it.second)) }
}


fun searchInsert(nums: IntArray, target: Int): Int {
    return search(nums, target, low = 0, high = nums.size - 1)
}

private fun search(nums: IntArray, target: Int, low: Int, high: Int): Int {
    if (low > high) {
        return low
    }
    val middle = low + (high - low) / 2

    return when {
        nums[middle] == target -> middle
        nums.size == 1 -> if (target > nums[0]) low + 1 else low
        nums[middle] < target -> search(nums, target, middle + 1, high)
        else -> search(nums, target, low, middle - 1)
    }
}