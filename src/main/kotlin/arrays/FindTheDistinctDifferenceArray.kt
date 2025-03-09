package arrays

/**
 * You are given a 0-indexed array nums of length n.
 * The distinct difference array of nums is an array diff of length n such that diff[i] is equal
 * to the number of distinct elements in the suffix nums[i + 1, ..., n - 1] subtracted from the number
 * of distinct elements in the prefix nums[0, ..., i]. Return the distinct difference array of nums.
 *
 * Note that nums[i, ..., j] denotes the subarray of nums starting at index i and ending at index j inclusive.
 * Particularly, if i > j then nums[i, ..., j] denotes an empty subarray.
 *
 * Example: Input: nums = [1,2,3,4,5]. Output: [-3,-1,1,3,5]
 *
 * Constraints:
 * 1 <= n == nums.length <= 50
 * 1 <= nums[i] <= 50
 *
 * Source: https://leetcode.com/problems/find-the-distinct-difference-array/description/?envType=problem-list-v2&envId=array
 */
fun distinctDifferenceArray(nums: IntArray): IntArray {
    val res = IntArray(nums.size)

    val leftSet = mutableSetOf<Int>()

    for (i in nums.indices) {
        leftSet.add(nums[i])
        val sizeRight = (nums.drop(i + 1).toSet().size)
        res[i] = leftSet.size - sizeRight
    }
    return res
}

fun distinctDifferenceArrayV2(nums: IntArray): IntArray {
    val res = IntArray(nums.size)

    val freqMap = HashMap<Int, MutableSet<Int>>()
    for (i in nums.indices) {
        val set = freqMap.getOrPut(nums[i], { mutableSetOf<Int>() })
        set.add(i)
    }

    val leftSet = mutableSetOf<Int>()
    val rightSet = nums.toMutableSet()

    for (i in nums.indices) {
        leftSet.add(nums[i])

        val freq = freqMap[nums[i]] ?: emptySet()
        if (i in freq && i >= freq.last()) {
            rightSet.remove(nums[i])
        }

        res[i] = leftSet.size - rightSet.size
    }
    return res
}

fun distinctDifferenceArrayV3(nums: IntArray): IntArray {
    val n = nums.size
    val res = IntArray(nums.size)

    val rightSet = mutableSetOf<Int>()
    val suffixCounts = IntArray(n + 1)

    for (i in n - 1 downTo 0) {
        rightSet.add(nums[i])
        suffixCounts[i] = rightSet.size
    }

    val leftSet = mutableSetOf<Int>()
    for (i in nums.indices) {
        leftSet.add(nums[i])
        res[i] = leftSet.size - suffixCounts[i + 1]
    }
    return res
}