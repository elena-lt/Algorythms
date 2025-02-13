package arrays

/**
 * Given two arrays of integers nums and index. Your task is to create target array under the following rules:
 *
 * Initially target array is empty.
 * From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
 * Repeat the previous step until there are no elements to read in nums and index.
 * Return the target array.
 *
 * It is guaranteed that the insertion operations will be valid.
 *
 * Example: Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]. Output: [0,4,1,3,2]
 *
 * Constraints:
 * 1 <= nums.length, index.length <= 100
 * nums.length == index.length
 * 0 <= nums[i] <= 100
 * 0 <= index[i] <= i
 *
 * Source: https://leetcode.com/problems/create-target-array-in-the-given-order/description/?envType=problem-list-v2&envId=array
 */
fun createTargetArray(nums: IntArray, index: IntArray): IntArray {
    val res = mutableListOf<Int>()
    for (i in nums.indices) {
        res.add(index[i], nums[i])
    }
    return res.toIntArray()
}